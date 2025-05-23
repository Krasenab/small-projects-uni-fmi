package telecom;

import java.util.ArrayList;
import java.util.List;

import itelecom.IGroupType;

public class GroupV implements IGroupType {
	private List<Customers> vCustomersList = new ArrayList<>();
	@Override
	public void addCustomer(Customers customer) {
		
		vCustomersList.add(customer);
		
	}

	@Override
	public List<Customers> getCustomers() {
		return vCustomersList;
	}

}
