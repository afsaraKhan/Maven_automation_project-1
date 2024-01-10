package ActionItems;

import java.util.ArrayList;

public class ActionItem_02 {
    public static void main(String[] args) {
        //declare an array list variable
        ArrayList<String> Region = new ArrayList<>();
        //add some values to the Region array list
        Region.add("JACKSONVILLE");//Index 0
        Region.add("KANSAS CITY");// index 1
       Region.add("DETROIT");//index 2
       Region.add("MIAMI");//index 3
        //end of array list region declare new areacode list variable
        ArrayList<String> areaCode = new ArrayList<>();
        //add some values to the areaCode array list
        areaCode.add("904");//Index 0
        areaCode.add("816");// index 1
        areaCode.add("313");//index 2
        areaCode.add("305");//index 3
        //intiate for loop
        for (int i = 0; i < Region.size(); i++) {
            //print out region and areacode

            System.out.println("My Region is " + Region.get(i) + " and my areacode is " + areaCode.get(i));

        }//end of for loop




    }//end of main method

}//end fo class
