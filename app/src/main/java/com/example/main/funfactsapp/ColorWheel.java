package com.example.main.funfactsapp;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    private String[] colors = {
                "#39add1", // light blue
                "#3079ab", // dark blue
                "#c25975", // mauve
                "#e15258", // red
                "#f9845b", // orange
                "#838cc7", // lavender
                "#7d669e", // purple
                "#53bbb4", // aqua
                "#51b46d", // green
                "#e0ab18", // mustard
                "#637a91", // dark gray
                "#f092b0", // pink
                "#b7c0c7", // light gray
                "#ce93d8", // light purple
                "#9499b7", // dark indigo
                "#e57373", // medium red
                "#ffa000", // amber
                "#ff5722", // deep orange
                "#607d8b", // medium blue gray
                "#9e9e9e", // medium gray
                "#00e676", // neon green
                "#00e5ff", // neon cyan
        };

        //Fields or Member Variables - Properties about the object

        public int getColor() {
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(colors.length);
            int color = Color.parseColor(colors[randomNumber]);
            return color;


        }
    }

