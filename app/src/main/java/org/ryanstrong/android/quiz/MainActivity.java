package org.ryanstrong.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.optionOne);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if(checkedId == R.id.oneA){
                    Toast.makeText(getApplicationContext(),"choice: A",
                            Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.oneB){
                    Toast.makeText(getApplicationContext(), "choice: B",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "choice: C",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        RadioButton oneA = (RadioButton) findViewById(R.id.oneA);
        RadioButton oneB = (RadioButton) findViewById(R.id.oneB);
        RadioButton oneC = (RadioButton) findViewById(R.id.oneC);

    }
    public void submitQuiz(View view){
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.optionOne);
    }
}
