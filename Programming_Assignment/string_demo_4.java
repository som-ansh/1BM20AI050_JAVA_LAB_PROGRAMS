import java.util.Scanner;

public class string_demo_4 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the string :");
       String str = sc.nextLine();
       sc.close();
       demo obj = new demo();
       String text = obj.test(str);
       System.out.print(text);

    }
}

class demo 
{
String test(String word)
{
    String str_word[] = word.split(" ");

    for(int i=0; i<str_word.length; i++)
    {
        if(str_word[i].length() % 2 != 0)
        {
            StringBuilder reverser = new StringBuilder(str_word[i]);
            str_word[i] = reverser.reverse().toString();
        }
    }
    return String.join(" ",str_word);
 }
}
