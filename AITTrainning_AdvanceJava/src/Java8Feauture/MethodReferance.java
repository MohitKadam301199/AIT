package Java8Feauture;

interface Saayable{
	
	void talk();
}


public class MethodReferance {
	
	public void add()
	 {
		 int a=10;
	     int b=5;
		 int sum;
		 sum=a+b;
		 System.out.println("Addition of a+b :"+sum);
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		MethodReferance mr=new MethodReferance();
		//Method referance using lambda
		Saayable s=mr::add;
		s.talk();

	}

}
