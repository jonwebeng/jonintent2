package com.jonskynet.jonintent2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.gms.maps.model.LatLng;


public class IntentActivity extends AppCompatActivity {
    private static final String TAG = "Let's see...";
    ImageButton mapButton;
    ImageButton mapButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        mapButton = (ImageButton) findViewById(R.id.imageButton);
        mapButton2 = (ImageButton) findViewById(R.id.imageButton2);
        mapButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //EditText messageView = (EditText) findViewById(R.id.message);
                //String messageText = messageView.getText().toString();
                String messageText = "Best City";
                LatLng sydney = new LatLng(41.606487, 2.613965);
                String latitude = String.valueOf(sydney.latitude);
                String longitude = String.valueOf(sydney.longitude);

                Intent intent = new Intent(v.getContext(), GetIntentActivity.class);
                //Intent intent = new Intent(this, GetIntentActivity.class);
                intent.putExtra(GetIntentActivity.EXTRA_MESSAGE, messageText);
                intent.putExtra(GetIntentActivity.EXTRA_MESSAGE2, latitude);
                intent.putExtra(GetIntentActivity.EXTRA_MESSAGE3, longitude);
                //   //Log.d(TAG, "value:" + sydney.latitude);
                //   Log.d(TAG, "value:" + latitude);
                startActivity(intent);
            }
        });
        mapButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //EditText messageView = (EditText) findViewById(R.id.message);
                //String messageText = messageView.getText().toString();
                String messageText = "Dream City";
                LatLng sydney = new LatLng(40.730610, -73.935242);
                String latitude = String.valueOf(sydney.latitude);
                String longitude = String.valueOf(sydney.longitude);

                Intent intent = new Intent(v.getContext(), GetIntentActivity.class);
                intent.putExtra(GetIntentActivity.EXTRA_MESSAGE, messageText);
                intent.putExtra(GetIntentActivity.EXTRA_MESSAGE2, latitude);
                intent.putExtra(GetIntentActivity.EXTRA_MESSAGE3, longitude);
                //   //Log.d(TAG, "value:" + sydney.latitude);
                //   Log.d(TAG, "value:" + latitude);
                startActivity(intent);
            }
        });
    }


    public void onSend(View view) {
       EditText messageView = (EditText) findViewById(R.id.message);
       String messageText = messageView.getText().toString();
       LatLng sydney = new LatLng(0.0, 0.0);
        String latitude = String.valueOf(sydney.latitude);
       String longitude = String.valueOf(sydney.longitude);

        Intent intent = new Intent(this, GetIntentActivity.class);
        intent.putExtra(GetIntentActivity.EXTRA_MESSAGE, messageText);
        intent.putExtra(GetIntentActivity.EXTRA_MESSAGE2, latitude);
        intent.putExtra(GetIntentActivity.EXTRA_MESSAGE3, longitude);
        //Log.d(TAG, "value:" + sydney.latitude);
        Log.d(TAG, "value:" + latitude);
        startActivity(intent);
    }

}
