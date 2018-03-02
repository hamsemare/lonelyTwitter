package ca.ualberta.cs.lonelytwitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent= getIntent();
        TextView text= (TextView) findViewById(R.id.textview);
        text.setText(intent.getStringExtra("tweet"));
    }

}
