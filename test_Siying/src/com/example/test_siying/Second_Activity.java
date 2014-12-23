package com.example.test_siying;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second_Activity extends ActionBarActivity implements OnClickListener {
	
	private Button buttonsecond;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		buttonsecond = (Button)findViewById(R.id.second);
		buttonsecond.setOnClickListener(this);

	}

	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent();
		i.setClass(this,  Third_Activity.class);
		startActivity(i);
		finish();
	}

}
