package vijay.assitedprojects.com;

public class InnerClassesType1 {
	
	
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {
		InnerClassesType1 obj=new InnerClassesType1();
		InnerClassesType1.Inner in=obj.new Inner();  
		in.hello();  

	}

}
