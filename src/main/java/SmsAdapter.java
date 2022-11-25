public class SmsAdapter implements Notification {

    private final SmsNotification smsNotification;

    public SmsAdapter(SmsNotification smsNotification) {
        this.smsNotification = smsNotification;
    }

    public void send(String title, String message) {
        System.out.println("Sent sms " + message + " with title " + title + " to: " + this.smsNotification.getPhoneNumber() + " from: " + this.smsNotification.getSender());
    }

}

