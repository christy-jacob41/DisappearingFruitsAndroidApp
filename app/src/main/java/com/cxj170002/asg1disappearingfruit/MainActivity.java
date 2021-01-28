package com.cxj170002.asg1disappearingfruit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// Written by Christy Jacob for CS4301.002, assignment 1, starting January 26, 2021.
//    NetID: cxj170002
// This program displays the names of 5 specific, unique fruits and has the names disappear
// when clicked. We get practice with onclick, views, and constraint layout with this program.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // you only need one handle Click method for each of the TextViews to avoid
    // repetitive code
    // this function has the text view of the fruit that was clicked disappear
    // the input is a View object
    public void helloClick(View view) {
        // I found on the android developer docs and stackoverflow that you can use
        // setVisibility(View.INVISIBLE)
        // sets the visibility of the view to invisible when clicked
        ((TextView) view).setVisibility(View.INVISIBLE);
    }
}