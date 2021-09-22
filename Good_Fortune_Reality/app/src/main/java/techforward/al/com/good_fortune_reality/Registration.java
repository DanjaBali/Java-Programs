package techforward.al.com.good_fortune_reality;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Registration extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks {

    private EditText Signup_Email, Signup_fullName, Signup_phone, Signup_Password;
    private Button registration1;
    private ProgressBar progressBar;
    private CheckBox checkBox;
    GoogleApiClient googleApiClient;
    private FirebaseAuth mAuth;

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        init();
        initlistners();
        Validation();
    }


    private void init() {

        Signup_Email = (EditText) findViewById(R.id.signup_Email);
        Signup_fullName = (EditText) findViewById(R.id.signup_fullName);
        Signup_phone = (EditText) findViewById(R.id.signup_phone);
        Signup_Password = (EditText) findViewById(R.id.signup_Password);

        progressBar = (ProgressBar) findViewById(R.id.progressBar1);

        registration1 = (Button) findViewById(R.id.registration1);

        mAuth = FirebaseAuth.getInstance();  //getting the current instance of the database from the firebase
    }

    private void initlistners() {
        registration1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignUp_();
            }
        });
    }

    public void SignUp_() {
        String Email = Signup_Email.getText().toString().trim();
        String FullName = Signup_fullName.getText().toString().trim();
        String PhoneNumber = Signup_phone.getText().toString().trim();
        String Password = Signup_Password.getText().toString().trim();


        if (Email.isEmpty()) {
            Signup_Email.setError("Email is required!");
            Signup_Email.requestFocus();
            return;
        }

        if (FullName.isEmpty()) {
            Signup_fullName.setError("Full name is required!");
            Signup_fullName.requestFocus();
            return;
        }

        if (PhoneNumber.isEmpty()) {
            Signup_phone.setError("Phone Number is required!");
            Signup_phone.requestFocus();
            return;
        }
        if (Password.isEmpty()) {
            Signup_Password.setError("Password is required!");
            Signup_Password.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
            Signup_Email.setError("Please provide valid Email!");
            Signup_Email.requestFocus();
            return;
        }

        if (Password.length() < 6) {
            Signup_Password.setError("Minimum Password length should be 6 characters!");
            Signup_Password.requestFocus();
            return;
        }

        if (!checkBox.isChecked()) {
            checkBox.setError("Invalid Verification! ");
            checkBox.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        //register the user in the firebase
        // mAuth.createUserWithEmailAndPassword(Email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
        mAuth.createUserWithEmailAndPassword(Signup_Email.getText().toString(), Signup_Password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {
                    String uid = task.getResult().getUser().getUid();

                    User user = new User(uid, Signup_Email.getText().toString(), Signup_fullName.getText().toString(), Signup_phone.getText().toString(), Signup_Password.getText().toString());

                    firebaseDatabase.getReference().child("Users").child(uid).setValue(user);

                    Toast.makeText(Registration.this, "User has been registered successfully", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(), Dashboard.class));
                    progressBar.setVisibility(View.GONE);

                    //redirect to login layaut
                } else {
                    Toast.makeText(Registration.this, "Failed to register! Try again", Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.GONE);
                }
            }
        });
    }

    public void Validation() {
        // Assign variable
        checkBox = (CheckBox) findViewById(R.id.checkBox4);

        // Put siteKey as a string
        String siteKey = "6LfN8vUaAAAAAEqPk3EMivE6L3EMjHD4AgfhJ3NJ";

        // Create a google Api client
        googleApiClient = new GoogleApiClient.Builder(this)
                .addApi(SafetyNet.API)
                .addConnectionCallbacks(Registration.this)
                .build();
        googleApiClient.connect();

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set if condition when checkBox checked
                if (checkBox.isChecked()) {
                    SafetyNet.SafetyNetApi.verifyWithRecaptcha(googleApiClient, siteKey)
                            .setResultCallback(new ResultCallback<SafetyNetApi.RecaptchaTokenResult>() {
                                @Override
                                public void onResult(@NonNull SafetyNetApi.RecaptchaTokenResult recaptchaTokenResult) {
                                    Status status = recaptchaTokenResult.getStatus();
                                    if (status != null && status.isSuccess()) {
                                        //Display Successful Message
                                        Toast.makeText(getApplicationContext(), "Successfully Varified...", Toast.LENGTH_LONG).show();
                                        //Change checkbox text color
                                        checkBox.setTextColor(Color.GREEN);
                                    }
                                }
                            });
                } else {
                    //Default checkbox text color
                    checkBox.setTextColor(Color.BLACK);
                }
            }
        });
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }
}

