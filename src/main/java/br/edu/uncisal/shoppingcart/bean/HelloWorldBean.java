package br.edu.uncisal.shoppingcart.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloworld")
public class HelloWorldBean {
	
	public String getHelloWorld() {
		return "Hello World String";
	}

}
