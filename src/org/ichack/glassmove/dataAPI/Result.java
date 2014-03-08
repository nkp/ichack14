package org.ichack.glassmove.dataAPI;

public class Result {

	int avgRent;
	int commuteTime; // in minutes
	int commuteCost;
	Property[] properties;

	public int getAvgRent() {
		return avgRent;
	}

	public void setAvgRent(int avgRent) {
		this.avgRent = avgRent;
	}

	public int getCommuteTime() {
		return commuteTime;
	}

	public void setCommuteTime(int commuteTime) {
		this.commuteTime = commuteTime;
	}

	public int getCommuteCost() {
		return commuteCost;
	}

	public void setCommuteCost(int commuteCost) {
		this.commuteCost = commuteCost;
	}

	public Property[] getProperties() {
		return properties;
	}

	public void setProperties(Property[] properties) {
		this.properties = properties;
	}

}
