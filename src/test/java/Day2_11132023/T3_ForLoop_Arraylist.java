package Day2_11132023;

import java.util.ArrayList;

public class T3_ForLoop_Arraylist {
    public static void main(String[] args) {
        //declare an array list variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA");//Index 0
        countries.add("INDIA");// index 1
        countries.add("Pakistan");//index 2
        countries.add("Bangladesh");//index 3
        countries.add("Mexico");//index 4
        //print out all the countries from the arraylist
        for (int i = 0; i < countries.size(); i++) {
            //print out the value of i to see which iteration we are on
            System.out.println("Index number or iteration is " + i);
            //print out all the countries
            System.out.println("my country is " + countries.get(i));

        }//end of for loop


    }//end of main method
}//end of class
