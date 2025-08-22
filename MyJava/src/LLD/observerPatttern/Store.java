package LLD.observerPatttern;

import LLD.observerPatttern.observable.IphoneObservableImp;
import LLD.observerPatttern.observable.StocksObservable;
import LLD.observerPatttern.observer.EmailAlertObserverImp;
import LLD.observerPatttern.observer.NotificationObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphonestocksObservable = new IphoneObservableImp();

        NotificationObserver observer1 = new EmailAlertObserverImp("xyz@email.com", iphonestocksObservable);
        NotificationObserver observer2 = new EmailAlertObserverImp("xyz2@email.com", iphonestocksObservable);
        NotificationObserver observer3 = new EmailAlertObserverImp("xyz3_username", iphonestocksObservable);

        iphonestocksObservable.add(observer1);
        iphonestocksObservable.add(observer2);
        iphonestocksObservable.add(observer3);

        iphonestocksObservable.setStockCount(20);
        iphonestocksObservable.setStockCount(-20);
        iphonestocksObservable.setStockCount(20);

    }
}
