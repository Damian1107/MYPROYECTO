package com.example.myproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.MYPROYECTO.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Main extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap Mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    public void onMapReady(GoogleMap googleMap) {
        Mapa = googleMap;


        LatLng calama = new LatLng(-22.4566708, -68.9237137);
        Mapa.addMarker(new MarkerOptions().position(calama).title("Calama"));
        Mapa.moveCamera(CameraUpdateFactory.newLatLng(calama));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}