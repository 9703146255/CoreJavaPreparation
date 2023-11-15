package com.thiru.memory.types;

 class No02Employee {
	 
	 int orgId=45554;
	 String orgName="HYR tutorials";
	 String ceo="yadagiri";
	 int noOfDepts=2;
	 static double netWorth=500.00;
	 
	 public int getOrgId()
	 {
		 return orgId;
	 }
	 
	 public static double getNetWorth()
	 {
		 return netWorth;
	 }
	 
	 public void deleteEmployee(int empId)
	 {
		 
	 }
	 
	 public static void main(String args[])
	 {
		 int eId=101;
		 String empName="jhon";
		 double salary=5000.00;
		 No02Employee e1=new No02Employee();
		 e1.getOrgId();
		 System.out.println(No02Employee.getNetWorth());
		 
	 }

}
