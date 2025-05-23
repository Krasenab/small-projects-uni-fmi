package main;

import java.util.Scanner;

import telecom.Calls;
import telecom.Customers;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nClients = 0;
		
		do{
			System.out.print("Моля въведете борй клиенти между 10 и 50 :");
			nClients = sc.nextInt();
		}
		while(nClients<1 || nClients>50); 
		CustomerFactory.createFromUserInputs(sc, nClients);
		//test2();
		

		
		
	}
	public static void test2() 
	{
		Scanner sc = new Scanner(System.in);
		String regexx = "^(?=.{1,35}$)[А-Яа-яA-Za-z]+ [А-Яа-яA-Za-z]+ [А-Яа-яA-Za-z]+$";
		String input = "";
		do{
			System.out.println("Моля въвдете трите имена на клиент:\n");
			input = sc.nextLine();
		}while(!input.matches(regexx));
	}
	public static void TestProgram() 
	{
		Customers c = new Customers("Razgovrnik Razgovornikov","+441234567890",1);		
		Scanner sc = new Scanner(System.in);
		
		for(int a =0; a<c.getNumberОfCallsMade();a++) 
		{			
			String[] inputDataCalls = sc.nextLine().split(" ");
			int startHour = Integer.parseInt(inputDataCalls[0]);
			int startMinute = Integer.parseInt(inputDataCalls[1]);
			int startSecond = Integer.parseInt(inputDataCalls[2]);			
			int endHour = Integer.parseInt(inputDataCalls[3]);
			int endMinute = Integer.parseInt(inputDataCalls[4]);
			int endSecond = Integer.parseInt(inputDataCalls[5]);
						
			Calls ca = new Calls(startHour, startMinute, startSecond, endHour, endMinute,  endSecond);			
			c.addCalls(ca);
		}		
		
		System.out.println(c.getTotalTimeSpentOnCalls());
		
	}

}
