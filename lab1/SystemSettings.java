package lab1;

public class SystemSettings {
    public static final String DEFAULT_LANGUAGE = "English";
    public static final int DEFAULT_MAX_USERS = 30;
    public static final double DEFAULT_TIMEOUT = 1.5;

    private String language = DEFAULT_LANGUAGE;
    private int maxUsers = DEFAULT_MAX_USERS;
    private double timeout = DEFAULT_TIMEOUT;

    public void printSettings() {
        System.out.println("Language: " + language + ", Max Users: " + maxUsers + ", Timeout: " + timeout);
    }

    public void resetToDefault() {
        language = DEFAULT_LANGUAGE;
        maxUsers = DEFAULT_MAX_USERS;
        timeout = DEFAULT_TIMEOUT;
    }

    public static void main(String[] args) {
        SystemSettings settings = new SystemSettings();
        settings.printSettings();
        settings.language = "Spanish";
        settings.maxUsers = 50;
        settings.timeout = 2.0;
        settings.printSettings();
        settings.resetToDefault();
        settings.printSettings();
    }
}
