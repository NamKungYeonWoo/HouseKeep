package matt.housekeep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent activityIntent;
        activityIntent = new Intent(this, LoginActivity.class);

        startActivity(activityIntent);
        finish();
        //setContentView(R.layout.activity_main);

    }
}
