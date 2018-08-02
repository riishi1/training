package lti.reflect;

import java.security.BasicPermission;
import java.security.Permission;

public class Customer {
	private String name;

	public Customer() {
	}

	public Customer(String name) {
		this.name = name;
	}
	
	private void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("Stay away") {});
		System.out.println("Name: " + name);
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}
}
