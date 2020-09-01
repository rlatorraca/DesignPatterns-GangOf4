package Observer.example01.model;



import java.util.List;

import Observer.example01.interfaces.Observer;
import Observer.example01.interfaces.Subject;

public class EmailTopic implements Subject{
	
	private List<Observer> observers;
	private String message;
	
	

	public EmailTopic(List<Observer> observers) {
		this.observers = observers;

	}

	@Override
	public void register(Observer observer) {
		if(observer == null ) {
			throw new NullPointerException("Null object/observer");
		}
		
		if(!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);		
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
		
	}
	
	public void postMessage(String msg) {
		System.out.println("Message posted to my topic : " + msg);
		this.message = msg;
		notifyObservers();
	}

	@Override
	public Object getUpdate(Object object) {
		return this.message;
	}


}
