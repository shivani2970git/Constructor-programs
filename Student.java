class Student {
	int rollno;
	String name;
	Student(){
		System.out.println("this is Default Constructor");
		
	}
	Student(int rn,String nm){
		this.rollno=rn;
		this.name=nm;
		System.out.println(rollno+" "+name);
	}
	public static void main(String args[]) {
		Student s1=new Student();
		Student s2=new Student(1,"pooja");
	}

}
