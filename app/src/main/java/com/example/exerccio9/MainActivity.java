package com.example.exerccio9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_Calcular;
    EditText txt_SalarioMinimo,txt_QuantQw;
    TextView txt_Resultado1,txt_Resultado2,txt_Resultado3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Calcular.findViewById(R.id.btn_calcular);
        txt_SalarioMinimo.findViewById(R.id.txt_salarioMinimo);
        txt_QuantQw.findViewById(R.id.txt_quantQW);
        txt_Resultado1.findViewById(R.id.txt_resultado1);
        txt_Resultado2.findViewById(R.id.txt_resultado2);
        txt_Resultado3.findViewById(R.id.txt_resultado3);

        btn_Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a,b,c,salario,Qw,desconto;
                salario=Float.parseFloat(txt_SalarioMinimo.getText().toString());
                Qw=Float.parseFloat(txt_QuantQw.getText().toString());
                a=salario/5;
                txt_Resultado1.setText(String.valueOf(a));
                b=a*Qw;
                txt_Resultado3.setText(String.valueOf(b));
                desconto=b*15/100;
                c=b-desconto;
                txt_Resultado3.setText(String.valueOf(c));
                }
        });
    }
}