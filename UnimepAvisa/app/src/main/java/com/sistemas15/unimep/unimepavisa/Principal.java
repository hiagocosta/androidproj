package com.sistemas15.unimep.unimepavisa;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Principal extends AppCompatActivity implements View.OnClickListener, FragComunica.OnFragmentInteractionListener, FragTransporte.OnFragmentInteractionListener, FragMapa.OnFragmentInteractionListener, FragOpina.OnFragmentInteractionListener{

    // Declarando componentes gráficos
    ImageButton btnComunica, btnTransporte, btnMapa, btnOpina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        FragComunica fragmento1 = new FragComunica();

        getSupportFragmentManager().beginTransaction().add(R.id.conteudo, fragmento1);

        // Vinculando componentes gráficos
        btnComunica = (ImageButton)findViewById(R.id.btnComunica);
        btnTransporte = (ImageButton)findViewById(R.id.btnTransporte);
        btnMapa = (ImageButton)findViewById(R.id.btnMapa);
        btnOpina = (ImageButton)findViewById(R.id.btnOpina);

        // Ativa o evento Click de todos os botões do View()
        btnComunica.setOnClickListener(this);
        btnTransporte.setOnClickListener(this);
        btnMapa.setOnClickListener(this);
        btnOpina.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Verifica qual botão foi pressionado
        switch (v.getId()){
            case R.id.btnComunica:
                FragComunica fragmento1 = new FragComunica();
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.conteudo, fragmento1);
                transaction1.commit();
                break;
            case R.id.btnTransporte:
                FragTransporte fragmento2 = new FragTransporte();
                FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                transaction2.replace(R.id.conteudo, fragmento2);
                transaction2.commit();
                break;
            case R.id.btnMapa:
                FragMapa fragmento3 = new FragMapa();
                FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                transaction3.replace(R.id.conteudo, fragmento3);
                transaction3.commit();
                break;
            case R.id.btnOpina:
                FragOpina fragmento4 = new FragOpina();
                FragmentTransaction transaction4 = getSupportFragmentManager().beginTransaction();
                transaction4.replace(R.id.conteudo, fragmento4);
                transaction4.commit();
                break;
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
