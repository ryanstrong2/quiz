package org.ryanstrong.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int minScore =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.optionOne);
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId){
//                if(checkedId == R.id.oneA){
//                    Toast.makeText(getApplicationContext(),"choice: A",
//                            Toast.LENGTH_SHORT).show();
//                }else if(checkedId == R.id.oneB){
//                    Toast.makeText(getApplicationContext(), "choice: B",
//                            Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(getApplicationContext(), "choice: C",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        RadioButton oneA = (RadioButton) findViewById(R.id.oneA);
//        RadioButton oneB = (RadioButton) findViewById(R.id.oneB);
//        RadioButton oneC = (RadioButton) findViewById(R.id.oneC);

    }
    public void submitQuiz(View view){
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.optionOne);
        boolean oneAnswer = radioGroup.isSelected();
        RadioGroup radioTwo = (RadioGroup) findViewById(R.id.optionTwo);
        boolean twoAnswer = radioTwo.isSelected();
        RadioGroup radioThree = (RadioGroup) findViewById(R.id.optionThree);
        boolean threeAnswer = radioThree.isSelected();
        RadioGroup radioGroupFour = (RadioGroup) findViewById(R.id.optionFour);
        boolean fourAnswer = radioGroupFour.isSelected();
//        int score = addScore(minScore, oneAnswer, twoAnswer,
//                threeAnswer,fourAnswer);
//        String displayScore = (createQuizSummary(minScore, boolean oneAnswer, boolean twoAnswer,
//        boolean threeAnswer, boolean fourAnswer));
    }
    private String createQuizSummary(int score, boolean oneAnswer, boolean twoAnswer,
                         boolean threeAnswer, boolean fourAnswer){
        return "Score: " + minScore;
    }
    private int addScore(int minScore, boolean oneAnswer, boolean twoAnswer,
                         boolean threeAnswer, boolean fourAnswer) {
        if (oneAnswer) {
            minScore += 1;
        }if (twoAnswer) {
            minScore += 1;
        }if (threeAnswer) {
            minScore += 1;
        }if (fourAnswer) {
            minScore += 1;
        }
        return minScore;
    }
}
