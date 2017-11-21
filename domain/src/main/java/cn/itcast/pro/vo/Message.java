package cn.itcast.pro.vo;

import java.io.Serializable;

/**
 * Created by JohnBi on 2017-11-21. 9:46
 *
 * @author Lemon
 */
public class Message implements Serializable {
    private Boolean success;
    private String message;

    public Message() {
    }

    public Message(Boolean success, String message) {

        this.success = success;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "success='" + success + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
