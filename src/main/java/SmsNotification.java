public class SmsNotification {

    private final String sender;
    private final String phoneNumber;

    public SmsNotification(String sender, String phoneNumber) {
        this.sender = sender;
        this.phoneNumber = phoneNumber;
    }

    public String getSender() {
        return this.sender;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}

