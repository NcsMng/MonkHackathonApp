package com.example.domenico.Zarathustra;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;

import com.example.domenico.Zarathustra.backend.server.tables.AlertPost;

import java.util.ArrayList;

public class Message_Wall extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message__wall);

    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(context, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.warning:
                return true;
            case R.id.event:
                return true;
            case R.id.suggestion:
                return true;
            default:
                return false;
        }

    }
}
