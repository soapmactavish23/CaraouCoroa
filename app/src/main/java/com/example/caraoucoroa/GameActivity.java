package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    private ImageView imgRes;
    private ImageButton btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        imgRes = (ImageView) findViewById(R.id.imgRes);
        btnVoltar = (ImageButton) findViewById(R.id.btnVoltar);

        Bundle bundle = getIntent().getExtras();
        String resultado = bundle.getString("res");

        if (resultado.equals("cara")){
            imgRes.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
        }else{
            imgRes.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
