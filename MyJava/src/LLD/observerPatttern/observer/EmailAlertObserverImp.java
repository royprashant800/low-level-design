package LLD.observerPatttern.observer;

import LLD.observerPatttern.observable.StocksObservable;

public class EmailAlertObserverImp implements NotificationObserver{
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImp(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock, hurry up");
    }
    public void sendMail(String emailId, String message) {
        System.out.println("mail sent to " + emailId);
    }
}
