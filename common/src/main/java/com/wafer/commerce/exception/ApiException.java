package com.wafer.commerce.exception;

import com.wafer.commerce.api.IErrorCode;
import org.springframework.beans.factory.annotation.Autowired;

public class ApiException extends RuntimeException{
    private IErrorCode errorCode;

    /**
     * 接受一个 IErrorCode 对象，调用父类构造方法并存储 errorCode
     * @param errorCode 自定义错误代码和消息的接口实现
     */
    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    /**
     * 接受一个字符串消息，调用父类构造方法
     * @param message 错误消息
     */
    public ApiException(String message) {
        super(message);
    }

    /**
     * 接受一个 Throwable 对象，调用父类构造方法
     * @param cause 原因
     */
    public ApiException(Throwable cause) {
        super(cause);
    }

    /**
     * 接受一个字符串消息和一个 Throwable 对象，调用父类构造方法
     * @param message 错误消息
     * @param cause 原因
     */
    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 返回存储在成员变量中的 IErrorCode 对象
     * @return 自定义错误代码和消息的接口实现
     */
    public IErrorCode getErrorCode() {
        return errorCode;
    }


}
