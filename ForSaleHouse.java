/*
Name: Tyler Kreider
Proj: Java inheritance Programming Exercise 
Class: COMP-305 SP2022
Prof: A. Nuzen
*/

class ForSaleHouse extends House {
    private int price;
    private String dateOnMarket;

    public ForSaleHouse(String address, double numBaths, int numBedrooms, int price, String dateOnMarket) {
        super(address, numBaths, numBedrooms);
        this.price = price;
        this.dateOnMarket = dateOnMarket;

    }

    public int getPrice() {
        return price;
    }

    public String getDateOnMarket() {
        return dateOnMarket;
    }

    //public String toString(){
    //    return super.toString() +"\nPrice: " + this.price + "\nDate On Market: " + this.dateOnMarket;

   // }

    public boolean equals(Object other){
        if (other == null)
            return false;
        if (!(other instanceof House))
            return false;
        
        ForSaleHouse otherHouse = (ForSaleHouse) other;

        return (this.getnumBaths() == otherHouse.getnumBaths()) && (this.getnumBaths() == otherHouse.getnumBaths());

        
    }

    public int compareTo(Object other){
        final int ERROR = Integer.MIN_VALUE, SAME = 0,  LARGER = 1, SMALLER = -1;
        

        if (other == null)
            return ERROR;
        if (!(other instanceof House))
            return ERROR;
        
        ForSaleHouse otherHouse = (ForSaleHouse) other;
        
        if (this.getPrice() == otherHouse.getPrice()){

        
            return SAME;
        }
        if (this.getPrice() < otherHouse.getPrice() ){
            return SMALLER;
        }

        return LARGER;
        
        

        
    }


}