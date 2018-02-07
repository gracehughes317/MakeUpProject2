
public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Greeter bob = new Greeter("Bob",52);
		System.out.println(bob.toString());
		
		
		Greeter[] arr = new Greeter[3];
		arr[0]=bob;
		arr[1]= new Greeter();
		arr[2]= new Greeter();
		
		System.out.println(arr[0].toString()+arr[1].toString()+arr[2].toString());
		
		
		
		
	}

}
