
public class Firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 18;
		int num2 = 23;
		String s="tyP";
		StringBuffer sb= new StringBuffer("asD");
		
		
		
		
		//unary operator- 
		//Postfix (a++,a--)
		//a++ -> a=a+1
		//a-- -> a=a-1
		
		//Prefix(++num1, --num1 ) 
		//++num1 -> num1=num1+1
		//--num1 -> num1=num1-1
		/*
		System.out.println(num1);  // 18
		System.out.println(num1++);  //num1=19  display 18
		System.out.println(num1);
		System.out.println(++num1);  //20
		*/
		
		int a= 1;
		int b=7;
		System.out.println(a++ + ++b);  //1+ 6 ->7
		System.out.println(a++ + ++a); //6
		System.out.println(b++ + ++b);  //14
                          
	}
	
}
