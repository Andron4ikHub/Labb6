package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;


public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        ConstraintLayout canvas = findViewById(R.id.backgroundID);

        Intent receiveColor = getIntent();
        TextView banner = findViewById(R.id.textView2);

        String colorname = receiveColor.getStringExtra("background");

        if (colorname != null){
            banner.setText(colorname);
            banner.setTextColor(Color.WHITE);
            canvas.setBackgroundColor(Color.parseColor(colorname));
        }

    }
}