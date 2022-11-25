public class SlackAdapter implements Notification {

    private final SlackNotification slackNotification;

    public SlackAdapter(SlackNotification slackNotification) {
        this.slackNotification = slackNotification;
    }

    public void send(String title, String message) {
        System.out.println("Sent Slack message " + message + " with title " + title + " to login: " + this.slackNotification.getLogin() + " with apiKey: " + this.slackNotification.getApiKey() + " to chat " + this.slackNotification.getChatId());
    }

}
