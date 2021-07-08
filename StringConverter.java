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
        // note if first char is capitalized
        boolean capFirst = Character.isUpperCase(fl);
        // make first character temporarily lowercase
        fl = Character.toLowerCase(fl);
        // Case if no vowels in str
        if (str.indexOf("a") == -1 && str.indexOf("e") == -1 & str.indexOf("i") == -1 & str.indexOf("o") == -1 && str.indexOf("u") == -1)
        {
            return str + "ay";
        }
        // Case if str starts with vowel
        else if (fl == 'a' || fl == 'i' || fl == 'o' || fl == 'e' || fl == 'u')
        {
            return str + "yay";
        }
        // Case if str contains vowels, but doesn't start with one
        else
        {
            String start = "";
            String end = "";

            int index = 0;
            int len = str.length();
            // Temp value for char
            char cont = '!';
            // Find index of first vowell
            for (int i = 0; i < len; i++)
            {
                cont = str.charAt(i);
                if (cont == 'a' || cont == 'i' || cont == 'o' || cont == 'e' || cont == 'u')
                {
                    index = i;
                    // Stop iterating once first one is found
                    break;
                }
            }
            start = str.substring(0, index);
            end = str.substring(index);
            // Recapitalizes letter of ending half if word was capitalized to begin with
            if (capFirst)
            {
                end = end.substring(0, 1).toUpperCase() + end.substring(1);
            }
            return end + start.toLowerCase() + "ay";
        }
    }

    public static String shorthand(String str)
    {
        // Stores indicies of spaces in str to figure out where the words are
        ArrayList<Integer> indicies = new ArrayList<Integer>();
        // Add 0 to start of inicies so for loop does not skip first word
        indicies.add(0);
        String result = "";
        String word = "";
        // Adds to indicies where the spaces are
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                // index of start of word is at the space + 1
                indicies.add(i + 1);
            }
        }
        // Adds to indicies so for loop does not skip last word
        indicies.add(str.length());

        // Grabs each word, checks if it matches the shorthand words
        for (int j = 0; j < indicies.size() - 1; j++)
        {
            word = str.substring(indicies.get(j), indicies.get(j + 1));
            word = word.toLowerCase();
            if (word.equals("and "))
            {
                result += "& ";
            }
            else if (word.equals("to "))
            {
                result += "2 ";
            }
            else if (word.equals("you "))
            {
                result += "U ";
            }
            else if (word.equals("for "))
            {
                result += "4 ";
            }
            // Iterates through string word one char at a time, appends the consonants to result
            else
            {
                for (int i = 0; i < word.length(); i++)
                {
                    // char subj = word.charAt(i);
                    char subj = word.charAt(i);
                    if (subj != 'a' && subj != 'i' && subj != 'o' && subj != 'e' && subj != 'u')
                    {
                        result += subj;
                    }
                }
            }
        }
        // Prints sentence back with first letter capitalized.
        return Character.toUpperCase(result.charAt(0)) + result.substring(1);
    }

}