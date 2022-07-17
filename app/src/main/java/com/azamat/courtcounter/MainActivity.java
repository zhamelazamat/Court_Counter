package com.azamat.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity<points> extends AppCompatActivity {
    private int scoreA;
    private int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addScore(View view) {
        String id = getResources().getResourceEntryName(view.getId()); //определяем id кнопки

        switch (id) {
            case "point_of_A_3": //учитывая какая кнопка была нажата, увеличиваем счёт команды А или В
                scoreA += 3;
                break;
            case "point_of_A_2":
                scoreA += 2;
                break;
            case "point_of_A_1":
                scoreA++;
                break;
            case "point_of_B_3":
                scoreB += 3;
                break;
            case "point_of_B_2":
                scoreB += 2;
                break;
            case "point_of_B_1":
                scoreB++;
                break;
        }
        display_A();
        display_B();
    }

    public void display_B() {
        TextView text = findViewById(R.id.team_b_score);
        text.setText(String.valueOf(scoreB));
    }

    public void display_A() {
        TextView text = findViewById(R.id.team_a_score);
        text.setText(String.valueOf(scoreA));
    }
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        display_B();
        display_A();
    }
}