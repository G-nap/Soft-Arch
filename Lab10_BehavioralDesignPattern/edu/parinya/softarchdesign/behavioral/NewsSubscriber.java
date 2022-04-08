package edu.parinya.softarchdesign.behavioral;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
	// You need to implement this class
	private final String name;
    
	NewsSubscriber(String name) {
			this.name = name;
	}

	@Override
	public void onSubscribe(Subscription subscription) {
			System.out.println("Subscribe NewsSubscriber");
			System.out.println(name + " subscribed to " + subscription.getClass().getName());
	}

	@Override
	public void onNext(News item) {
			System.out.println(name + " get news : " + item.getContent());
	}

	@Override
		public void onComplete() {
				System.out.println("Complete <NewsSubscriber>");
		}

	@Override
	public void onError(Throwable throwable) {
			System.out.println("Error <NewsSubscriber>");
	}

	

}
