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
        {
            @Override
            public void onClick(View v) {


            }
        });
        mBotonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
