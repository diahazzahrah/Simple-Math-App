package com.diah24.mymobileaplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText angka1;
    EditText angka2;
    Spinner spinOperasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        angka1 = (EditText) findViewById(R.id.editPertama);
        angka2 = (EditText) findViewById(R.id.editKedua);
        spinOperasi = (Spinner) findViewById(R.id.spinnerOperasi);
    }
    public void buttonHandler(View view)
    {
        double a, b, hasil;
        if(angka1.getText().length()==0 || angka2.getText().length()==0)
        {
            Toast.makeText(this, "Gagal! Angka pertama ataupun kedua masih kosong!", Toast.LENGTH_LONG).show();
            return;
        }

        //proses konversi
        a = Double.parseDouble(angka1.getText().toString());
        b = Double.parseDouble(angka2.getText().toString());
        //hasil = a+b;

        switch (spinOperasi.getSelectedItemPosition())
        {
            case 0:
                hasil = a+b;
                break;
            case 1:
                hasil = a-b;
                break;
            case 2:
                hasil = a*b;
                break;
            case 3:
                hasil = a/b;
                break;
            case 4:
                hasil = a%b;
                break;
            default:
                hasil = a+b;
                break;
        } //end switch

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Operasi Artimatika : " +spinOperasi.getSelectedItem().toString());
        builder.setMessage("Hasil : "+hasil);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                //TODO Auto-generated method stub
                angka1.setText("");
                angka2.setText("");
                dialog.dismiss();
            }
        });
        AlertDialog dialogHasil = builder.create();
        dialogHasil.show();
    }
}