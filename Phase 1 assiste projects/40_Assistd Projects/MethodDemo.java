package vijay.assitedprojects.com;

public class MethodDemo {
		
	public static void main(String[] args) {
		MethodDemo b=new MethodDemo();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}

	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

}