package Day3_11142023;

import java.util.ArrayList;

public class T1_WhileLoop {
    public static void main(String[] args) {
        //declare an arraylist
        ArrayList<String> boroughs = new ArrayList<>();
        boroughs.add("Brooklyn");
        boroughs.add("Manhattan");
        boroughs.add("Queens");
        boroughs.add("Bronx");
        boroughs.add("Staten Island");
        //set the intial counter for the while loop
        int i = 0;
        while (i < boroughs.size()) {
            //iteration
            //
            //print out the value of i to see which iteration we are on
            System.out.println("Index number or iteration is " + i);
            //print out all the boroughs
            System.out.println("my borough is " + boroughs.get(i));
            //counter/increment operator
            i = i + 1;


        }//end of while loop



    }//end of main method
}//end of class