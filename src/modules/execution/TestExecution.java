package modules.execution;

import testDrivers.TestDriver;

public class TestExecution {

	public static void main(String[] args) {
//		
////			String testCases [] = {"newemp_001","newemp_002","newemp_003"};
//			String testCases [] = {"newemp_001"};
//		
//			for (int i = 0; i < testCases.length; i++) {
//				TestDriver.tDriver(testCases[i],"EmployeeConfig","NewEmp");
//			}
			
		String testCasesNew [] = {"editemp_001"};
//		String testCasesNew [] = {"editemp_001","editemp_002","editemp_003","editemp_004","editemp_005","editemp_006"};
//	
			for (int i = 0; i < testCasesNew.length; i++) {
				 TestDriver.tDriver(testCasesNew[i],"EmployeeConfig","EditEmp");
			}
			
			
	}
	
//	public String getMessage(){
//		System.out.println("This is HRMS Automation Project");
//		String testCasesNew [] = {"editemp_001"};
////		String testCasesNew [] = {"editemp_001","editemp_002","editemp_003","editemp_004","editemp_005","editemp_006"};
////	
//			for (int i = 0; i < testCasesNew.length; i++) {
//				 TestDriver.tDriver(testCasesNew[i],"EmployeeConfig","EditEmp");
//			}
//        return "Hello World, This is HRMS Automation Project";
//    }

}

