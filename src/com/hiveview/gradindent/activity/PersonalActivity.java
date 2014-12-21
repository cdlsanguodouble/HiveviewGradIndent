package com.hiveview.gradindent.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.hiveview.gradindent.R;

public class PersonalActivity extends Activity
	implements View.OnClickListener
{

	private ImageView headImage;
	private TextView username;
	private TextView userId;
	private TextView receiveCount;
	private TextView destoryCount;
	private TextView admireCount;
	private TextView orderCount;
	private Button startWork;

	public PersonalActivity()
	{
	}

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_personal);
		init();
	}

	private void init()
	{
		headImage = (ImageView)findViewById(R.id.iv_head_image);
		username = (TextView)findViewById(R.id.tv_username);
		userId = (TextView)findViewById(R.id.tv_user_id);
		receiveCount = (TextView)findViewById(R.id.tv_receive_count);
		destoryCount = (TextView)findViewById(R.id.tv_drop_count);
		admireCount = (TextView)findViewById(R.id.tv_admire_count);
		orderCount = (TextView)findViewById(R.id.tv_order_count);
		startWork = (Button)findViewById(R.id.btn_start_work);

		receiveCount.setOnClickListener(this);
		orderCount.setOnClickListener(this);
		startWork.setOnClickListener(this);
	}

	public void onClick(View view)
	{
		switch (view.getId())
		{
		case R.id.tv_receive_count:
		case R.id.tv_order_count:
			Intent orderIntent = new Intent(this, OrderListActivity.class);
			startActivity(orderIntent);
			break;

		case R.id.btn_start_work:
			Intent gradIndent = new Intent(this, GradIndentActivity.class);
			startActivity(gradIndent);
			break;
		}
	}
}
