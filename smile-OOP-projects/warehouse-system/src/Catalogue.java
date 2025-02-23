import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Catalogue {
	
	//factory pattern
		
		private List<Item> itemsStorage = new ArrayList<>();
		public Catalogue() 
		{
			
		}
		
		
		public void addItem(Item itm) 
		{
			this.itemsStorage.add(itm);
		}
		
		// sorting with Comparator without
		
		public void OrderByNamePrint() 
		{													//ako e chislov tip izpozlawame wrap classa Integer.comparto()....
			Comparator<Item> byName = (Item one,Item two) -> one.getName().compareTo(two.getName());
			itemsStorage.sort(byName);
			 printCatalogue();
		}
		public void printByType(byte type) 
		{
			ArrayList<Item> resultList = new ArrayList<Item>();
			
			for(Item item:itemsStorage ) 
			{
				if(item.getType()==type) 
				{
					resultList.add(item);
				}
			}
			
			if(resultList.size()<1) 
			{
				System.out.println("Empty result list");
				return;
			}
			
			Comparator<Item> byPrice = (Item one,Item two) -> Float.compare(one.calculateValue(),two.calculateValue());
			
			for(Item item:resultList) 
			{
				System.out.println(item);
			}
		}
		
		// this is for point 4 from zadanie
		public void querryForTpeFour() 
		{
			float singlePriceSum = 0;
			float totalSum = 0;
			int counter = 0;
			
			for(Item item:itemsStorage) 
			{
				if(item.getType()==4) 
				{
					singlePriceSum +=item.getPrice();
					totalSum += item.getPrice() * item.getCount();
					counter++;
				}
			}
			
			
			System.out.println("Avarage single price: " + singlePriceSum/counter);
			System.out.println("Total value" + totalSum);
		}
		
		// not sorted printing
		public void printCatalogue() 
		{
			for(Item i : itemsStorage) 
			{
				System.out.println(i.toString());
			}
		}
	 
		
		
}
