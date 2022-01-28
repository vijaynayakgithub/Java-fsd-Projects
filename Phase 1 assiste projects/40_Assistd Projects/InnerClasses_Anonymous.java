package vijay.assitedprojects.com;

public class InnerClasses_Anonymous {

	public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();

	}

}


abstract class AnonymousInnerClass {
	   public abstract void display();
	}