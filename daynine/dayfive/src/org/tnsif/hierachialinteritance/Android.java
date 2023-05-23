package org.tnsif.hierachialinteritance;

public class Android {
private String brand;
private String ownerName;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getOnwerName() {
	return ownerName;
}
public void setOnwerName(String onwerName) {
	this.ownerName = onwerName;
}
public Android()
{
	System.out.println("Default Constructor");
	brand="RealMe";
	ownerName="Niket Kamble";
}
public Android(String brand, String ownerName) {
	super();
	this.brand = brand;
	this.ownerName = ownerName;
}
@Override
public String toString() {
	return "Android [brand=" + brand + ", ownerName=" + ownerName + "]";
}

}