package com.manishab.straydogsapp;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by priyanka on 3/5/17.
 */

public class Contact extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Contact");
        setSupportActionBar(toolbar);
        TextView textView;
        textView = (TextView) findViewById(R.id.contact);
        textView.setText("Feedbacks are highly appreciated.\n Mail us your feedback at : \n                          dogsclub101@gmail.com");
    }
}
