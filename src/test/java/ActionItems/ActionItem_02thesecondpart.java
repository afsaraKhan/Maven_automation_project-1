package ActionItems;

public class ActionItem_02thesecondpart {
    public static void main(String[] args) {
        //declare some int values
        int grade = 59;
        //intiate if statement
        if (grade >=90 && grade <=100){
            System.out.println("My grade is A");

        }//end of if statement
        else if (grade >=80 && grade <90) {
            System.out.println("My grade is B");

        }//end of else if 
        else if (grade >=70 && grade <80) {
            System.out.println("My grade is a C");
            
        }//end of else if
        else if (grade >=60 && grade <70) {
            System.out.println("My grade is a D");
            
        }//end of if else
        else if (grade >=0 && grade <60) {
            System.out.println("My grade is a F");
            
        }// end of if else statements


    }//end of main method
}//end of class
