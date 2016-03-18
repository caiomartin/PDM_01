package com.programacaoplus.projetoespecial_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class operacoesAritimeticas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacoes_aritimeticas);
        soma();
        subtracao();
        divisao();
        multiplicacao();
    }

    public void soma(){
        final Button cal = (Button)findViewById(R.id.soma);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText n1 = (EditText) findViewById(R.id.n1);
                EditText n2 = (EditText) findViewById(R.id.n2);

                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();

                TextView res = (TextView) findViewById(R.id.resultado);

                if(verifica(s1,s2)){
                    res.setText("Preenche os campos!");
                }else {

                    int num1 = Integer.parseInt(n1.getText().toString());
                    int num2 = Integer.parseInt(n2.getText().toString());

                    int soma;
                    soma = num1 + num2;
                    res.setText("Resultado:" + soma);
                }
            }
        });
    }

    public void subtracao(){
        final Button cal = (Button)findViewById(R.id.subtracao);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText n1 = (EditText) findViewById(R.id.n1);
                EditText n2 = (EditText) findViewById(R.id.n2);

                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();

                TextView res = (TextView) findViewById(R.id.resultado);

                if(verifica(s1,s2)){
                    res.setText("Preenche os campos!");
                }else {

                    int num1 = Integer.parseInt(n1.getText().toString());
                    int num2 = Integer.parseInt(n2.getText().toString());

                    int soma;
                    soma = num1 - num2;
                    res.setText("Resultado:" + soma);
                }
            }
        });
    }

    public void divisao(){
        final Button cal = (Button)findViewById(R.id.divisao);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText n1 = (EditText) findViewById(R.id.n1);
                EditText n2 = (EditText) findViewById(R.id.n2);


                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();

                TextView res = (TextView) findViewById(R.id.resultado);

                if(verifica(s1,s2)){
                    res.setText("Preenche os campos!");
                }else {

                    DecimalFormat df = new DecimalFormat("0.0");

                    Double num1 = Double.parseDouble(s1);
                    Double num2 = Double.parseDouble(s2);

                    double soma;
                    soma = num1 / num2;
                    res.setText("Resultado:" + df.format(soma));
                }
            }
        });
    }

    public void multiplicacao(){
        final Button cal = (Button)findViewById(R.id.multiplicacao);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText n1 = (EditText) findViewById(R.id.n1);
                EditText n2 = (EditText) findViewById(R.id.n2);

                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();

                TextView res = (TextView) findViewById(R.id.resultado);

                if(verifica(s1,s2)){
                    res.setText("Preenche os campos!");
                }else {

                    int num1 = Integer.parseInt(n1.getText().toString());
                    int num2 = Integer.parseInt(n2.getText().toString());

                    int soma;
                    soma = num1 * num2;
                    res.setText("Resultado:" + soma);
                }
            }
        });
    }

    public boolean verifica(String s1, String s2){
        if(s1.equals("") || s2.equals(""))
            return true;
        else
            return false;
    }
}


