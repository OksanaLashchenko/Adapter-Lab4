public class EmailAdapter implements Notification {

    private final EmailNotification emailNotification;

    public EmailAdapter(EmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }

    @Override
    public void send(String var1, String var2) {
        System.out.println("Sent email with title " + var1 + " to " + emailNotification.getAdminEmail()
                + " that says " + var2);
    }

}
