package Com.SpringDemo5;

public class Address {
private String Street,City,State,Country;

public String getStreet() {
	return Street;
}

public void setStreet(String street) {
	Street = street;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getState() {
	return State;
}

public void setState(String state) {
	State = state;
}

public String getCuntry() {
	return Country;
}

public void setCountry(String country) {
	Country = country;
}

public String toString(){  
    return Street+" "+City+" "+State+" "+Country;  
  } 
} 
