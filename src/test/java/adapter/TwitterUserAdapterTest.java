package adapter;

import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TwitterUserAdapterTest {
    TwitterUser user = new TwitterUser("someone@gmail.com", "Ukraine", new Date(), "");
    TwitterUserAdapter twAdapter = new TwitterUserAdapter(user);

    @Test
    void getCountry() {
        assertEquals(twAdapter.getCountry(), "Ukraine");
    }

    @Test
    void getUserEmail() {
        assertEquals(twAdapter.getUserEmail(), "someone@gmail.com");
    }

    @Test
    void setMessage() {
        twAdapter.setMessage("Wow!");
        assertEquals(twAdapter.getMessage(), "Wow!");
    }

    @Test
    void getMessage() {
        assertEquals(twAdapter.getMessage(), "");
    }
}