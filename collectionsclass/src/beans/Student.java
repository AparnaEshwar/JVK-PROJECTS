package beans;

import java.io.ObjectInputStream.GetField;

public class Student {

	private int id;
	private String name;
	

	public Student(int id, String name) {
		super();
		// TODO Auto-generated constructor stub
		this.id= id;
		this.name=name;	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
