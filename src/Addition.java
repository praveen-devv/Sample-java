import java.util.*;
public class Addition extends Subtraction {
	public static void main(String[] args) {
		Addition add = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b= sc.nextInt();
		System.out.println("Enter the name:");
		String name=sc.next();
		int d=a+b;
		System.out.println("A+b="+d);
		
		System.out.println("Name"+name);
		add.sub();
		int arr[]= {2,2,3,4};
		System.out.print(arr.length);
		
		
		
	}
}
