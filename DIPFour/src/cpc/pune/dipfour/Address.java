package cpc.pune.dipfour;

public class Address {
	private String city;
	private String state;
	private String country;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	void displayAddress(){
		System.out.println("******* Address *******");
		System.out.println("City :" + city);
		System.out.println("State :" + state);
		System.out.println("Country :" + country);
		System.out.println("***********************");
	}
}
