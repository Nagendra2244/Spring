package Com.SpringDemo5;

public class Employee1 {
	private int id;  
	private String name;  
	private String city;  
	 private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	  
	public String getCity() {  
	    return city;  
	}  
	public void setCity(String city) {  
	    this.city = city;  
	}  
	void display(){  
		System.out.println("EmployeeID:"+id + "\n" +"EmployeeName:"+ name + "\n" +"EmployeeCity:"+ city + "\n" +"EmployeeAddress:"+address);
	}  
}
