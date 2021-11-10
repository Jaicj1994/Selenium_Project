package Select;

public class Grade_A extends Worst{
	
	
	public void Method1()
	{
		System.out.println("Your failed in this test");
		
	}
	
	public static void main(String args[])
	{
		Worst par=new Grade_A();
		par.Method1();
		
	}

}
