package Java8Feauture;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class CustomeDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Date d=new Date();
		System.out.println("using Date class :"+d);
		
		LocalDate l1=LocalDate.now();
		System.out.println("using local date class and now method :"+l1);
		
		System.out.println("*******************************************************************");
		
		System.out.println("Enter your Birthdate dd/mm/yyyy");
		String birthdate=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date d1=sdf.parse(birthdate);
			System.out.println(d1);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("************************************************************************");
		
		LocalDate l2=LocalDate.of(1999, 11, 30);
		System.out.println("using localDate  class and of Method to campare now date to mybirthdate :");
		System.out.println(Period.between(LocalDate.now(), l2));

	}

}
