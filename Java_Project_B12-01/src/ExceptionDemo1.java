
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] a=new int[5];
			a[5]=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("division by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("division by zero");
		}

	}

}
