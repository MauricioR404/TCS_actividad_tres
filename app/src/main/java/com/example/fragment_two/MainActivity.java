package com.example.fragment_two;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements fragment_list.Enlace{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void mostrar(int item) {
        fragment_detalle detalle_equipo=(fragment_detalle)getSupportFragmentManager().findFragmentById(R.id.f_detalle);
        if(detalle_equipo!=null) {
            detalle_equipo.detalle(item);
        }
    }
}