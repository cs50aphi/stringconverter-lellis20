// Luke Ellis String Converter
import java.util.ArrayList;

public class StringConverter
{

    public static String reverse(String str)
    {
        // reversed receives incoming string values
        String reversed = "";

        // Add to reversed iterating backwards through str
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static boolean checkPalindrome(String str)
    {
        String container = "";
        // iterate thru str and keep only lowercase alphanumeric chars
        for (int i = 0; i < str.length(); i++)
        {
            str = str.toLowerCase();
            char subject = str.charAt(i);
            // char subject = Character.toLowerCase(initial);
            if ((subject >= 'a' && subject <= 'z') || (subject >= '0' && subject <= '9'))
            {
                container += subject;
            }
        }
        // highest index of container
        int conLen = container.length() - 1;
        // iterates comparing first and last, then working way inwards
        for (int j = 0; j <= conLen / 2; j++)
        {
            if (container.charAt(j) != container.charAt(conLen - j))
            {
                return false;
            }
        }
        return true;
    }

    public static String pigLatinate(String str)
    {
        char fl = str.charAt(0);
        boolean capFirst = Character.isUpperCase(fl);
        fl = Character.toLowerCase(fl);
        if (str.indexOf("a") == -1 && str.indexOf("e") == -1 & str.indexOf("i") == -1 & str.indexOf("o") == -1 && str.indexOf("u") == -1)
        {
            return str + "ay";
        }
        else if (fl == 'a' || fl == 'i' || fl == 'o' || fl == 'e' || fl == 'u')
        {
            return str + "yay";
        }
        else
        {
            String start = "";
            String end = "";

            int index = 0;
            int len = str.length();
            char cont = '!';
            // Find index of first vowell
            for (int i = 0; i < len; i++)
            {
                cont = str.charAt(i);
                if (cont == 'a' || cont == 'i' || cont == 'o' || cont == 'e' || cont == 'u')
                {
                    index = i;
                    break;
                }
            }
            start = str.substring(0, index);
            end = str.substring(index);
            if (capFirst)
            {
                end = end.substring(0, 1).toUpperCase() + end.substring(1);
            }
            return end + start.toLowerCase() + "ay";
        }
    }

    public static String shorthand(String str)
    {
        ArrayList<Integer> indicies = new ArrayList<Integer>();
        indicies.add(0);
        String result = "";
        String word = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                indicies.add(i + 1);
            }
        }
        for (int j = 0; j < indicies.size(); j++)
        {
            word = str.substring(indicies.get(j), indicies.get(j + 1));
            if (word.substring(0,3).equals("and"))
            {
                result += "&" + word.substring(3);
            }
            else if (word.substring(0,2).equals("to"))
            {
                result += "2" + word.substring(2);
            }
            else if (word.substring(0, 3).equals("you"))
            {
                result += "U" + word.substring(3);
            }
            else if (word.substring(0,3).equals("for"))
            {
                result += "4" + word.substring(3);
            }
            else
            {
                result = "Not done yet";
            }
        }
        return word;
    }

}