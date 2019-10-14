package com.example.myproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a101019.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

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

        //Añadir marcador en El Salvador y mover la cámara.
        LatLng elsalvador = new LatLng(-26.25, -69.616667);
        Mapa.addMarker(new MarkerOptions().position(elsalvador).title("Marcador en El Salvador"));
        Mapa.moveCamera(CameraUpdateFactory.newLatLng(elsalvador));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}