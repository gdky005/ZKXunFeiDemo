package com.zk.xf.lib;

import android.os.Environment;

/**
 * Contants
 * Created by WangQing on 2018/1/31.
 */

public class Constants {
    public static final String FILE_NAME_IFLYTEK = "com.iflytek.setting";

    public static final String RESULT_TYPE = "json";
    public static final String AUDIO_FORMAT = "wav";

    public static final String DEFAULT_PATH = Environment.getExternalStorageDirectory()+"/msc/iat.wav";
    public static final String SP_KEY_TRANSLATE = "translate";
    public static final String SP_KEY_IAT_LANGUAGE_PREFERENCE = "iat_language_preference";
    public static final String SP_KEY_IAT_VADBOS_PREFERENCE = "iat_vadbos_preference";
    public static final String SP_KEY_IAT_VADEOS_PREFERENCE = "iat_vadeos_preference";
    public static final String SP_KEY_IAT_PUNC_PREFERENCE = "iat_punc_preference";

    // 用户多长时间不说话则当做超时处理
    public static final String USER_MUTE_TIMEOUT = "4000";
    // 用户停止说话多长时间内即认为不再输入， 自动停止录音
    public static final String USER_STOP_RECORD_TIMEOUT = "1000";
    // 设置标点符号,设置为"0"返回结果无标点,设置为"1"返回结果有标点
    public static final String USER_DEFAULT_FLAG = "1";



}
