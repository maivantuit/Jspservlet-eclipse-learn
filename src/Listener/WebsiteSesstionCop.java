package Listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class WebsiteSesstionCop implements HttpSessionListener {
	private static int numberOfSesstion =0;
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		event.getSession().getServletContext().log("A new session was created"+ ++numberOfSesstion);
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		event.getSession().getServletContext().log("A sesstion was destroyed"+ --numberOfSesstion);
		
	}

}
