package JAVA8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();//static mathod
		System.out.println(ldt);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
//		DD-MM-YYYY-hh24:mi:ss:ms formate
		
		int day = ldt.getDayOfMonth();
		int mm = ldt.getMonthValue();
		int yr = ldt.getYear();
		int hr = ldt.getHour();
		int min = ldt.getMinute();
		int sec = ldt.getSecond();
		int nano = ldt.getNano();
		
		System.out.println(day+ "-" +mm+ "-" +yr+ ":"+ hr+ ":" +min+ ":" +sec+ ":" +nano);
		
		System.out.println("\nAge calculation ");
		
		LocalDate dob = LocalDate.of(2006, 02, 02);
		LocalDate currdt = LocalDate.now();
		
		Period p = Period.between(dob, currdt);
		int year = p.getYears(); //methods are static
		int month = p.getMonths();
		int days = p.getDays();
		
		System.out.println("Age is : "+"Year:"+year+ "- Month:"+month+"- Days:"+days);
				
	}

}
