package com.test.forequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // array for choices
    String[] QUIZ = {"ant","mouse","gorilla","whale"};

    // initialize correct count
    int tap = 0;

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

    public void onButton(View v){
        // get text from tapped button
        String text = ((Button)v).getText().toString();

        // compare with correct answer and display result
        if(text.equals(QUIZ[tap])){

            // disable tapped button
            v.setEnabled(false);
            // count up correct count
            tap++;

            // display result
            if(tap >= QUIZ.length){

                // when perfect
                ((TextView)findViewById(R.id.resultText)).setText("Perfect!!");

            } else {

                ((TextView)findViewById(R.id.resultText)).setText("Correct! " + tap + " point(s)!");

            }

        } else {

            ((TextView)findViewById(R.id.resultText)).setText("Game over");
            ((Button)findViewById(R.id.b0)).setEnabled(false);
            ((Button)findViewById(R.id.b1)).setEnabled(false);
            ((Button)findViewById(R.id.b2)).setEnabled(false);
            ((Button)findViewById(R.id.b3)).setEnabled(false);

        }
    }

}

