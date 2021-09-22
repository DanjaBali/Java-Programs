package techforward.al.com.good_fortune_reality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Get_Start extends AppCompatActivity {
private Button Get_Started;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_start);

        init();
        initlistners();

    }

    public void init(){

        Get_Started = (Button) findViewById(R.id.GetStarted);

    }

    public void initlistners(){
        Get_Started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        });
    }
}