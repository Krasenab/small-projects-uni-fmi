package telecom;

import java.util.ArrayList;
import java.util.List;

import itelecom.IGroupType;

public class GroupA implements IGroupType {

	private List<Customers> aCustomersList = new ArrayList<Customers>();
	public GroupA() 
	{
		
	}
	

	@Override
	public void addCustomer(Customers customer) {
		
		aCustomersList.add(customer);
	}


	@Override
	public List<Customers> getCustomers() {
		
		return aCustomersList;
	}
	
	

}
