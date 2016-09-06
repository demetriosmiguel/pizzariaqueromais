package com.example.demtriosmiguel.pizzariaqueromais;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView promocaoA;
    private ImageView promocaoB;
    private ImageView promocaoC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        promocaoA = (ImageView) findViewById(R.id.promocaoUmId);
        promocaoB = (ImageView) findViewById(R.id.promocaoDoisId);
        promocaoC = (ImageView) findViewById(R.id.promocaoTresId);

        promocaoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent telaPedidos = new Intent(MainActivity.this, Pedido.class);
                startActivity(telaPedidos);

            }
        });

        promocaoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent telaPedidos = new Intent(MainActivity.this, Pedido.class);
                startActivity(telaPedidos);

            }
        });

        promocaoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent telaPedidos = new Intent(MainActivity.this, Pedido.class);
                startActivity(telaPedidos);

            }
        });


    }
}
