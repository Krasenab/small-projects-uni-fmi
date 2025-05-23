package telecom;

public class Calls {
	
	private int startHour;
	private int startMinute;
	private int startSecond;
	private int endHour;
	private int endMinute;
	private int endSecond;
	

	
	public Calls(int startHour, int startMinute, int startSecond, int endHour, int endMinute, int endSecond) 
	{
		this.startHour = startHour;
		this.startMinute = startMinute;
		this.startSecond = startSecond;
		this.endHour = endHour;
		this.endMinute = endMinute;
		this.endSecond = endSecond;
	}
	
	public int getDurationInSeconds() 
	{
		// превръщам начлното време в секунди както и крайното време 
		int startInSecond = this.startHour * 3600 + this.startMinute * 60 + this.startSecond;
		int endInSecond = this.endHour * 3600 + this.endMinute* 60 + this.endSecond;
		// връщам продължителността на разговора в секунди  
		return endInSecond - startInSecond;
	}
	
	
	
}
