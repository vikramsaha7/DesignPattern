package ObserverDesignPattern.observable;

import java.util.List;
import java.util.ArrayList;
import ObserverDesignPattern.observer.NotificationObserver;

public class IphoneStockObservable implements StockObservable {
	public int noOfStock=0;
	public List<NotificationObserver> observerList=new ArrayList<>();
	@Override
	public void add(NotificationObserver obj) {
		// TODO Auto-generated method stub
		observerList.add(obj);
	}

	@Override
	public void remove(NotificationObserver obj) {
		// TODO Auto-generated method stub
		observerList.remove(obj);
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(NotificationObserver obj:observerList) {
			obj.update();
		}
	}

	@Override
	public void setStockCount(int count) {
		// TODO Auto-generated method stub
		if(noOfStock==0)
			notifySubscriber();
		noOfStock=count;
	}

	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return noOfStock;
	}

}
