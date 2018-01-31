package com.zk.xunfei.lib.zk;

/**
 * ZKException
 * Created by WangQing on 2018/1/31.
 */

public class ZKException extends RuntimeException {

    public ZKException(String message) {
        super(message);
    }

    public ZKException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
