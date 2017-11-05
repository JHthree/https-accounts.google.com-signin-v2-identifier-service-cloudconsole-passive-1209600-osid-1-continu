package scumbhackathon.lifeisruff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SearchActivity extends AppCompatActivity {

    String[] mobileArray = {"Ashes, \nGilroy, CA","Lucinda, \nSata Cruz, CA","Sheila, \nSalinas, CA","Dexter, \nFelton, CA",
            "Fluffy the Destroyer, \nMonterey, CA","Rex, \nMarina, CA","Daisy Bell, \nSeaside, CA","Spot, \nMonterey, CA",
            "nothing\narizona", "death \n everywhere"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_item, mobileArray);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    public void moveLostForm(View view) {
        Intent startNewActivity = new Intent(this, LostActivity.class);
        startActivity(startNewActivity);
    }

    public void moveFoundForm(View view) {
        Intent startNewActivity = new Intent(this, FoundActivity.class);
        startActivity(startNewActivity);
    }

    public void moveMap(View view) {
        Intent startNewActivity = new Intent(this, MapsActivity.class);
        startActivity(startNewActivity);
    }

    // override other abstract methods here






}
