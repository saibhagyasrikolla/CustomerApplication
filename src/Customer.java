
public class Customer {
	int customerId;
	String customerName, customerGender, customerEmailId; 
	String customerAddress, customerDOB;
	long customerPhoneNumber;
	
	public void customerDetails(int id, String name, String gender, 
			String email, long phoneNumber, String dob, String address ) {
		customerId = id;
		customerName = name;
		customerGender = gender;
		customerEmailId = email;
		customerPhoneNumber = phoneNumber;
		customerDOB = dob;
		customerAddress = address;
	}
	
	public int getId() {
		return customerId;
	}
	
	public String toString() {
		return customerId+", "+customerName+", "+customerGender+", "
	+customerEmailId+", "+customerPhoneNumber+", "+customerDOB+", "+customerAddress;
	}
}
