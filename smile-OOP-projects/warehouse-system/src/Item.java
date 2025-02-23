

public class Item {
	
	
	private static int itemCounter = 0;
	
	private int inputNumber;
	
	private String name;
	private float price;
	private int count;
	private byte type;
	
	

	public Item(String name, float price, int count, byte type) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
		this.type = type;
		itemCounter++;
		inputNumber = itemCounter;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public byte getType() {
		return type;
	}


	public void setType(byte type) {
		this.type = type;
	}



	public String getItemCode() 
	{
		return inputNumber + name.substring(0,2) + type;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		  return String.format("%d, %s, %.2f лв., %d броя, %d тип, %s", 
                  inputNumber, name, price, count, type, getItemCode());
	}
	
	
	//za 3 tochka
	
	public float calculateValue() 
	{
		return price*count;
		
	}
	
	
	
	
	

}
