
import java.util.Scanner;

public class PrintingQuotes

{

    public static void main(String[] args)
    {
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Noun: "); //ask for an input
        String noun = reader.nextLine();
        System.out.print("Enter a Verb : "); //ask for an input
        String Verb = reader.nextLine();
        System.out.print("Enter Adjective: "); //ask for an input
        String Adjective = reader.nextLine();
        System.out.print("Enter Adverb: "); //ask for an input
        String Adverb = reader.nextLine();

        //this will print out inputs in front of a string
        System.out.println("Do you " +Verb +" your" + Adjective +" "+ noun +" "+ Adverb+" ? That's hilarious");
    }

}
