package com.java8.emp.storing;

import java.util.Arrays;
import java.util.List;

public class sortingexobject {
	public static void main(String[] args) {
		List<emps> emps = Arrays.asList(new emps(56, "ratan", 10000.56), new emps(23, "anu", 30000.56),
				new emps(11, "chilaka", 80000.56), new emps(18, "molaka", 20000.56), new emps(56, "pilaka", 40000.56));
		
		     emps.sort((e1,e2) -> e1.eid.compareTo(e2.eid));
		     emps.forEach(emp ->System.out.println(emp));
		     System.out.println("****************************");
		     emps.sort((e1,e2) -> e1.ename.compareTo(e2.ename));
		     emps.forEach(emp ->System.out.println(emp));
		     System.out.println("****************************");
		     
		     emps.stream().filter(emp->emp.esalary<=50000).sorted((e1,e2)-> e1.esalary.compareTo(e2.esalary))
		     .forEach(emp ->System.out.println(emp));
		     

	}

}
