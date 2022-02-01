package Java8Feauture;

interface Car{

void swift();

}
public class LambdaExpressionExample  {

	public static void main(String[] args) {
	
	 //lambda expression	
	 Car c=()->System.out.println("Swift Car is in White Colour :");
	 c.swift();
	 
	}
}
