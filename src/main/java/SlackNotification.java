public class SlackNotification {

    private final String login;
    private final String apiKey;
    private final Long chatId;

    public SlackNotification(String login, String apiKey, Long chatId) {
        this.login = login;
        this.apiKey = apiKey;
        this.chatId = chatId;
    }

    public String getLogin() {
        return this.login;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public Long getChatId() {
        return this.chatId;
    }
}

