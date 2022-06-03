package com.example.a201b357_alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_km)
                .setTitle("Be Alert!!")
                .setMessage("Follow social Distancing")
                .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Be Alert !!",Toast.LENGTH_SHORT).show();
                    }
                }).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}