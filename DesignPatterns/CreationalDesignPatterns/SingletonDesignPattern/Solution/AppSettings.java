package DesignPatterns.CreationalDesignPatterns.SingletonDesignPattern.Solution;

public class AppSettings {
    // Step1 - Declare private static instance of the class
    private static AppSettings instance; // Reference to the AppSetting call, static because only static methods deals with static variables

    private String dataBaseUrl;
    private String apiKey;

    // Step2 - Private constructor to prevent direct object creation
    private AppSettings(){
        dataBaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "12345-ABCDE";
    }

    // Step3 - Public static method to get single instance of the class
    // static because it is a method of class not the object
    public static AppSettings getInstance(){
        if(instance == null){
            instance = new AppSettings(); // constructor called from this method
        }
        return instance;
    }

    public String getDatabseUrl(){
        return dataBaseUrl;
    }

    public String getApiKey(){
        return apiKey;
    }
}
