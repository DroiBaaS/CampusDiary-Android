package com.campus.diary.utils;

import android.content.Context;
import android.os.Environment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.module.GlideModule;

import java.io.File;

public class MyGlideModule implements GlideModule {

    private final static String DEFAULT_SAVE_IMAGE_PATH = Environment.getExternalStorageDirectory() + File.separator + "CircleDemo" + File.separator + "Images"
            + File.separator;

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        builder.setDiskCache(
                new InternalCacheDiskCacheFactory(context, DEFAULT_SAVE_IMAGE_PATH, 50 * 1024 * 1024));
    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
