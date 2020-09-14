package com.example.menusampledemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button showpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showpp = findViewById(R.id.btnpop);
        showpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, showpp);
                popup.getMenuInflater().inflate(R.menu.menu, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this, "You Cliked :" + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popup.show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.hi:
                Toast.makeText(this, "Hello 1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.hi2:
                Toast.makeText(this, "Hello 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.hi3:
                Toast.makeText(this, "Hello 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.hi4:
                Toast.makeText(this, "Hello 4", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }


}




