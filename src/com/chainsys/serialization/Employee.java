package com.chainsys.serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable {

	/**
	 * 
	 */
	//private static final long serialVersionUID = -1896699121531852289L;
	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;
	int id;
	static String name = "Ravi";
//transient fields will not be stored in the serialized file
	String password;

	public Employee(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

}
