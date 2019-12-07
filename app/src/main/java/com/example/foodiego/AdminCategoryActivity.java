package com.example.foodiego;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminCategoryActivity extends AppCompatActivity {

    private CardView fruit_button, vegetable_button, bakery_button, dairy_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        fruit_button = (CardView) findViewById(R.id.cardView_fruit);
        vegetable_button = (CardView) findViewById(R.id.cardView_vegetable);
        bakery_button = (CardView) findViewById(R.id.cardView_bakery);
        dairy_button = (CardView) findViewById(R.id.cardView_dairy);


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
    }
}
