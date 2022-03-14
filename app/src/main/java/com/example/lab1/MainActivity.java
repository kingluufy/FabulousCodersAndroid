package com.example.lab1;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.view.View;
    import android.widget.EditText;
    import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void buttonClicked(View v) {
            EditText triesBox  =  (EditText) findViewById(R.id.triesbox);
            String tb = triesBox.getText().toString();


            //Scanner input =  new Scanner(System.in);
            EditText rangebox  =  (EditText) findViewById(R.id.rangebox);
            int rb = Integer.parseInt(rangebox.getText().toString());


            int num = (int) ((Math.random()* rb));



            ((TextView) findViewById(R.id.answer)).setText(String.valueOf(num));

            /*
            double wD = BMIModel.toDouble(wS);
            double hD = BMIModel.toDouble(hS);
            double bmiD = BMIModel.getBMI(wD, hD);
            String bmiS = BMIModel.formatBMI(bmiD);
            ((TextView) findViewById(R.id.answer)).setText(bmiS);*/
        }
        public void button2(View v) {
            TextView secretNum  =  (TextView) findViewById(R.id.answer);
            String num = secretNum.getText().toString();

            EditText guessBox  =  (EditText) findViewById(R.id.rangebox);
            String gb = guessBox.getText().toString();

            if (num.equals(gb)) {
                ((TextView) findViewById(R.id.answer2)).setText("True");
            } else {
                ((TextView) findViewById(R.id.answer2)).setText("false");
            }
        }
    }