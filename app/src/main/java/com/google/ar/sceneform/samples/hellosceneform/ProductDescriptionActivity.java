package com.google.ar.sceneform.samples.hellosceneform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class ProductDescriptionActivity extends AppCompatActivity {

    private Button liveButton, purchaseButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_description);

        liveButton = findViewById(R.id.liveButton);
        purchaseButton = findViewById(R.id.purchaseButton);

        liveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProductDescriptionActivity.this, HelloSceneformActivity.class);
                startActivity(i);
            }
        });

        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProductDescriptionActivity.this, purchaseActivity.class);
                startActivity(i);
            }
        });


    }


}
