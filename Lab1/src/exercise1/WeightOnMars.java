package exercise1;

public class WeightOnMars {
	/**
	 * Declaration of attributes
	 */
	public double earthWeight, marsWeight;

	/**
	 * Getter for earthWeight
	 */
	public double getEarthWeight() {
		return earthWeight;
	}

	/**
	 * Setter for earthWeight
	 */
	public void setEarthWeight(double earthWeight) {
		this.earthWeight = earthWeight;
		// Let marsWeight be conversion result of earthWeight
		this.marsWeight = earthWeight * 0.3;
	}

	/**
	 * Getter for marsWeight
	 */
	public double getMarsWeight() {
		return marsWeight;
	}

	/**
	 * Setter for marsWeight
	 */
	public void setMarsWeight(double marsWeight) {
		this.marsWeight = marsWeight;
		// Let earthWeight be conversion result of marsWeight
		this.earthWeight = marsWeight / 0.3;
	}
}