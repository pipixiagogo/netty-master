package org.yyx.netty.study.websocket;

import java.io.Serializable;

/**
 * WebSocketMessage
 * <p>
 * create by 叶云轩 at 2018/5/18-下午3:02
 * contact by tdg_yyx@foxmail.com
 */
public class WebSocketMessage implements Serializable {
    private static final long serialVersionUID = -4666429837358506065L;

    private String accept;
    private String content;
    private Type header;

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Type getHeader() {
        return header;
    }

    public void setHeader(Type header) {
        this.header = header;
    }

    enum Type {
        send_user, send_users, request_success;
    }


}
