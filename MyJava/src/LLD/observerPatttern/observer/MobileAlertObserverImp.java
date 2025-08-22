package LLD.observerPatttern.observer;

import LLD.observerPatttern.observable.StocksObservable;

public class MobileAlertObserverImp implements NotificationObserver {
    String username;
    StocksObservable observable;

    public MobileAlertObserverImp(String username, StocksObservable observable) {
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username, "product is in stock, hurry up!");
    }
    public void sendMsgOnMobile(String username, String message) {
        System.out.println("msg sent to " + username);
    }
}
