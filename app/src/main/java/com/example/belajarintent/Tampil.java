package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tampil extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        textView = (TextView) findViewById(R.id.tampil);
        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("name");
        String nim = bundle.getString("nim");
        String jurusan = bundle.getString("jurusan");
        String kelas = bundle.getString("kelas");
        String ipk = bundle.getString("ipk");
        String mk1 = bundle.getString("mk1");
        String mk2 = bundle.getString("mk2");
        Double rata2 = bundle.getDouble("rata2");

        textView.setText("Nama : " + nama + "\nNIM : " + nim + "\nJurusan : " + jurusan + "\nKelas : " + kelas + "\nIPK : " +  ipk + "\nNiali MK1 : " + mk1 + "\nNilai MK2 : " + mk2 + "\nRata-rata nilai : " + rata2);

    }
}