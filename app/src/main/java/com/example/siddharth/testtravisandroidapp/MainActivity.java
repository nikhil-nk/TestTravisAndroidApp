package com.example.siddharth.testtravisandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.siddharth.testtravisandroidapp.Utils.TextUtils.TextUtilsClass;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView mainText = (TextView) findViewById(R.id.main_text);
    String textToFitIn = TextUtilsClass.gettingText();
    mainText.setText(textToFitIn);
  }
}
