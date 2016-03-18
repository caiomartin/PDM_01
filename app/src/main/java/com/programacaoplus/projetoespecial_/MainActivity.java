package com.programacaoplus.projetoespecial_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openSomaDOisNumeros(View view) {
        Intent tela = new Intent(this, somaDoisNumeros.class);
        startActivity(tela);
    }


    public void openareaDoTriangulo(View view) {
        Intent tela = new Intent(this, areaDoTriangulo.class);
        startActivity(tela);
    }

    public void openMediaTresNotas(View view) {
        Intent tela = new Intent(this, MediaTresNotas.class);
        startActivity(tela);
    }

    public void openOperacoesAritimeticas(View view) {
        Intent tela = new Intent(this, operacoesAritimeticas.class);
        startActivity(tela);
    }

    public void openAliquotaIr(View view) {
        Intent tela = new Intent(this, aliquotaIr.class);
        startActivity(tela);
    }





}