package user;

public class MessageSender {
    public void send(String text, User user, String country) {
        if (user.getCountry().equals(country)) {
            user.setMessage(text);
        }
    }
}
