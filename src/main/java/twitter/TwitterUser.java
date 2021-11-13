package twitter;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String userEmail;
    private String country;
    private Date LastActiveTime;
    public String message;
}
