package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;
// A tightly coupled version without the Observer Pattern

class NewsAgency {
    private String news;
    private MobileApp mobileApp;
    private Website website;

    public void setNews(String news) {
        this.news = news;
        if (mobileApp != null) {
            mobileApp.update(this.news);
        }
        if (website != null) {
            website.update(this.news);
        }
    }

    public void setMobileApp(MobileApp mobileApp) {
        this.mobileApp = mobileApp;
    }

    public void setWebsite(Website website) {
        this.website = website;
    }
}

// Mobile App subscriber
class MobileApp {
    public void update(String news) {
        System.out.println("Mobile App: " + news);
    }
}

// Website subscriber
class Website {
    public void update(String news) {
        System.out.println("Website: " + news);
    }
}

public class WithoutObserverPattern{
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        MobileApp mobileApp = new MobileApp();
        Website website = new Website();
        agency.setMobileApp(mobileApp);
        agency.setWebsite(website);

        agency.setNews("New updated");
    }
}

// 🚫 Problems with This Approach:
// Tight coupling: NewsAgency needs to know all its subscribers (e.g., MobileApp, Website).
// Low scalability: Adding a new subscriber (like an EmailClient) means modifying NewsAgency.
// Violation of Open/Closed Principle: You must change existing code to extend behavior.