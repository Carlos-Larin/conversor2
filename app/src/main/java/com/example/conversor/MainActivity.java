package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TabHost tbh;
    Spinner spn;
    TextView tempVal;
    Button btn;
    conversores miObj = new conversores();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbh= findViewById(R.id.TbhConversores);
        tbh.setup();
        tbh.addTab(tbh.newTabSpec("MON").setContent(R.id.tabMonedas).setIndicator("Monedas",null));
        tbh.addTab(tbh.newTabSpec("MAS").setContent(R.id.tabMasa).setIndicator("Masa",null));
        tbh.addTab(tbh.newTabSpec("VOL").setContent(R.id.tabVolumen).setIndicator("Volumen",null));
        tbh.addTab(tbh.newTabSpec("LON").setContent(R.id.tabLongitud).setIndicator("Longitud",null));
        tbh.addTab(tbh.newTabSpec("ALM").setContent(R.id.tabAlmacenamiento).setIndicator("Almacenamiento",null));
        tbh.addTab(tbh.newTabSpec("TEM").setContent(R.id.tabTiempo).setIndicator("Tiempo",null));
        tbh.addTab(tbh.newTabSpec("TRA").setContent(R.id.tabTransferenciaDeDatos).setIndicator("Transferencia de datos",null));

        btn=findViewById(R.id.btnConvertirLongitud);
        btn.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                spn=findViewById(R.id.spnDeLongitud);
                int de = spn.getSelectedItemPosition();

                spn=findViewById(R.id.spnADeLongitud);
                int a =spn.getSelectedItemPosition();

                tempVal=findViewById(R.id.txtCantidadLongitud);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double  respuesta = miObj.convertir(0,de,a,cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta "+ respuesta, Toast.LENGTH_SHORT).show();
            }
        });

        btn=findViewById(R.id.btnConvertirAlmacenmiento);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn=findViewById(R.id.spnAAlmacenamiento);
                int de = spn.getSelectedItemPosition();

                spn=findViewById(R.id.spnDeAlmacenamiento);
                int a =spn.getSelectedItemPosition();

                tempVal=findViewById(R.id.txtCantidadAlmacenamiento);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double  respuesta = miObj.convertir(1,de,a,cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta "+ respuesta, Toast.LENGTH_SHORT).show();
            }
        });

        btn=findViewById(R.id.btnConvertirMonedas);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn=findViewById(R.id.spnDeMonedas);
                int de = spn.getSelectedItemPosition();

                spn=findViewById(R.id.spnAMonedas);
                int a =spn.getSelectedItemPosition();

                tempVal=findViewById(R.id.txtCantidadMonedas);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double  respuesta = miObj.convertir(2,de,a,cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta "+ respuesta, Toast.LENGTH_SHORT).show();
            }
        });

        btn=findViewById(R.id.btnConvertirMasa);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn=findViewById(R.id.spnADeMasa);
                int de = spn.getSelectedItemPosition();

                spn=findViewById(R.id.spnDeMasa);
                int a =spn.getSelectedItemPosition();

                tempVal=findViewById(R.id.txtCantidadMasa);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double  respuesta = miObj.convertir(3,de,a,cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta "+ respuesta, Toast.LENGTH_SHORT).show();
            }
        });

        btn=findViewById(R.id.btnConvertirVolumen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn=findViewById(R.id.spnAVolumen);
                int de = spn.getSelectedItemPosition();

                spn=findViewById(R.id.spnDeVolumen);
                int a =spn.getSelectedItemPosition();

                tempVal=findViewById(R.id.txtCantidadVolumen);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double  respuesta = miObj.convertir(4,de,a,cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta "+ respuesta, Toast.LENGTH_SHORT).show();
            }
        });

        btn=findViewById(R.id.btnConvertirTiempo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn=findViewById(R.id.spnADeTiempo);
                int de = spn.getSelectedItemPosition();

                spn=findViewById(R.id.spnDetiempo);
                int a =spn.getSelectedItemPosition();

                tempVal=findViewById(R.id.txtCantidadTiempo);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double  respuesta = miObj.convertir(5,de,a,cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta "+ respuesta, Toast.LENGTH_SHORT).show();
            }
        });
        btn=findViewById(R.id.btnConvertirTransferenciaDeDatos);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn=findViewById(R.id.spnADeTransferenciaDeDatos);
                int de = spn.getSelectedItemPosition();

                spn=findViewById(R.id.spnDeTransferenciaDeDatos);
                int a =spn.getSelectedItemPosition();

                tempVal=findViewById(R.id.txtCantidadTransferenciaDeDatos);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double  respuesta = miObj.convertir(6,de,a,cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta:"+ respuesta, Toast.LENGTH_SHORT).show();
            }
        });


    }
}

class conversores{
    double[][] valores ={
            {1,100,39.3701,3.28084,1.193,1.09361,0.001,0.000621371},
            {1,8, 1024, 1.048576, 1.073741824, 1.0995116277761, 125.899906842624, 1.152921504606846976, 1.180591620717411303424, 1.208925819614629174706176},
            {1,0.93,7.80,24.65,516.25,8.74},
            {1,1000,453.592,28.3495,0.001,100000,1000000},
            {1,1000000,28316.8,16.3871,764555},
            {1,60,3600,86400,604800,31536000},
            {1000,1000000,1000000000,1000000000000.00},
    };
    public double convertir(int opcion,int de, int a, double cantidad){
        return valores[opcion][a]/valores[opcion][de]*cantidad;
    }
};