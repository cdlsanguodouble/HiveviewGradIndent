// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ImageUtils.java

package com.hiveview.gradindent.image;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class ImageUtils
{

	public ImageUtils()
	{
	}

	public static Bitmap resizeImageByWidth(Bitmap defaultBitmap, int targetWidth)
	{
		int rawWidth = defaultBitmap.getWidth();
		int rawHeight = defaultBitmap.getHeight();
		float targetHeight = ((float)targetWidth * (float)rawHeight) / (float)rawWidth;
		float scaleWidth = (float)targetWidth / (float)rawWidth;
		float scaleHeight = targetHeight / (float)rawHeight;
		Matrix localMatrix = new Matrix();
		localMatrix.postScale(scaleHeight, scaleWidth);
		return Bitmap.createBitmap(defaultBitmap, 0, 0, rawWidth, rawHeight, localMatrix, true);
	}
}
