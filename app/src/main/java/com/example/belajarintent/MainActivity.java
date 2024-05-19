package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText nama, nim, ipk, mk1, mk2;
    RadioGroup jurusan;
    CheckBox kelasA, kelasB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.name);
        nim = findViewById(R.id.nim);
        jurusan = findViewById(R.id.jurusan);
        kelasA = findViewById(R.id.kelasA);
        kelasB = findViewById(R.id.kelasB);
        ipk = findViewById((R.id.ipk));
        mk1 = findViewById(R.id.mk1);
        mk2 = findViewById(R.id.mk2);

    }

    public void WithPutMain(View view) {
        Intent explisit = new Intent(this, Tampil.class);
        explisit.putExtra("nim", nim.getText().toString());
        explisit.putExtra("name", nama.getText().toString());
        explisit.putExtra("ipk", ipk.getText().toString());
        explisit.putExtra("mk1", mk1.getText().toString());
        explisit.putExtra("mk2", mk2.getText().toString());

//        Jurusan
        int seletedId = jurusan.getCheckedRadioButtonId();
        RadioButton selectedJurusan = findViewById(seletedId);
        if (selectedJurusan != null) {
            explisit.putExtra("jurusan", selectedJurusan.getText().toString());
        }

//        Kelas
        String kelas = "";
        if(kelasA.isChecked()){
            kelas += "Kelas A";
        }
        if(kelasB.isChecked()){
            kelas += "Kelas B";
        }
        explisit.putExtra("kelas", kelas.trim());

//        Hitung Niali rata" Mk

        double nilaiMk1 = Double.parseDouble(mk1.getText().toString());
        double nilaiMk2 = Double.parseDouble(mk2.getText().toString());
        double rata2 = (nilaiMk1 + nilaiMk2) / 2;
        explisit.putExtra("rata2", rata2);

        startActivity(explisit);
    }
}