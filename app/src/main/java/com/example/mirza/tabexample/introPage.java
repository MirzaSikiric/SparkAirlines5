package com.example.mirza.tabexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class introPage extends AppCompatActivity {

    public ImageButton btnSAlogo;

    public void enter(){
        btnSAlogo = (ImageButton) findViewById(R.id.iBSAlogo);
        btnSAlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent welcome = new Intent(introPage.this, MainActivity.class);

                startActivity(welcome);

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_page);

        enter();
    }
}
