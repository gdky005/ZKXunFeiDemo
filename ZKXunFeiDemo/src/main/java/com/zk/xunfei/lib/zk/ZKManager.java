package com.zk.xunfei.lib.zk;

import android.content.Context;
import android.text.TextUtils;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * ZKManager
 * Created by WangQing on 2018/1/31.
 */

public class ZKManager {

    private Context mContext;
    private static ZKManager instance = null;

    private ZKManager() {
    }

    public static ZKManager getInstance() {
        if (instance == null) {
            synchronized (ZKManager.class) {
                ZKManager temp = instance;
                if (temp == null) {
                    temp = new ZKManager();
                    instance = temp;
                }
            }
        }
        return instance;
    }

    /**
     * 请优先初始化该方法
     *
     * @param context   context
     * @param appId     appId
     */
    public void init(Context context, String appId) {
        mContext = context;

        if (TextUtils.isEmpty(appId)) {
            throw new ZKException("appid is not null!");
        }

        if (!appId.contains(SpeechConstant.APPID)) {
            setAppId(SpeechConstant.APPID +"=" + appId);
        } else {
            setAppId(appId);
        }
    }

    public void setAppId(String appId) {
        SpeechUtility.createUtility(mContext, appId);
    }


}
