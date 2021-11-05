package com.example.topic4_lesson4_and_androidshapedrawablestutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.widget.ImageView;

import static com.example.topic4_lesson4_and_androidshapedrawablestutorial.R.drawable.shapedrawable1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageView imagen = (ImageView) findViewById(R.id.miForma);
        //imagen.setImageResource(shapedrawable1);
        //modificar drawable con java
        //Drawable drawable = getDrawable(shapedrawable1);
        //castear a gradient drawable
       // GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        //modificar el gradientDrawable -> le pongo color morado , forma de ovalo, borde cyan
        //gradientDrawable.setColor(ContextCompat.getColor(this, R.color.purple_200));
        //gradientDrawable.setShape(GradientDrawable.OVAL);
        //gradientDrawable.setStroke(12, Color.CYAN);

        //imagen.setImageResource(shapedrawable1);

        //definir shapes con java
        //RoundRectShape roundRectShape = new RoundRectShape(new
           //     float[]{
             //   10, 10, 10, 10,
              //  10, 10, 10, 10}, null, null);
       // ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
       // shapeDrawable.getPaint().setColor(Color.parseColor("#ff0000"));

        //imagen.setBackground(shapeDrawable);
        // or you can use
        //imagen.setImageDrawable(shapeDrawable);

    }
}