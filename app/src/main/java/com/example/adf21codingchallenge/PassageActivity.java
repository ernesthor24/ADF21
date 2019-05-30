package com.example.adf21codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PassageActivity extends AppCompatActivity {

    private TextView passageHeader;
    private TextView passageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage);
        Intent intent = getIntent();
        String selectedPassage = intent.getStringExtra(MainActivity.PASSAGE_NUM);
        passageHeader = (TextView) findViewById(R.id.passage_header);
        passageText = (TextView) findViewById(R.id.passage_text);

        int passY = 0;

        passY= Integer.valueOf(selectedPassage);

        switch (passY) {

            case 1:
                passageHeader.setText(getText(R.string.passageOne_header));
                passageText.setText(getText(R.string.passage_one));
                break;

            case 2:
                passageHeader.setText(getText(R.string.passageTwo_header));
                passageText.setText(getText(R.string.passage_two));
                break;

            case 3:
                passageHeader.setText(getText(R.string.passageThree_header));
                passageText.setText(getText(R.string.passage_three));
                break;

            default:

                break;

        }
    }
}
