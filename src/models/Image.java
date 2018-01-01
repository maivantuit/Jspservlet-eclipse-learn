package models;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class Image implements HttpSessionBindingListener, HttpSessionActivationListener{
	private String name;
	private int weight;
	private int height;	
	public Image() {
		super();
	}
	public Image(String name, int weight, int height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// khi nao nam trong gioi han cua sesstion.
		event.getSession().getServletContext().log("Image in the sesstion"+getName());
		
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// khi nao nam ngoai gioi han cua sesstion.
		event.getSession().getServletContext().log("Image out the sesstion"+getName());
	}
	
	
	@Override
	public void sessionDidActivate(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
