package DesignPatterns.CreationalDesignPatterns.SingletonDesignPattern.Problem;

public class WithoutSingletonPattern {
    public static void main(String[] args) {
        AppSettings appSettings = new AppSettings(); // only one object should exist
        AppSettings appSettingsCopy = new AppSettings(); // Avoid creating a copy

        System.out.println(appSettings.getApiKey()); //12345-ABCDE
        System.out.println(appSettingsCopy.getApiKey()); //12345-ABCDE
 
        // More Memory
        System.out.println(appSettings == appSettingsCopy); // false
    }
}
