package ObserverDesignPattern;

import ObserverDesignPattern.observable.IphoneStockObservable;
import ObserverDesignPattern.observable.StockObservable;
import ObserverDesignPattern.observer.EmailNotification;
import ObserverDesignPattern.observer.MobileNotification;
import ObserverDesignPattern.observer.NotificationObserver;

public class store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockObservable stObservable=new IphoneStockObservable();
		
		
		//observer
		NotificationObserver observer1=new EmailNotification("vikram@gmail.com", stObservable);
		NotificationObserver observer2=new MobileNotification("7278309980", stObservable);
		
		//subscribe
		stObservable.add(observer1);
		stObservable.add(observer2);
		
		//change in observale
		stObservable.setStockCount(2);
	}

}
