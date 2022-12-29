import java.util.Scanner;




public class string_demo_2 
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();
        int vow,cons,dig,spac;
        StringOperations obj = new StringOperations();
        vow = obj.vowels(str);
        cons = obj.consonants(str);
        dig = obj.digit(str);
        spac = obj.whiteSpace(str);
        System.out.println("The string contains :\n" + vow+" vowels\n"+cons+" consonants\n"+dig+" digits\n"+spac+" Whitespaces\n");
    }
}


class StringOperations 
{
    int vowels(String word)
    {
        word = word.toLowerCase();
        int count = 0;

        for (int i =0; i < word.length(); i++)
        {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
               count++;
        }

        return count;
    }

    int consonants(String word)
    {
        word = word.toLowerCase();
        int count = 0;

        for (int i =0; i < word.length(); i++)
        {
            if (word.charAt(i) != 'a' || word.charAt(i) != 'e' || word.charAt(i) != 'i' || word.charAt(i) != 'o' || word.charAt(i) != 'u')
               count++;
        }

        return count;
    }

    int digit(String word)
    {
        int digits = 0;

        for(int i = 0; i < word.length(); i++)
        {
            if(Character.isDigit(word.charAt(i)))
               digits++;
        }

        return digits;

    }

    int whiteSpace(String word)
    {
        int spaces = 0;

        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == ' ')
               spaces++;
        }

        return spaces;
    }


}