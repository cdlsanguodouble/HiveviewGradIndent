// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SimpleImageDisplayer.java

package com.hiveview.gradindent.image;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;

// Referenced classes of package com.hiveview.gradindent.image:
//			ImageUtils

public class SimpleImageDisplayer implements BitmapDisplayer
{

	private int targetWidth;

	public SimpleImageDisplayer(int targetWidth)
	{
		this.targetWidth = targetWidth;
	}

	public Bitmap display(Bitmap bitmap, ImageView imageView, LoadedFrom loadedFrom)
	{
		if (bitmap != null)
			bitmap = ImageUtils.resizeImageByWidth(bitmap, targetWidth);
		imageView.setImageBitmap(bitmap);
		return bitmap;
	}

	@Override
	public void display(Bitmap bitmap, ImageAware imageAware, LoadedFrom loadedFrom) {

	}
}
