package First_project;

public class MyClass {
	
	public int areaRect(int l , int b)
	{
		return (l*b);
	}

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		int l;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length :");
		l=sc.nextInt();
		System.out.println("Enter Breadth :");
		b=sc.nextInt();
		System.out.println("Area of the given Rectangle is : "+ob.areaRect(l, b) );
	}


}
