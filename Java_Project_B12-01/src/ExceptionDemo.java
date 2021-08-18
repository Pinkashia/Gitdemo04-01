import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		String s=null;
		try {
			//suspected code
			c=a/b;
						
		}
		catch(NullPointerException e)
		{
			System.out.println("division by zero");
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
		//ArrayIndexOutOfBoundException
		
		/*try {
			s.indexOf('s');
		}
		catch(NullPointerException e1)
		{
			System.out.println("null poiter exception is raised");
		}*/
		//System.out.println("**");
	}

}
