package vijay.assitedprojects.com;

public class AccessModifier_DefaultAccessModifier {
	public static void main(String[] args) {
		
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 
	}
}

class defAccessSpecifier{ 
  void display() { 
         System.out.println("You are using default access specifier"); 
     } 
} 
