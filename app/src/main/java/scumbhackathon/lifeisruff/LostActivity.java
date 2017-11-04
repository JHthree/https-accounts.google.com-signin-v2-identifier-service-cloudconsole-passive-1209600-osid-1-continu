package scumbhackathon.lifeisruff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);
    }

    public void moveFoundForm(View view) {
        Intent startNewActivity = new Intent(this, FoundActivity.class);
        startActivity(startNewActivity);
    }

    public void moveMap(View view) {
        Intent startNewActivity = new Intent(this, MapsActivity.class);
        startActivity(startNewActivity);
    }

    public void moveSearch(View view) {
        Intent startNewActivity = new Intent(this, SearchActivity.class);
        startActivity(startNewActivity);
    }
}
