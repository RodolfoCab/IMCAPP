package com.example.roxanacabmartnez.imcapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Roxana Cab Martínez on 26/10/2017.
 */

public class ImcFragment  extends Fragment{
    private EditText mCampopeso,mCampoestatura;
    private Button mBotonCalcular, mBotonLimpiar;
    private TextView etiquetaImc, estado;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

            View v =inflater.inflate(R.layout.fragmento_imc, container, false);
            mCampopeso=(EditText)v.findViewById(R.id.campo_peso);
            mCampoestatura =(EditText)v.findViewById(R.id.campo_estatura);
            mBotonCalcular =(Button)v.findViewById(R.id.boton_calcular);
            mBotonLimpiar =(Button)v.findViewById(R.id.boton_limpiar);
            etiquetaImc=(TextView)v.findViewById(R.id.etiqueta_imc);
            estado=(TextView)v.findViewById(R.id.estado);
            mBotonCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String a = mCampopeso .getText().toString();
                    double peso = Double.parseDouble(a);
                    a = mCampoestatura .getText().toString();
                    double estatura = Double.parseDouble(a);
                    double imc = peso /(estatura * estatura);
                    a = String.format("%2.2f",imc);
                    etiquetaImc.setText(a);
                    estado.setText(a);

                    if (imc  <18.5){
                        estado.setText("Tiene Peso Bajo");
                    }else{
                        if (imc <24.99){
                            estado.setText("Tiene Peso Normal");
                        }else{
                            if (imc <29.99){
                                estado.setText("Tiene Sobre Peso");
                            }else{
                                if (imc  <39.99){
                                    estado.setText("Tiene Obesidad");
                                }else{
                                    estado.setText("Tiene Obesidad Extrema");
                                }
                            }
                        }
                    }
                }
            });
            mBotonLimpiar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mCampopeso.setText("");
                    mCampoestatura.setText("");
                    etiquetaImc.setText("0");
                }
            });
            return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
