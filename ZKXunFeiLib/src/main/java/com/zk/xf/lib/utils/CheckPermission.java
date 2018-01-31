package com.zk.xf.lib.utils;

import android.Manifest;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;

/**
 * CheckPermission
 * Created by WangQing on 2018/1/31.
 */
public class CheckPermission {

    String[] permissions = new String[] {
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.INTERNET,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
    };

    Activity mActivity;

    public CheckPermission(Activity activity) {
        this.mActivity = activity;
    }

    public void requestPermissions() {
        ActivityCompat.requestPermissions(mActivity, permissions, 10000);
    }
}
