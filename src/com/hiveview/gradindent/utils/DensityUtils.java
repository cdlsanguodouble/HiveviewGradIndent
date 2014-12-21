// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DensityUtils.java

package com.hiveview.gradindent.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class DensityUtils
{

	private DensityUtils()
	{
		throw new UnsupportedOperationException("cannot be instantiated");
	}

	public static int dp2px(Context context, float dpVal)
	{
		return (int)TypedValue.applyDimension(1, dpVal, context.getResources().getDisplayMetrics());
	}

	public static int sp2px(Context context, float spVal)
	{
		return (int)TypedValue.applyDimension(2, spVal, context.getResources().getDisplayMetrics());
	}

	public static float px2dp(Context context, float pxVal)
	{
		float scale = context.getResources().getDisplayMetrics().density;
		return pxVal / scale;
	}

	public static float px2sp(Context context, float pxVal)
	{
		return pxVal / context.getResources().getDisplayMetrics().scaledDensity;
	}
}
