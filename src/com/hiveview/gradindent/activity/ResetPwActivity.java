// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ResetPwActivity.java

package com.hiveview.gradindent.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.hiveview.gradindent.R;

public class ResetPwActivity extends Activity
	implements View.OnClickListener
{

	private ImageView headBack;
	private EditText phoneNum;
	private Button verification;
	private EditText verificationNum;
	private EditText newPassword;
	private Button resetPw;

	public ResetPwActivity()
	{
	}

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reset_pw);
		init();
	}

	private void init()
	{
		headBack = (ImageView)findViewById(R.id.iv_head_back);
		phoneNum = (EditText)findViewById(R.id.et_phone_num);
		verification = (Button)findViewById(R.id.btn_verification);
		verificationNum = (EditText)findViewById(R.id.et_verification_code);
		newPassword = (EditText)findViewById(R.id.et_password);
		resetPw = (Button)findViewById(R.id.btn_reset_password);
		headBack.setOnClickListener(this);
		verification.setOnClickListener(this);
		resetPw.setOnClickListener(this);
	}

	public void onClick(View view)
	{
		String phoneNum;
		String verificationNum;
		switch (view.getId())
		{
		case R.id.iv_head_back:
			finish();
			break;

		case R.id.btn_verification:
			phoneNum = this.phoneNum.getText().toString().trim();
			break;

		case R.id.btn_reset_password:
			verificationNum = this.verificationNum.getText().toString().trim();
			finish();
			break;
		}
	}
}
