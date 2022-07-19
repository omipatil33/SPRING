package cpc.pune.dipfive;

public class Address {
	private String city;
	private String state;
	private String country;
	
	public Address(String city, String state, String country) {	
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	void displayAddress(){
		System.out.println("***** Address ***************");
		System.out.println(city + " " + state + " " + country);
		System.out.println("*****************************");
	}
	
}
