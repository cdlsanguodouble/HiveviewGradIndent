// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AppManager.java

package com.hiveview.gradindent;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import java.util.Iterator;
import java.util.Stack;

public class AppManager
{

	private static Stack mActivityStack;
	private static AppManager mAppManager;

	private AppManager()
	{
	}

	public static AppManager getInstance()
	{
		if (mAppManager == null)
			mAppManager = new AppManager();
		return mAppManager;
	}

	public void addActivity(Activity activity)
	{
		if (mActivityStack == null)
			mActivityStack = new Stack();
		mActivityStack.add(activity);
	}

	public Activity getTopActivity()
	{
		Activity activity = (Activity)mActivityStack.lastElement();
		return activity;
	}

	public void killTopActivity()
	{
		Activity activity = (Activity)mActivityStack.lastElement();
		killActivity(activity);
	}

	public void killActivity(Activity activity)
	{
		if (activity != null)
		{
			mActivityStack.remove(activity);
			activity.finish();
			activity = null;
		}
	}

	public void killActivity(Class cls)
	{
		Iterator i$ = mActivityStack.iterator();
		do
		{
			if (!i$.hasNext())
				break;
			Activity activity = (Activity)i$.next();
			if (activity.getClass().equals(cls))
				killActivity(activity);
		} while (true);
	}

	public void killAllActivity()
	{
		int i = 0;
		for (int size = mActivityStack.size(); i < size; i++)
			if (null != mActivityStack.get(i))
				((Activity)mActivityStack.get(i)).finish();

		mActivityStack.clear();
	}

	public void AppExit(Context context)
	{
		try
		{
			killAllActivity();
			ActivityManager activityMgr = (ActivityManager)context.getSystemService("activity");
			activityMgr.restartPackage(context.getPackageName());
			System.exit(0);
		}
		catch (Exception e) { }
	}
}
