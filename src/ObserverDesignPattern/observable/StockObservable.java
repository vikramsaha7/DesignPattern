package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.NotificationObserver;

public interface StockObservable {
	public void add(NotificationObserver obj);
	public void remove(NotificationObserver obj);
	public void notifySubscriber();
	public void setStockCount(int count);
	public int getStockCount();
}
