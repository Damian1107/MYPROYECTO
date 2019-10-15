package com.example.myproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Main extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap Map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    public void onMapReady(GoogleMap googleMap) {
        Map = googleMap;


        LatLng arica = new LatLng(-18.4745998, -70.2979202);
        Map.addMarker(new MarkerOptions().position(arica).title("Calama"));
        Map.moveCamera(CameraUpdateFactory.newLatLng(arica));
        CameraPosition cameraPosition = CameraPosition.builder()
                .target(arica)
                .zoom(16)
                .build();

        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}