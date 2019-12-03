package modules.execution;

import testDrivers.TestDriver;

public class TestExecution {

	public static void main(String[] args) {
//		
//			String testCases [] = {"newemp_001","newemp_002","newemp_003"};
		
//		String testCases [] = {"newemp_001"};
//			for (int i = 0; i < testCases.length; i++) {
//				TestDriver.tDriver(testCases[i],"EmployeeConfig","NewEmp");
//			}
			
		String testCases [] = {"editemp_001"};
//		String testCases [] = {"editemp_001","editemp_002","editemp_003","editemp_004"};
	
			for (int i = 0; i < testCases.length; i++) {
				 TestDriver.tDriver(testCases[i],"EmployeeConfig","EditEmp");
			}
			
			
	}

}
