package com.example.hoanv.theanswer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class TheAnswer extends Activity {

    private static final int[] ANSWERS = { -18, 20 , 42, 100};
    private static final int ANSWER = 42;
    private static final String TAG = "Answer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_answer);

        TextView textView = (TextView) findViewById(R.id.answer);

        int val = findAnswer();
        Log.i(TAG, "Printing the answer to life:");
        String output = (val == ANSWER) ? "42" : "We may never know";
        Log.i(TAG, "Answer is : " + output);
        textView.setText("The answer to life, the universe and everything is \n\n" + output);
    }

    private int findAnswer() {
        for (int i : ANSWERS){
            if(i == ANSWER){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_the_answer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
