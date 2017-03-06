package com.manishab.straydogsapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.*;

public class Mapdetail extends AppCompatActivity {
    Toolbar toolbar;
    TextView txt_detail;
    String detail;
    TextView txt_title;
    String title;
    Button callbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapdetail);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Center Details");
        setSupportActionBar(toolbar);
        txt_detail = (TextView) findViewById(R.id.text_snippet);
        detail = getIntent().getStringExtra("detail");
        txt_detail.setText(detail);

        txt_title = (TextView) findViewById(R.id.txt_title);
        title = getIntent().getStringExtra("title");
        txt_title.setText(title);

        callbutton = (Button) findViewById(R.id.call);
        callbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + detail));

                if (ActivityCompat.checkSelfPermission(Mapdetail.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(callIntent);

            }
        });


    }
    public void onBackPressed(){
        finish();
        Intent intent = new Intent(Mapdetail.this,MapsActivity.class);
        startActivity(intent);
    }

}
