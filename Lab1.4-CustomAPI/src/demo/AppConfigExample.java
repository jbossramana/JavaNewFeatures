package demo;

/*Real-time Usage: Configuration Builder
Suppose you are designing a configuration builder for a system that 
requires a flexible and easy-to-use setup. The fluent API can be employed 
to create a readable and expressive configuration:*/
	
public class AppConfigExample {
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.builder()
                .withAppName("MyApp")
                .withMaxConnections(100)
                .withDebugMode(true)
                .build();

        System.out.println("App Name: " + appConfig.getAppName());
        System.out.println("Max Connections: " + appConfig.getMaxConnections());
        System.out.println("Debug Mode: " + appConfig.isDebugMode());
    }
}
