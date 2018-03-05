package org.ryanstrong.android.quiz;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static org.ryanstrong.android.quiz.R.id.text_answer;

public class MainActivity extends AppCompatActivity {
    int minScore ;
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
        RadioButton radioGroup =  (RadioButton) findViewById(R.id.oneB);
        boolean oneAnswer = radioGroup.isChecked();

//        RadioGroup radioTwo =  findViewById(R.id.optionTwo);
//        onTextView(withId(R.id.text_answer))  // withId(R.id.my_view) is a ViewMatcher
//                .perform(click())               // click() is a ViewAction
//                .check(matches(isDisplayed()));
//        onView(allOf(withId(R.id.text_answer), withText("Hello! ")))
        EditText entered =(EditText) findViewById(R.id.text_answer);
//        entered = text_answer;
        String entry = entered.getText().toString();
        boolean twoAnswer =  entry.equals("car");
        RadioButton radioThree = (RadioButton) findViewById(R.id.threeA);
        boolean threeAnswer = radioThree.isChecked();
        CheckBox checkBox = (CheckBox) findViewById(R.id.check);
        boolean checkedA = checkBox.isChecked();
        CheckBox wrongBox = (CheckBox) findViewById(R.id.checkB);
        boolean threeWrong = wrongBox.isChecked();

        RadioButton radioGroupFour = (RadioButton) findViewById(R.id.fourAnswer);
        boolean fourAnswer = radioGroupFour.isChecked();

//        int score = addScore(5,oneAnswer,twoAnswer, threeAnswer,fourAnswer);

        addScore( minScore,  oneAnswer,  twoAnswer,
         threeAnswer,  fourAnswer, checkedA, threeWrong) ;
        displayScore(addScore( minScore,  oneAnswer,  twoAnswer,
                threeAnswer,  fourAnswer, checkedA, threeWrong));
            //        int score = addScore(minScore, oneAnswer, twoAnswer,
//                threeAnswer,fourAnswer);
//        String displayScore = (createQuizSummary(minScore, boolean oneAnswer, boolean twoAnswer,
//        boolean threeAnswer, boolean fourAnswer));
    }
//    private String createQuizSummary(int score, boolean oneAnswer, boolean twoAnswer,
//                         boolean threeAnswer, boolean fourAnswer, boolean checkedA){
//        return "Score: " + addScore( minScore,  oneAnswer, twoAnswer,
//         threeAnswer,  fourAnswer, checkedA);
//    }
    private int addScore(int minScore, boolean oneAnswer, boolean twoAnswer,
                         boolean threeAnswer, boolean fourAnswer, boolean checkedA, boolean threeWrong) {
        if (oneAnswer) {
            minScore ++;
        }if (twoAnswer) {
            minScore += 1;
        }if (threeAnswer) {
            minScore += 1;
        }if (fourAnswer) {
            minScore += 1;
        }if(checkedA){
            minScore ++;
        if(threeWrong){
            minScore --;
        }}

        return minScore;
    }
    public void displayScore(int minScore){
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(quizSummary(minScore)));
    }
    private String quizSummary(int minScore){
        return "Your Score: " + minScore;
    }
}
