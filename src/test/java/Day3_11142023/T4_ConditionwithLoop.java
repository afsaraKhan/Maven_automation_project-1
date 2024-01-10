package Day3_11142023;

public class T4_ConditionwithLoop {
    public static void main(String[] args) {
        String[] fruitBasket = new String[]{"Grape", "Orange", "Apple", "Mango"};
        //pick out only apple for array
        //start the for loop because we need to check everything in the array
        for (int i = 0; i < fruitBasket.length; i++) {
            // double equal sign (==) means its a comparison operator
            //sing equal sign assigns a value to a variable
            if (fruitBasket[i] == "Apple") {
                System.out.println("An apple a day keeps the defect away");
            }//end of if clause
            else if (fruitBasket[i] == "Grape") {
                System.out.println("My fruit is " + fruitBasket[i]);
                
            }//end of if else

        }//end of for loop

    }//end of main method
}//end of class
