package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import telecom.Calls;
import telecom.Customers;

public class CustomerFactory {
	
	private static int counterCustomers = 1;
	private List<Customers> c = new ArrayList<>();
	
	
	private static String name = "";	
	private static String phoneNumber="";
	private static int numbersOfCalls = 0;
	
	private static String regex = "^(?=.{1,35}$)[А-Яа-яA-Za-z]+ [А-Яа-яA-Za-z]+ [А-Яа-яA-Za-z]+$";
	private static String phoneRegex = "^\\+[0-9]{12}$";
	
	public static List<Customers> createFromUserInputs(Scanner sc,int n) 
	{
		for(int a=0; a<n;a++) 
		{
			System.out.printf("Въведете телефонен номер на клиент номер %d: ",counterCustomers);
			
			do {				
				phoneNumber = sc.nextLine();
			}while(!phoneNumber.matches(phoneRegex));
			
			System.out.printf("Име на клиент номер %d: ",counterCustomers);			
			
			do{				
				name = sc.nextLine();
			}
			while(!name.matches(regex));
			
			System.out.printf("Въведете броя на разговорите които клиента е провел (минимум брой разговори: 0 / максимум брой разговори: 100): ");
			numbersOfCalls = sc.nextInt();
			Customers customer = new Customers(name,phoneNumber,numbersOfCalls);
		    
		    for(int b=0;b<numbersOfCalls;b++)
		    {
		    	System.out.printf("Въведете за разговр номер %d :начални и крайни час, минута и секунда.", n);
		    	int startHour = sc.nextInt();
		    	int startMinute = sc.nextInt();
		    	int startSecond = sc.nextInt();
		    	int endHour = sc.nextInt();
		    	int endMinute = sc.nextInt();
		    	int endSecond = sc.nextInt();
		    	Calls call = new Calls(startHour,startMinute,startSecond,endHour,endMinute,endSecond);
		    	customer.addCalls(call);
		    }
			counterCustomers++;
			
		}
		return null;
		
	}
}
