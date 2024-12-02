class Employee {
	int empid;
	String name;
	Employee(int empid,String name){
		this.empid=empid;
		this.name=name;
	}
	public static void main(String args[]) {
		Employee e1=new Employee(101,"Yash");
		Employee e2=new Employee(102,"Raj");
		System.out.println(e1.empid+" "+e1.name);
		System.out.println(e2.empid+" "+e2.name);
	
		
		}

}
