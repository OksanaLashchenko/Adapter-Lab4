public class Main {

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification("oksana@yahoo.com");
        EmailAdapter emailAdapter = new EmailAdapter(emailNotification);
        SlackNotification slackNotification = new SlackNotification("oksana", "key", 10L);
        SmsNotification smsNotification = new SmsNotification("CompanyA", "9804610");
        emailAdapter.send("You'got a chance!", "Use your chance!");
        SlackAdapter slackAdapter = new SlackAdapter(slackNotification);
        SmsAdapter smsAdapter = new SmsAdapter(smsNotification);
        slackAdapter.send("You'got a chance!", "Use your chance!");
        smsAdapter.send("You'got a chance!", "Use your chance!");
    }

}
