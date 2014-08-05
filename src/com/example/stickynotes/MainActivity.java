package com.example.stickynotes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void startChatHead(View view){
		Toast.makeText(MainActivity.this, "ChatHead Initiated", Toast.LENGTH_SHORT).show();
		//Start Chat Head
		Intent intent = new Intent(this, ChatHeadService.class);
		startService(intent);
	}

	public void destroyChatHead(View view){
		stopService(new Intent(this,ChatHeadService.class));
	}
}
