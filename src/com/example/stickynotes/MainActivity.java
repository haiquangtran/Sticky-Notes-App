package com.example.stickynotes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button chatHead = (Button)findViewById(R.id.button1);
		chatHead.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startChatHead();
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void startChatHead(){
		Toast.makeText(MainActivity.this, "ChatHead Initiated", Toast.LENGTH_SHORT).show();
		//Start Chat Head
		Intent intent = new Intent(this, ChatHeadService.class);
		startService(intent);
	}

}