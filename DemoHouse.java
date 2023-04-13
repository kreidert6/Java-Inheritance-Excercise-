/*
Name: Tyler Kreider
Proj: Java inheritance Programming Exercise 
Class: COMP-305 SP2022
Prof: A. Nuzen

Create two listed houses:
1/ 56 Oak Street, with 1.5 baths and 3 beds asking price for $186,000 with dateOnMarket Feb 6th 2022
2/ 57 Oak Street, with 1 bath and 3 beds asking price for $196,000 with dateOnMarket Feb 10th 2022

*/

import java.time.LocalDate;

public class DemoHouse extends Object {
    public static void main(String[] args) {
        LocalDate date_avail = LocalDate.of(2022, 2, 6);
        LocalDate date_avail2 = LocalDate.of(2022, 2, 10);

        ForSaleHouse house1 = new ForSaleHouse("56 Oak Street", 1.5, 3, 186000, "Feb 6th 2022");
        ForSaleHouse house2 = new ForSaleHouse("57 Oak Street", 1, 3, 196000, "Feb 10th 2022");

        
        System.out.println();
        System.out.println(house1);
        System.out.println(house2);

        System.out.println("House1 equals house2 is " + house1.equals(house2));


        Object unk = new Object();

        System.out.println("House1 compared to unk result is " + house1.compareTo(unk));
        System.out.println();
    
    
    }
}
