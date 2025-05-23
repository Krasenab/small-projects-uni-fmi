package telecom;

import java.util.ArrayList;
import java.util.List;

import itelecom.IGroupType;

public class GroupB implements IGroupType {
	List<Customers> bCustomersList = new ArrayList<>();
	public GroupB() 
	{
		
	}
	@Override
	public void addCustomer(Customers customer) {
		
		this.bCustomersList.add(customer);
	}

	@Override
	public List<Customers> getCustomers() {
		
		return this.bCustomersList;
	}

}
