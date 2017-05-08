package com.gloveyglove.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.b_eye) Button button_eye;
    @ViewById(R.id.b_heart) Button button_heart;
    @ViewById(R.id.b_kidney) Button button_kidney;
    @ViewById(R.id.b_sinus) Button button_sinus;
    @ViewById(R.id.b_stomach) Button button_stomach;
    @ViewById(R.id.b_stop) Button button_stop;


    @AfterViews
    protected void afterViews() {
        
    }
}
