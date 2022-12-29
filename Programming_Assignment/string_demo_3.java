import java.util.Scanner;

public class string_demo_3 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        char[] ch = new char[20];
        int j = 0;
        str.toLowerCase();

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
               ch[j++] = str.charAt(i);
        }
        System.out.println("String after deleting the consonants is: ");
        for(int i = 0; i<j ; i++)
        {
            System.out.print(ch[i]);
        }
    }
}
    

