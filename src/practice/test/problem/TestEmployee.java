package practice.test.problem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import practice.com.problem.Employee;
import practice.com.problem.OperationsOnEmployee;
import practice.com.exception.NullValueException;

public class TestEmployee {
	OperationsOnEmployee obj = new OperationsOnEmployee();

	List<Employee> e1 = new ArrayList<>();
	List<Employee> e2 = new ArrayList<>();

		
	@Test(expected = NullValueException.class)
	public void testCompareId() throws NullValueException{
		e1.add(new Employee(1, null));
		obj.compareIds(e1, e2);
	}

	
	
	@Test
	public void test() throws Exception{
		e1.add(new Employee(1, "b"));
		e1.add(new Employee(2, "b"));
		e1.add(new Employee(1, "b"));
		e2.add(new Employee(2, "a"));
		e2.add(new Employee(1, "a"));
		e2.add(new Employee(1, "a"));
		
		assertEquals(true,obj.compareIdsOnBasisSort(e1, e2));
	}
	

	
}
