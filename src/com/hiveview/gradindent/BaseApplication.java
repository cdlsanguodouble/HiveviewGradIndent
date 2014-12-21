package com.hiveview.gradindent;

import android.app.Application;
import android.content.res.Configuration;
import com.baidu.mapapi.SDKInitializer;
import com.hiveview.gradindent.config.Constants;
import com.hiveview.gradindent.image.ImageLoaderConfig;

public class BaseApplication extends Application
{

	public BaseApplication()
	{
	}

	public void onConfigurationChanged(Configuration newConfig)
	{
		super.onConfigurationChanged(newConfig);
	}

	public void onCreate()
	{
		super.onCreate();
		// 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
		SDKInitializer.initialize(getApplicationContext());
		ImageLoaderConfig.initImageLoader(this, Constants.BASE_IMAGE_CACHE);
	}

	public void onLowMemory()
	{
		super.onLowMemory();
	}

	public void onTerminate()
	{
		super.onTerminate();
	}
}
