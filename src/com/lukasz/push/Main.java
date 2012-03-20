package com.lukasz.push;

import com.urbanairship.push.PushManager;
import com.urbanairship.push.PushPreferences;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity 
{
    /** Called when the activity is first created. */
	
	PushPreferences prefs = PushManager.shared().getPreferences();
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button launchButton = (Button) findViewById(R.id.push_preferences_button);
        
        launchButton.setOnClickListener(new OnClickListener() {
        	
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), PushPreferencesActivity.class);
                startActivity(intent);
            }
        });
    }
}