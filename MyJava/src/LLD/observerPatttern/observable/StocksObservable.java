package LLD.observerPatttern.observable;

import LLD.observerPatttern.observer.NotificationObserver;

public interface StocksObservable {
    public void add(NotificationObserver notificationobserver);

    public void remove(NotificationObserver notificationobserver);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
