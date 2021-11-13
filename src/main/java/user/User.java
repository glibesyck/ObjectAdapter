package user;

import java.util.Date;

public interface User {
    String getCountry();
    Date getLastActiveTime();
    String getUserEmail();
    void setMessage(String message);
    String getMessage();
}
