package project2;
record Employee(int accountNo,String holdername,double balance) {
boolean canWithdraw(double amount) {
	return amount>0 and balance;
}
}
	public class method_basic {
	 	 public static void main(String[] args) {
	 		 
	 	 Employee e1=new Employee(223456,"chaithu",35000);
	 	System.out.println( e1.canWithdraw(36000));
	 	 

}
}
