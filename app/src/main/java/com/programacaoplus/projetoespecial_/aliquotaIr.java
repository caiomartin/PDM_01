package com.programacaoplus.projetoespecial_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class aliquotaIr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aliquota_ir);
        aliquota();
    }


    public void aliquota(){
        final Button cal = (Button)findViewById(R.id.calcular);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText n1 = (EditText) findViewById(R.id.salario);

                String s1 = n1.getText().toString();

                TextView res = (TextView) findViewById(R.id.resultado);

                if (verifica(s1)) {
                    res.setText("Preenche os campos!");
                }else{

                    int num1 = Integer.parseInt(n1.getText().toString());

                    if(num1 < 1903.99){
                        res.setText("Isento");
                    }else if((num1 >= 1903.99) && (num1 < 2826.66)){
                        res.setText("7,5% do salário bruto");
                    }else if((num1 >= 2826.66) && (num1 < 3751.06)){
                        res.setText("15% do salário bruto");
                    }else if((num1 >= 3751.06) && (num1 < 4664.69)){
                        res.setText("22,5% do salário bruto");
                    }else if(num1 >= 4664.69){
                        res.setText("27,5% do salário bruto");
                    }
                }
            }
        });
    }


    public boolean verifica(String s1){
        if(s1.equals(""))
            return true;
        else
            return false;
    }
}
