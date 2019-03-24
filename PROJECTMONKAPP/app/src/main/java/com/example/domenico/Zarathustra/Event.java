package com.example.domenico.Zarathustra;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;

public class Event extends AppCompatActivity {
    ImageButton addTime;
    ImageButton addDate;
    EditText content, titolo;
    TextView dateTime;
    public Context c;
    private DatePickerDialog.OnDateSetListener mDataSetListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        addTime=findViewById(R.id.addTime);
        content= findViewById(R.id.content);
        titolo=findViewById(R.id.titolo);
        dateTime=findViewById(R.id.dateTime);

        addDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        c,
                        android.R.style.Theme_Material_Light_Dialog,
                        mDataSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
                dialog.show();

                mDataSetListener = new DatePickerDialog.OnDateSetListener(){
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day){
                        String data = "" + day + "/" + month + "/" + year;
                        dateTime.setText(data);
                    }
                };

            }
        });

    }
}
