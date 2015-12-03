package demo.test;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class Perpetrator {
	public static void main(String[] args) {
		System.out.println((String) AccessController.doPrivileged(new PrivilegedAction(){
			@Override
			public Object run() {
				return System.getProperty("classpath");
			}
			
		}));
	}
}
