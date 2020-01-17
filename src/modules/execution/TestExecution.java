package modules.execution;



import testDrivers.TestDriver;

public class TestExecution {

	
	public static void main(String[] args) {
	
//		String testCasesNew [] = {"newemp_001","newemp_002","newemp_003"};
//		String testCasesNew [] = {"calendar_001"};
//		String testCasesNew [] = {"editemp_001","editemp_002","editemp_003","editemp_004","editemp_005","editemp_006"};	
//		String testCasesNew [] = {"leavemuster_001"};
//		TestDriver.tDriver(testCasesNew[i],"EmployeeConfig","NewEmp");
//		TestDriver.tDriver(testCasesNew[i],"CalendarConfig","Calendar");
//		 TestDriver.tDriver(testCasesNew[i],"LeaveMusterConfig","ViewMuster");
			
		String testCasesNew [] = {"newemp_001"};
		for (int i = 0; i < testCasesNew.length; i++) {
			TestDriver.tDriver(testCasesNew[i],"EmployeeConfig","NewEmp");
			
			
		}	
	}
}

   