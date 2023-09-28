package com.example.projectfinal2;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import  com.bumptech.glide.Glide;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    ImageView imageView;
    String url = "https://th-a.kakaopagecdn.com/P/C/48/c1/2x/12894781-3bf1-4744-9116-a672823c1db3.webp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        imageView = findViewById(R.id.imageView2);
        Glide.with(this).load(url).into(imageView);

    }


    }




