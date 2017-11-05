package scumbhackathon.lifeisruff;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(36.682, -121.798);
        mMap.addMarker(new MarkerOptions().position(sydney).title("SCUMB"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    public void moveLostForm(View view) {
        Intent startNewActivity = new Intent(this, LostActivity.class);
        startActivity(startNewActivity);
    }

    public void moveFoundForm(View view) {
        Intent startNewActivity = new Intent(this, FoundActivity.class);
        startActivity(startNewActivity);
    }

    public void moveSearch(View view) {
        Intent startNewActivity = new Intent(this, SearchActivity.class);
        startActivity(startNewActivity);
    }

}
