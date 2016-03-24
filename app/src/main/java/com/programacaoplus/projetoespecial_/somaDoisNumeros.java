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

import java.text.DecimalFormat;

public class somaDoisNumeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma_dois_numeros);
        Onclic();
    }

    public void Onclic(){
        final Button cal = (Button)findViewById(R.id.calcular);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText n1 = (EditText) findViewById(R.id.n1);
                EditText n2 = (EditText) findViewById(R.id.n2);

                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();

                TextView res = (TextView) findViewById(R.id.resultado);

                if (verifica(s1, s2)) {
                    res.setText("Preenche os campos!");
                } else {

                    double num1 = Double.parseDouble(n1.getText().toString());
                    double num2 = Double.parseDouble(n2.getText().toString());

                    double soma;
                    soma = num1 + num2;
                    DecimalFormat df = new DecimalFormat("0.0");
                    res.setText("Soma: " + df.format(soma));
                }
            }
        });
    }


    public void voltar(View view) {
        Intent tela = new Intent(this, MainActivity.class);
        startActivity(tela);
    }

    public boolean verifica(String s1, String s2){
        if(s1.equals("") || s2.equals(""))
            return true;
        else
            return false;
    }
}
