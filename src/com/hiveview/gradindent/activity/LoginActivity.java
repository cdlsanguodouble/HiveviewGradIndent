package com.hiveview.gradindent.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.*;
import com.hiveview.gradindent.R;
import com.hiveview.gradindent.utils.T;



public class LoginActivity extends BaseActivity
	implements View.OnClickListener
{

	private ImageView headImage;
	private EditText username;
	private EditText password;
	private Button login;
	private TextView forgetPassword;

	public LoginActivity()
	{
	}

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		init();
	}

	private void init()
	{
		headImage = (ImageView)findViewById(R.id.iv_head_image);
		username = (EditText)findViewById(R.id.et_username);
		password = (EditText)findViewById(R.id.et_password);
		login = (Button)findViewById(R.id.btn_login);
		forgetPassword = (TextView)findViewById(R.id.tv_forget_password);
		login.setOnClickListener(this);
		forgetPassword.setOnClickListener(this);
	}

	public void onClick(View view)
	{
		switch (view.getId())
		{
		case R.id.btn_login:
			String username = this.username.getText().toString().trim();
			String password = this.password.getText().toString().trim();
			if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password))
				T.showShort(this, "用户名或密码不可为空");
			else
			if (username.equals("111") && password.equals("111"))
			{
				Intent intent = new Intent(this, PersonalActivity.class);
				startActivity(intent);
				finish();
			} else
			{
				T.showShort(this, "用户名或密码不正确");
			}
			break;

		case R.id.tv_forget_password:
			Intent intent = new Intent(this, ResetPwActivity.class);
			startActivity(intent);
			break;
		}
	}
}
