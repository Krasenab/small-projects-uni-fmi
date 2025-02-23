
public class Main {

	public static void main(String[] args) {
		
			Item itms = new Item("krusha",245454.11f,3,(byte)5);
			
		   Catalogue c = new Catalogue();
		   
		   c.addItem(itms);
		   c.addItem(new Item("Apple",21.11f,3,(byte)3));
		   c.addItem(new Item("Cheresha",2.1f,4,(byte)4));
		   c.addItem(new Item("borovinki",245454.11f,5,(byte)3));
		   c.addItem(new Item("krastavica",245454.11f,2,(byte)2));
		   
		   c.printCatalogue();
		   System.out.println("--------------------------");
		   
		   c.OrderByNamePrint();
		   
		   c.printByType((byte)3);
		   
		   c.querryForTpeFour();
		   
	}

}
