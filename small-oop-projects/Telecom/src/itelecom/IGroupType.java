package itelecom;

import java.util.List;

import telecom.Customers;

public interface IGroupType {


	public void addCustomer(Customers customer);
	
	public List<Customers> getCustomers();
}
