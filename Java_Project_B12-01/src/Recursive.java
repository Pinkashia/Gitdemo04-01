
public class Recursive {
	
	
	public void display()
	{  int i=0;
		System.out.println("Hello");
		while(i<=10)
		{   display();
			i++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Recursive obj= new Recursive(); //object is ready 
		 obj.display();
		 
		
		

	}

}
