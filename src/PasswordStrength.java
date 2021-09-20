import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

public class PasswordStrength {
    public static void PasswordStrength(String input)
    {
        int n = input.length();

        boolean hasLower = false,
                hasDigit = false, specialChar = false;

        Set <Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        boolean hasUpper = false;
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;

            if (Character.isUpperCase(i))
                hasUpper = true;

            if (Character.isDigit(i))
                hasDigit = true;

            if (set.contains(i))
                specialChar = true;
        }


        if (hasDigit && hasLower || hasUpper && specialChar
                && (n >= 8))
            System.out.println("Very Strong");

        else if ((hasLower || hasUpper || specialChar)
                && (n >= 8))
            System.out.println("Strong");

        else if(hasLower || hasUpper)
            System.out.print("Weak");
        else
            System.out.print("Very Weak");

    }
    public static void main(String[] args)
    {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password: ");
        input=sc.nextLine();
        PasswordStrength(input);
    }


}

