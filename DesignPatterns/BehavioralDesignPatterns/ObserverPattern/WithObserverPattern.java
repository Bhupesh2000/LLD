package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Observer interface that all subscribers must implement
interface Observer {
    void update(String news);
}

// Subject interface for registering, removing, and notifying observers
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// NewsAgencyII is the subject that notifies observers
class NewsAgencyII implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}

// Mobile App observer
class MobileAppII implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Mobile App: " + news);
    }
}

// Website observer
class WebsiteII implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Website: " + news);
    }
}

// Email Client observer
class EmailClientII implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Email Client: " + news);
    }
}



public class WithObserverPattern {
    public static void main(String[] args) {
        NewsAgencyII agency = new NewsAgencyII();

        Observer mobileApp = new MobileAppII();
        Observer website = new WebsiteII();
        Observer emailClient = new EmailClientII();

        agency.registerObserver(mobileApp);
        agency.registerObserver(website);
        agency.registerObserver(emailClient);

        agency.setNews("Breaking News: Observer Pattern Simplified!");
        agency.setNews("Update: Java Makes Patterns Easy!");
    }
}

// 🧠 Benefits of Observer Pattern
// ✅ Loose coupling between subject and observers.
// ✅ Open/Closed Principle: Easily add new observers without modifying the subject.
// ✅ Event-driven: Perfect for real-time systems (GUIs, notifications, etc.)