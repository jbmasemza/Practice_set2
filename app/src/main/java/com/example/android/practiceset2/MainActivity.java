package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int weekday = 5;
        int weekends = 9;
        int optimalHours = 7*8;
        int actualHours = weekday*5;
        actualHours = actualHours + (weekends*2);
        int solution = optimalHours - actualHours;
        display(solution);
    }

    private void display(int solution)
    {
        TextView t =(TextView) findViewById(R.id.display_text_view);
        t.setText(""+solution);
    }
}
