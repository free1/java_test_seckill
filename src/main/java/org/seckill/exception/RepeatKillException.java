package org.seckill.exception;

/**
 * 重复秒杀异常
 * Created by free on 16/10/16.
 */
public class RepeatKillException extends RuntimeException {
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
