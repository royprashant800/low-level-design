package LLD.observerPatttern.observable;

import LLD.observerPatttern.observer.NotificationObserver;
import LLD.observerPatttern.observer.NotificationObserver;

import java.util.*;

public class IphoneObservableImp implements StocksObservable{
    List<NotificationObserver> observerList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0) {
            notifySubscribers();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
