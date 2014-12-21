// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ImageLoaderConfig.java

package com.hiveview.gradindent.image;

import android.content.Context;
import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiscCache;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.*;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.nostra13.universalimageloader.utils.StorageUtils;

// Referenced classes of package com.hiveview.gradindent.image:
//			SimpleImageDisplayer

public class ImageLoaderConfig
{

	public ImageLoaderConfig()
	{
	}

	public static DisplayImageOptions initDisplayOptions(boolean isShowDefault)
	{
		com.nostra13.universalimageloader.core.DisplayImageOptions.Builder displayImageOptionsBuilder = new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder();
		displayImageOptionsBuilder.imageScaleType(ImageScaleType.EXACTLY);
		if (isShowDefault)
		{
			displayImageOptionsBuilder.showStubImage(0x7f020006);
			displayImageOptionsBuilder.showImageForEmptyUri(0x7f020006);
			displayImageOptionsBuilder.showImageOnFail(0x7f020006);
		}
		displayImageOptionsBuilder.cacheInMemory(true);
		displayImageOptionsBuilder.cacheOnDisc(true);
		displayImageOptionsBuilder.bitmapConfig(Bitmap.Config.RGB_565);
		return displayImageOptionsBuilder.build();
	}

	public static DisplayImageOptions initDisplayOptions(int targetWidth, boolean isShowDefault)
	{
		com.nostra13.universalimageloader.core.DisplayImageOptions.Builder displayImageOptionsBuilder = new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder();
		displayImageOptionsBuilder.imageScaleType(ImageScaleType.EXACTLY);
		if (isShowDefault)
		{
			displayImageOptionsBuilder.showStubImage(0x7f020006);
			displayImageOptionsBuilder.showImageForEmptyUri(0x7f020006);
			displayImageOptionsBuilder.showImageOnFail(0x7f020006);
		}
		displayImageOptionsBuilder.cacheInMemory(true);
		displayImageOptionsBuilder.cacheOnDisc(true);
		displayImageOptionsBuilder.bitmapConfig(Bitmap.Config.RGB_565);
		displayImageOptionsBuilder.displayer(new SimpleImageDisplayer(targetWidth));
		return displayImageOptionsBuilder.build();
	}

	public static void initImageLoader(Context context, String cacheDisc)
	{
		java.io.File cacheDir = StorageUtils.getOwnCacheDirectory(context, cacheDisc);
		com.nostra13.universalimageloader.core.ImageLoaderConfiguration.Builder builder = new com.nostra13.universalimageloader.core.ImageLoaderConfiguration.Builder(context);
		builder.threadPoolSize(3);
		builder.threadPriority(5);
		builder.memoryCache(new WeakMemoryCache());
		builder.memoryCacheExtraOptions(480, 800);
		builder.denyCacheImageMultipleSizesInMemory();
		builder.discCache(new UnlimitedDiscCache(cacheDir));
		builder.discCacheFileNameGenerator(new HashCodeFileNameGenerator());
		builder.imageDownloader(new BaseImageDownloader(context, 10000, 60000));
		builder.defaultDisplayImageOptions(initDisplayOptions(true));
		ImageLoader.getInstance().init(builder.build());
	}
}
