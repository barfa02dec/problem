package practice.com.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/* Class for perform operation on Employee class */
public class OperationsOnEmployee {

	
	private List<Employee> emp_list_one;
	private List<Employee> emp_list_two;
	static Scanner sc = new Scanner(System.in);
	
	/* Parameterized Constructor */
	public OperationsOnEmployee() {
		emp_list_one = new ArrayList<>();
		emp_list_two = new ArrayList<>();
	}
	
	/* Getters */
	public List<Employee> getEmp_list_one() {
		return emp_list_one;
	}

	public List<Employee> getEmp_list_two() {
		return emp_list_two;
	}
	
	/* Setters*/
	public void setEmp_list_one(List<Employee> emp_list_one) {
		this.emp_list_one = emp_list_one;
	}

	public void setEmp_list_two(List<Employee> emp_list_two) {
		this.emp_list_two = emp_list_two;
	}


	/* Function compare id's of a list into other list if all ids present returns true */
	public boolean compareIds(List<Employee> e1,List<Employee> e2 ) {

		//for loop for check all Id's presents in second list
		for(Employee emp1 : e1) {
			boolean status = false;	
			for(Employee emp2 : e2) {
				if(emp1.equals(emp2)) {
					status = true;
					break;
				}
			}
			if(status == false)//if id not found
				return status;
		}
		return true;
	}
	
	/* Function taking two lists of Employee type returns true or false */
	public boolean compareLists(List<Employee> e1, List<Employee> e2) {
				
		if(e1.size()==0||e2.size()==0)
			return false;
//		else if (e1.size()!=e2.size())
//			return false;
		else if(compareIds(e1, e2))
			return (compareIds(e2, e1));
		else return false;

	}	
		
	
	
	
	/* Method for Sort lists of Employees on basis of id and compare each index of a list to other and returns true or false */ 
	public boolean compareIdsOnBasisSort(List<Employee> list_one,List<Employee> list_two) {
		
		Comparator<Employee> compare = new SortEmployeeOnBasisId();
		Collections.sort(list_one,compare);//sort list_one on basis id
		Collections.sort(list_two,compare);//sort list_two on basis id
		return list_one.equals(list_two);
	
	}
	
	
	
}