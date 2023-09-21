package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.StockObservable;

public class EmailNotification implements NotificationObserver {
	private String emailId;
	private StockObservable observable;
	
	public EmailNotification(String emailId, StockObservable observable) {
		super();
		this.emailId = emailId;
		this.observable = observable;
	}

	@Override
	public void update() {
		System.out.println("Email sent to: "+emailId);
		System.out.println(observable.getStockCount());	
	}

}
