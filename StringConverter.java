// Luke Ellis String Converter
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
        return "Test";
    }

    public static String shorthand(String str)
    {
        return "Test2";
    }

}