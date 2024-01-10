package Day4_111202023;

public class T2_SplitCommand {
    public static void main(String[] args) {
        //declare a string variable with a single message
        String message = "My name is John";
        //declare an array to store the split message
        String[] splitMessage = message.split(" ");
        //print out only john from the message string
        System.out.println("the name is " + splitMessage[3]);
        //split based on "_"
        String message2 = "Automation_01";
        String[] splitmessage2 = message2.split("_");
        //print out only action item number
        System.out.println("action item number is " + splitmessage2[1]);

    }//end of main
}//emd of class
