import java.util.Scanner;

public class string_demo_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String ");
        String str = sc.nextLine();
        WordOperations obj = new WordOperations();
        int res1;
        String res2;
        res1 = obj.Words(str);
        res2 = obj.Uppercase(str);
        System.out.println("Number of words in the sentence : " + res1 + "\n Its uppercase representation : " + res2);
    }
}


 class WordOperations
{
    int Words(String word)
    {
        if (word == null || word.isEmpty())
           return 0;

        String[] words = word.split("\\s+");
        return words.length;
    }

    String Uppercase(String word)
    {
        return word.toUpperCase();
    }
}