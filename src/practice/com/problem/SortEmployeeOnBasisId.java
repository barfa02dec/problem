package practice.com.problem;

import java.util.Comparator;

import practice.com.problem.Employee;

/* class for implements comparator for compare to id's of class Employee */
public class SortEmployeeOnBasisId implements Comparator<Employee>{
	/* Override compare method for comparing Id's an returns positive or negative int*/
	@Override
	public int compare(Employee obj1,Employee obj2) {
		if(obj1.getId()>obj2.getId())
			return 1;
		else if(obj1.getId()<obj2.getId())
			return -1;
		else 
			return 0;
	}
}