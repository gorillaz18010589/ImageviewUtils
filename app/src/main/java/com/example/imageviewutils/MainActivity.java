package com.example.imageviewutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.imagviewutils.ImageViewUtils;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.img);

    }

    public void setRotation(View view) {
        ImageViewUtils.getInstance(imageView).setRotation(180f);
    }
}