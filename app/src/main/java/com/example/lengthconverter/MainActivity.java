package com.example.lengthconverter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Spinner spin1;
    EditText editText;
    TextView M1, MM1, CM1, YD1, KM1, IN1, FT1;
    Button button;
    DecimalFormat df = new DecimalFormat("0.00000");

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText1);
        button = findViewById(R.id.button);
        spin1 = findViewById(R.id.spin);
        M1 = findViewById(R.id.M1);
        MM1 = findViewById(R.id.MM1);
        CM1 = findViewById(R.id.CM1);
        YD1 = findViewById(R.id.YD1);
        KM1 = findViewById(R.id.KM1);
        IN1 = findViewById(R.id.IN1);
        FT1 = findViewById(R.id.FT1);
        String[] list = {"CM", "M", "KM", "MM", "YD", "IN", "FT"};
        ArrayAdapter<String> length = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, list);
        spin1.setAdapter(length);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double M, CM, YD, IN, KM, MM, FT;
                Double Value = Double.parseDouble(editText.getText().toString());
                if (spin1.getSelectedItem() == "CM") {    //  cenimeter
                    M = Value / 100;
                    MM = Value * 10;
                    CM = Value;
                    YD = Value / 91.44;
                    KM = Value / 100000;
                    IN = Value / 2.54;
                    FT = Value / 30.48;
                    M1.setText(df.format(M) + " ");
                    MM1.setText(df.format(MM) + " ");
                    CM1.setText(CM + " ");
                    YD1.setText(df.format(YD) + " ");
                    KM1.setText(df.format(KM) + " ");
                    IN1.setText(df.format(IN) + " ");
                    FT1.setText(df.format(FT) + " ");
                }
                if (spin1.getSelectedItem() == "M") {   //Meter
                    M = Value;
                    MM = Value * 1000;
                    CM = Value * 100;
                    YD = Value * 1.094;
                    KM = Value / 1000;
                    IN = Value * 39.37;
                    FT = Value * 3.281;
                    M1.setText(M + " ");
                    MM1.setText(df.format(MM) + " ");
                    CM1.setText(df.format(CM) + " ");
                    YD1.setText(df.format(YD) + " ");
                    KM1.setText(df.format(KM) + " ");
                    IN1.setText(df.format(IN) + " ");
                    FT1.setText(df.format(FT) + " ");
                }
                if (spin1.getSelectedItem() == "MM") {   //MilliMeter
                    M = Value / 1000;
                    MM = Value;
                    CM = Value / 10;
                    YD = Value / 914.4;
                    KM = Value / 1000000;
                    IN = Value / 25.4;
                    FT = Value / 304.8;
                    M1.setText(df.format(M) + " ");
                    MM1.setText(MM + " ");
                    CM1.setText(df.format(CM) + " ");
                    YD1.setText(df.format(YD) + " ");
                    KM1.setText(df.format(KM) + " ");
                    IN1.setText(df.format(IN) + " ");
                    FT1.setText(df.format(FT) + " ");
                }
                if (spin1.getSelectedItem() == "KM") {   //KiloMeter
                    M = Value * 1000; //
                    MM = Value * 1000000;//
                    CM = Value * 100000;//
                    YD = Value * 1093.613298;//
                    KM = Value;
                    IN = Value * 39370;
                    FT = Value * 3281;
                    M1.setText(df.format(M) + " ");
                    MM1.setText(df.format(MM) + " ");
                    CM1.setText(df.format(CM) + " ");
                    YD1.setText(df.format(YD) + " ");
                    KM1.setText(KM + " ");
                    IN1.setText(df.format(IN) + " ");
                    FT1.setText(df.format(FT) + " ");
                }
                if (spin1.getSelectedItem() == "YD") {   //Yd
                    M = Value / 1.094; //
                    MM = Value * 914.4;//
                    CM = Value * 91.44;//
                    YD = Value;//
                    KM = Value / 1094;
                    IN = Value * 36;
                    FT = Value * 3;
                    M1.setText(df.format(M) + " ");
                    MM1.setText(df.format(MM) + " ");
                    CM1.setText(df.format(CM) + " ");
                    YD1.setText(YD + " ");
                    KM1.setText(df.format(KM) + " ");
                    IN1.setText(df.format(IN) + " ");
                    FT1.setText(df.format(FT) + " ");
                }
                if (spin1.getSelectedItem() == "IN") {   //NIN
                    M = Value / 39.37;
                    MM = Value * 25.4;
                    CM = Value * 2.54;
                    YD = Value / 36;
                    KM = Value / 39370;
                    IN = Value;
                    FT = Value / 12;
                    M1.setText(df.format(M) + " ");
                    MM1.setText(df.format(MM) + " ");
                    CM1.setText(df.format(CM) + " ");
                    YD1.setText(df.format(YD) + " ");
                    KM1.setText(df.format(KM) + " ");
                    IN1.setText(IN + " ");
                    FT1.setText(df.format(FT) + " ");
                }
                if (spin1.getSelectedItem() == "FT") {   //ft
                    M = Value / 3.281;
                    MM = Value * 304.8;
                    CM = Value * 30.48;
                    YD = Value / 3;
                    KM = Value / 3281;
                    IN = Value * 12;
                    FT = Value;
                    M1.setText(df.format(M) + " ");
                    MM1.setText(df.format(MM) + " ");
                    CM1.setText(df.format(CM) + " ");
                    YD1.setText(df.format(YD) + " ");
                    KM1.setText(df.format(KM) + " ");
                    IN1.setText(IN + " ");
                    FT1.setText(FT + " ");
                }
                Toast.makeText(MainActivity.this, "Thanks For using this app", Toast.LENGTH_SHORT).show();
            }
        });
    }
}