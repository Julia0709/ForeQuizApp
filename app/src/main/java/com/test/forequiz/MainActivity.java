package com.test.forequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // array for choices
    String[] QUIZ = {"ant","mouse","gorilla","whale"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // shuffle positions
        List<String> list = Arrays.asList(QUIZ.clone());
        Collections.shuffle(list);
        // get choices from above list
        ((Button)findViewById(R.id.b0)).setText(list.get(0));
        ((Button)findViewById(R.id.b1)).setText(list.get(1));
        ((Button)findViewById(R.id.b2)).setText(list.get(2));
        ((Button)findViewById(R.id.b3)).setText(list.get(3));
    }

}

