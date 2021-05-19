package sg.edu.rp.c346.id20011280.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);
        Intent received = getIntent();
        String QuestionSelected = received.getStringExtra("Question");
         if(QuestionSelected.equalsIgnoreCase("Q1"))
        {
            tvAnswer.setText("Q1 answer is QUEUE");
        }
        else
        {
            tvAnswer.setText("Q2 answer is Gone");
        }
       



    }
}
