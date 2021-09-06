import java.util.*;

public class PrintingQuotes {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the quote? "); //will ask to enter a quote

        String quote = sc.nextLine();

        System.out.print("Who said it? "); //will ask for a name (author)

        String author = sc.nextLine();

        System.out.println(author + " says, \""+quote+"\""); //wil give out the results:
    }
    
}