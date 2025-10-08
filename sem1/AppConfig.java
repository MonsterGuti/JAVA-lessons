public class AppConfig {
    public static final String APP_NAME = "MyFitnessApp";
    public static final String VERSION = "10.09.08";
    public static final String AUTHOR = "Martin Gogulanov";

    public static void printInfo() {
        System.out.println("App: " + APP_NAME);
        System.out.println("Version: " + VERSION);
        System.out.println("Author: " + AUTHOR);
    }

    public static void main(String[] args) {
        AppConfig.printInfo();
    }
}
