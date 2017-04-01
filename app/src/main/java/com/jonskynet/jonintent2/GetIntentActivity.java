package com.jonskynet.jonintent2;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GetIntentActivity extends FragmentActivity implements OnMapReadyCallback {
    public static final String EXTRA_MESSAGE = "message";
    public static final String EXTRA_MESSAGE2 = "message2";
    public static final String EXTRA_MESSAGE3 = "message3";
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_intent);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
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





       // LatLng sydney = new LatLng(Double.toString"message1","message2" );
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        String messageText2 = intent.getStringExtra(EXTRA_MESSAGE2);
        String messageText3 = intent.getStringExtra(EXTRA_MESSAGE3);
        double message2 = Double.parseDouble(messageText2);

        double message3 = Double.parseDouble(messageText3);

        LatLng sydney = new LatLng(message2, message3 );



        mMap.addMarker(new MarkerOptions().position(sydney).title(messageText));
       // mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}

