package users;

import java.util.Date;

public class UserException extends Exception {
    private String message;
    private String timestamp;

    public UserException() {
        super();
        this.setMessage("Что то пошло не так");
        timestamp = new Date().toString();
    }

    public UserException(String message) {
        super();
        this.setMessage(message);
        timestamp = new Date().toString();
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
