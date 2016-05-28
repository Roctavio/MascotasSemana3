package com.example.manager.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class Mascotas extends AppCompatActivity
{
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    ImageView estrella, imgStar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);

        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        //estrella = (ImageView) findViewById(R.id.estrella);
        imgStar = (ImageView) findViewById(R.id.imgStar);

        //LayoutManager para el Recycler
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        /*estrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Mascotas.this, MascotasOrdenadas.class);
                startActivity(i);
            }
        });*/

        imgStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Mascotas.this, MascotasOrdenadas.class);
                startActivity(i);
                //Log.i("INFOOOOOO::::","Presionado estrella");
            }
        });

    }

    public void inicializarAdaptador()
    {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas()
    {
        mascotas = new ArrayList<Mascota>();

        //mascotas.add(new Mascota(R.drawable.perro1,"Pancho", "0"));
        mascotas.add(new Mascota(R.drawable.perro2,"Rita", "3"));
        mascotas.add(new Mascota(R.drawable.perro3,"Fibo", "2"));
        mascotas.add(new Mascota(R.drawable.perro4,"Bruno", "4"));
        mascotas.add(new Mascota(R.drawable.perro5,"Neska", "7"));
        mascotas.add(new Mascota(R.drawable.perro6,"Neska", "2"));
        mascotas.add(new Mascota(R.drawable.perro7,"Neska", "0"));

        //Toast.makeText(this,mascotas.size(),Toast.LENGTH_SHORT).show();
        //Log.i("INDICDOR:::: ", (String)mascotas.size());
    }

    public void mascotasOrdenadas()
    {
        //Intent i = new Intent(Mascotas.this, MascotasOrdenadas.class);
        //startActivity(i);

        Log.i("INFOOOOOO::::","Presionado estrella");
    }
}
