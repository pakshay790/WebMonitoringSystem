package modules.execution;

import testDrivers.TestDriver;

public class TestExecution {

	public static void main(String[] args) {
		
			String testCases [] = {"newemp_001","newemp_002","newemp_003"};
			
			for (int i = 0; i < testCases.length; i++) {
				TestDriver.tDriver(testCases[i],"EmployeeCreationConfig","NewEmp");
			}
		
			
			
	}

}
