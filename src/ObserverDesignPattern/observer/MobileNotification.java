package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.StockObservable;

public class MobileNotification implements NotificationObserver {
	private String mobileNo;
	private StockObservable observable;
	
	public MobileNotification(String mobileNo, StockObservable observable) {
		super();
		this.mobileNo = mobileNo;
		this.observable = observable;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Sms sent to: "+mobileNo);
		System.out.println(observable.getStockCount());
	}
}
