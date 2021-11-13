package user;

import adapter.FacebookUserAdapter;
import adapter.TwitterUserAdapter;
import facebook.FacebookUser;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    MessageSender msgSender = new MessageSender();
    FacebookUser fbUser = new FacebookUser("someone@gmail.com", "Ukraine", new Date(), "");
    TwitterUser twUser = new TwitterUser("someone1@gmail.com", "England", new Date(), "");
    FacebookUserAdapter fbAdapter = new FacebookUserAdapter(fbUser);
    TwitterUserAdapter twAdapter = new TwitterUserAdapter(twUser);

    @Test
    void send() {
        msgSender.send("Wow!", fbAdapter, "Ukraine");
        assertEquals(fbUser.getMessage(), "Wow!");
        msgSender.send("Wow!", twAdapter, "Ukraine");
        assertEquals("", twUser.getMessage());
    }
}