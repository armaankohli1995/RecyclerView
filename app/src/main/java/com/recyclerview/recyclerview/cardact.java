package com.recyclerview.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class cardact extends AppCompatActivity {
    TextView cardtitle;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardact);
        cardtitle = (TextView)findViewById(R.id.cardtitle);
        //cardtitle.setText();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("key");
            //The key argument here must match that used in the other activity
        }
        cardtitle.setText(value);
    }
}
