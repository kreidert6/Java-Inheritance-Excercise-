/*
Name: Tyler Kreider
Proj: Java inheritance Programming Exercise 
Class: COMP-305 SP2022
Prof: A. Nuzen
*/

public class House extends Object {

    private String address;
    private double numBaths;
    private int numBedrooms;

    public House(String address, double numBaths, int numBedrooms) {
        this.address = address;
        this.numBaths = numBaths;
        this.numBedrooms = numBedrooms;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public double getnumBaths() {
        return numBaths;
    }

    public int getnumBedrooms() {
        return numBedrooms;
    }

    public String toString(){
        return "House is at " + this.address + " with " + this.numBaths + " baths and " 
        + this.numBedrooms + " bedrooms. ";
    }

}