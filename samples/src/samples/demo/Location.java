package samples.demo;

public class Location {
	
	/**
	 * Declaration of attribute
	 */
	private String city;
	private int locationId;
	
	/**
	 * Setter for city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Getter for city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Getter for locationId
	 */
	public int getLocationId() {
		return locationId;
	}

	/**
	 * Setter for locationId
	 */
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	/**
	 * Getter for description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter for description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}