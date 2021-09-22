package techforward.al.com.good_fortune_reality;

//import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;

public class Dashboard extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FrameLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        init();
        BottomNavigationV();
    }
    private void init(){
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomNavigationView);
        myLayout = findViewById(R.id.myLayout);

    }

    private void BottomNavigationV() {
        getSupportFragmentManager().beginTransaction().replace(R.id.myLayout, new search_Fragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);

    }
// Four fragments
    private BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.search:
                    selectedFragment = new search_Fragment();
                    break;
                case R.id.invest:
                    selectedFragment = new calculate_Fragment();
                    break;
                case R.id.mag:
                    selectedFragment = new magazine_Fragment();
                    break;
                case R.id.Accaunt:
                    selectedFragment = new account_Fragment();
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.myLayout, selectedFragment).commit();
            return true;
        }
    };
}