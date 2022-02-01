package Java8Feauture;


interface Sayable{
	
	void talk();
}

public class StaticMethodReferance {
	
	public static void add()
	 {
		 int a=10;
	     int b=5;
		 int sum;
		 sum=a+b;
		 System.out.println("Addition of a+b :"+sum);
	 }
	public static void main(String[] args) {
	
		//Static Method referance using lambda
		Sayable s=StaticMethodReferance::add;
		s.talk();
		
	}

}
