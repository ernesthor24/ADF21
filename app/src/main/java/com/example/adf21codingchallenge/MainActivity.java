package com.example.adf21codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String PASSAGE_NUM = "com.example.adf21codingchallenge";
    private static int selectedPassage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchPassageOne(View view) {
        selectedPassage = 1;
        verifier(selectedPassage);

    }

    public void launchPassageTwo(View view) {
        selectedPassage = 2;
        verifier(selectedPassage);
    }

    public void launchPassageThree(View view) {
        selectedPassage = 3;
        verifier(selectedPassage);
    }

    public void verifier(int passage) {
        Intent intent = new Intent(MainActivity.this, PassageActivity.class);
        String passageNum = String.valueOf(passage);
        intent.putExtra(PASSAGE_NUM, passageNum);
        startActivity(intent);
    }
}
