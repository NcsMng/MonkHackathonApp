package com.example.domenico.Zarathustra;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class Date extends AppCompatActivity implements View.OnClickListener, TimePickerDialog.OnTimeSetListener {

    private TextView b1;
    private DatePickerDialog.OnDateSetListener mDataSetListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.date);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.date:
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        MainActivity.this,
                        android.R.style.Theme_Material_Light_Dialog,
                        mDataSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
                dialog.show();

                mDataSetListener = new DatePickerDialog.OnDateSetListener(){
                    @Override
                    public void onDateSet(DatePicker datePicker,int year,int month,int day){
                        // PRENDERE I DATI ANNO MESE E GIORNO
                    }
                };

                DialogFragment timepicker = new com.example.domenico.datapicker.TimePicker();
                timepicker.show(getSupportFragmentManager(),"Time Picker");

        }
    }

    @Override
    public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
        //QUESTI SONO I MIEI MINUTI E LE MIE ORE;
    }
}