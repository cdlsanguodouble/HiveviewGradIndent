// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Constants.java

package com.hiveview.gradindent.config;

import android.os.Environment;
import java.io.File;

public class Constants
{

	public static String APP_NAME = "";
	public static final String IMAGE_URL = "http://58.211.5.34:8080/studioms/staticmedia/images/#";
	public static final String VIDEO_URL = "http://58.211.5.34:8080/studioms/staticmedia/video/#";
	public static final String SHARED_PREFERENCE_NAME = "itau_jingdong_prefs";
	public static final String SD_PATH = Environment.getExternalStorageDirectory().getAbsolutePath();
	public static final String BASE_PATH = (new StringBuilder()).append(SD_PATH).append("/iTau/jingdong/").toString();
	public static final String BASE_IMAGE_CACHE = (new StringBuilder()).append(BASE_PATH).append("cache/images/").toString();
	public static final String SHARE_FILE = (new StringBuilder()).append(BASE_PATH).append("QrShareImage.png").toString();
	public static String IMEI = "";
	public static String TEL = "";
	public static int SCREEN_HEIGHT = 800;
	public static int SCREEN_WIDTH = 480;
	public static float SCREEN_DENSITY = 1.5F;
	public static final int SHARE_SUCCESS = 4096;
	public static final int SHARE_CANCEL = 8192;
	public static final int SHARE_ERROR = 12288;
	public static final int EXECUTE_LOADING = 16384;
	public static final int EXECUTE_SUCCESS = 20480;
	public static final int EXECUTE_FAILED = 24576;
	public static final int LOAD_DATA_SUCCESS = 28672;
	public static final int LOAD_DATA_ERROR = 32768;
	public static final int SET_DATA = 36864;
	public static final int NONE_LOGIN = 0x10000;

	public Constants()
	{
	}

}
