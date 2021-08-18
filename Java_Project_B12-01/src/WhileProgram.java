
public class WhileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		System.out.println(x>>1);
		int y=-4;
		System.out.println(y>>1);
		//for loop
		for( int i=1 ; i<=5 ; i++)
		{
			if(i==2)
				continue;
			System.out.println("Hello"+i);

		}	

		//while loop
		int j=0; //initialization
		while(j<5)
		{
			System.out.println("Hi");
			j++; //increment or decrement
		}
		System.out.println("Hello+hi");



	}

}
