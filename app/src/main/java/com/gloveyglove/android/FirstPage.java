package com.gloveyglove.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.first_page)
public class FirstPage extends AppCompatActivity {

   @AfterViews
    protected void afterViews() {

   }
}
