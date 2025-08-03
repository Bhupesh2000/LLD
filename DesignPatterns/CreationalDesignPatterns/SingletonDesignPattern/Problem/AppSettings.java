package DesignPatterns.CreationalDesignPatterns.SingletonDesignPattern.Problem;

public class AppSettings {
    private String dataBaseUrl;
    private String apiKey;

    public AppSettings(){
        // Read setting from config file rather than taking input
        dataBaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "12345-ABCDE";
    }

    public String getDatabseUrl(){
        return dataBaseUrl;
    }

    public String getApiKey(){
        return apiKey;
    }
}
