package telecom;

import java.util.ArrayList;
import java.util.List;

public class Customers {
	private String fullname;
	private String phoneNumber;
	private int numberОfCallsMade;
	private List<Calls> calls = new ArrayList<Calls>();
	
	
	public Customers(String fullname,String phoneNumber,int numberОfCallsMade) 
	{
		this.setFullname(fullname);
		this.setPhoneNumber(phoneNumber);
		this.setNumberОfCallsMade(numberОfCallsMade);
		
	}
	
	
	public String getFullname() 
	{
		return fullname;
	}
	public String getPhoneNumber() 
	{
		return this.phoneNumber;
	}
	public int getNumberОfCallsMade() 
	{
		 return this.numberОfCallsMade;
	}
	
	public void setPhoneNumber(String phoneNumber) 
	{
		if(phoneNumber.isBlank() || phoneNumber.isEmpty()) 
		{
			throw new IllegalArgumentException("Телефоният номер липсва.Моля въведете валид телефонен номер");			
		}
		if(phoneNumber.length()<13 || phoneNumber.length() >13) 
		{
			throw new IllegalArgumentException("Не валиден телефонен номер");
		}
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	public void setFullname(String fullname) 
	{
		if(fullname.isBlank() || fullname.isEmpty() ) 
		{
			throw new IllegalArgumentException("Името липсва.Моля въведете валидно потребителско име");
		}
		if(fullname.length() >35) 
		{
			throw new IllegalArgumentException("Името не може да бъде по дълго от 35 символа");
		}
		this.fullname = fullname;
	}
	
	public void setNumberОfCallsMade(int numberОfCallsMade) 
	{
		if(numberОfCallsMade>100 || numberОfCallsMade <0) 
		{
			throw new IllegalArgumentException("Бройката на проведените разгоеори неможе да бъде отрицателна или по голяма от 100");
		}
		this.numberОfCallsMade = numberОfCallsMade;
	}
	
	public void addCalls(Calls call) 
	{
		this.calls.add(call);
	}
	public String getTotalTimeSpentOnCalls() 
	{
		int totalSecondForAllCalls = 0;
		for(Calls c: calls) 
		{
			totalSecondForAllCalls+=c.getDurationInSeconds();
		}
		// превръщам общият брой секунди в час минута секуда: 
		int hours = totalSecondForAllCalls / 3600;
		int minutes = (totalSecondForAllCalls % 3600) / 60;
		int seconds = totalSecondForAllCalls % 60;
		
		return String.format("%dчаса : %02dминути : %02dсекунди", hours ,minutes ,seconds );
	}
	
}
