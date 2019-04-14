package org.yyx.netty.exception;

/**
 * 参数错误异常
 * <p>
 */
public class ErrorParamsException extends RuntimeException {
    private static final long serialVersionUID = -623198335011996153L;

    public ErrorParamsException() {
        super();
    }

    public ErrorParamsException(String message) {
        super(message);
    }
}
