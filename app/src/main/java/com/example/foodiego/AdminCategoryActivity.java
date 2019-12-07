package com.example.foodiego;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminCategoryActivity extends AppCompatActivity {

    private CardView fruit_button, vegetable_button, bakery_button, dairy_button;
    private Button connect_bluetooth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        fruit_button = (CardView) findViewById(R.id.cardView_fruit);
        vegetable_button = (CardView) findViewById(R.id.cardView_vegetable);
        bakery_button = (CardView) findViewById(R.id.cardView_bakery);
        dairy_button = (CardView) findViewById(R.id.cardView_dairy);
        connect_bluetooth = (Button) findViewById(R.id.bluetooth_connect_button);


        fruit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","fruits");
                startActivity(intent);
            }
        });

        vegetable_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","vegetables");
                startActivity(intent);

            }
        });

        bakery_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","bakery");
                startActivity(intent);

            }
        });

        dairy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","dairy");
                startActivity(intent);

            }
        });

        connect_bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, BluetoothActivity.class);
                startActivity(intent);
            }
        });
    }
}
