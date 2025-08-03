package DesignPatterns.CreationalDesignPatterns.SingletonDesignPattern.Solution;

public class WithSingletonPattern {
    public static void main(String[] args) {
        // AppSettings appSettings = new AppSettings(); // not allowed because constructor is private
        // AppSettings appSettingsCopy = new AppSettings(); // not allowed because constructor is private

        AppSettings appSettings = AppSettings.getInstance(); // creates a new obejct
        AppSettings appSettingsCopy = AppSettings.getInstance(); // will point to the same object as the earlier

        System.out.println(appSettings.getApiKey()); //12345-ABCDE
        System.out.println(appSettingsCopy.getApiKey()); //12345-ABCDE

        // No More Memory
        System.out.println(appSettings == appSettingsCopy); // true
    }
}
