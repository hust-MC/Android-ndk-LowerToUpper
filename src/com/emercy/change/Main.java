package com.emercy.change;

import android.app.Activity;
import android.os.Bundle;


public class Main extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new Ltu().convert("/sdcard/lower.txt", "/sdcard/upper.txt");
		setTitle("ת���ɹ�");
	}
}
