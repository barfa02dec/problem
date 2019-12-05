package practice.com.problem;

import java.util.Optional;

import practice.com.exception.NullValueException;

/* Class for employee details */

public class Employee {
	private int id;
	private String name;//if name == null

	public Employee(int id, String name) throws NullValueException{
		super();
		Optional<String> check_name = Optional.ofNullable(name);
		if(check_name.isPresent())
			this.name = name;
		else 
			throw new NullValueException("Invalid name");
		this.id=id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	/* Method of check id's is equal or not */
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(this.getId()==e.getId()) {
			return true;
		}
		return false;
	}	
}