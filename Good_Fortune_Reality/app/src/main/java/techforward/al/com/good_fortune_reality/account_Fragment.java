package techforward.al.com.good_fortune_reality;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class account_Fragment extends Fragment {

    private FirebaseUser Users;
    private DatabaseReference reference;
    private String userID;
    private static final String USERS = "Users";
    private TextView profilFullName, ProfileAddressEmail;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_account_, container, false);

        init();
        ProfileAccount();

    return view;
    }

    public void init(){
        profilFullName = (TextView) view.findViewById(R.id.profilFullName);
        ProfileAddressEmail = (TextView) view.findViewById(R.id.ProfileAddressEmail);
    }

    public void ProfileAccount(){
        Users = FirebaseAuth.getInstance().getCurrentUser();
        reference= FirebaseDatabase.getInstance().getReference(USERS);
        userID = Users.getUid();

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);
                // setContentView( R.layout.profil_fragment);
                if(userProfile != null){
                    String fullName = userProfile.getFullName();
                    String email =userProfile.getEmail();

                    profilFullName.setText(fullName);
                    ProfileAddressEmail.setText(email);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getActivity(), "Something wrong happened!", Toast.LENGTH_LONG).show();
            }
        });
    }
}