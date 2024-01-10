package Day2_11132023;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {

        //declare an array list variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA");//Index 0
        countries.add("INDIA");// index 1
        countries.add("Pakistan");//index 2
        countries.add("Bangladesh");//index 3
        //print out USA
        System.out.println("the first country is " + countries.get(0));
        //print out the total size of the arraylist
        System.out.println("The total size of the countries array list is " + countries.size());
        //add another country
        countries.add("Canada");
        //print the new size of the arraylist
        System.out.println("the new size of the array list is " + countries.size());
        //declare an int array list
        ArrayList<Integer> studentGrades = new ArrayList<>();
        //ADD values to student grades
        studentGrades.add(90);
        studentGrades.add(80);
        studentGrades.add(20);
        //print out the last students grade
        System.out.println("the third students grade is " + studentGrades.get(2));




    }//end of main method
}//end of class
