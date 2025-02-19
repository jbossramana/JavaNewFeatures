package demo;

public class AppConfig {
    private String appName;
    private int maxConnections;
    private boolean isDebugMode;

    private AppConfig() {
        // Private constructor to enforce the use of the builder
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAppName() {
        return appName;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isDebugMode() {
        return isDebugMode;
    }

    public static class Builder {
        private AppConfig config;

        private Builder() {
            this.config = new AppConfig();
        }

        public Builder withAppName(String appName) {
            config.appName = appName;
            return this;
        }

        public Builder withMaxConnections(int maxConnections) {
            config.maxConnections = maxConnections;
            return this;
        }

        public Builder withDebugMode(boolean isDebugMode) {
            config.isDebugMode = isDebugMode;
            return this;
        }

        public AppConfig build() {
            // Validation logic, if needed, can be added here
            return config;
        }
    }
}
