package main.java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Checks if a password is valid
 * @author Brandon Tenorio
 */
public class PasswordCheckerUtility {

    /**
     * Private constructor to prevent the creation of an instance of this class
     */
    private PasswordCheckerUtility(){}

    /**
     * Compares the equality of 2 passwords
     * @param password String to be checked for
     * @param passwordConfirm String to be compared against password
     * @throws UnmatchedException
     */
    static void comparePasswords(String password, String passwordConfirm) throws UnmatchedException{
        if (password.equals(passwordConfirm)) System.out.println("Passwords match");
        else {
            System.out.println("Passwords do not match");
            throw new UnmatchedException();
        }
    }

    /**
     * Compares the equality of 2 passwords and returns true if they're equal
     * @param password String to be checked for
     * @param passwordConfirm String to be compared against password
     * @return true if they're equal
     */
    static boolean comparePasswordsWithReturn(String password, String passwordConfirm){
        return password.equals(passwordConfirm);
    }

    /**
     * Reads a file of passwords and returns all invalid passwords with their corresponding exceptions from a list of passwords
     * @param passwords String to be checked for
     * @return an ArrayList object of invalid passwords
     */
    static ArrayList<String> getInvalidPasswords(ArrayList<String> passwords) {
        ArrayList<String> invalidPasswords = new ArrayList<String>();
        for (String password : passwords) {
            try {
                if (!(isValidPassword(password)));
            } catch(RuntimeException e) {
                invalidPasswords.add(password + " -> " + e.getMessage());
            }
        }
        return invalidPasswords;
    }

    /**
     * Checks to see if a password had between 6 and 9 characters in length
     * @param password String to be checked for
     * @return true if password is between 6 and 9 characters
     */
    static boolean hasBetweenSixAndNineChars(String password){
        return password.length() > 6 && password.length() < 9;
    }

    /**
     * Checks to see if a password contains a digit
     * @param password String to be checked for
     * @return true if password contains a digit
     * @throws NoDigitException
     */
    static boolean hasDigit(String password) throws NoDigitException{
        if(!(password.matches(".*\\d.*"))) throw new NoDigitException();
        return password.matches(".*\\d.*");     // RegEx for digit
    }

    /**
     * Checks to see if password contains a lower case alphabetic character
     * @param password String to be checked for
     * @return true if password contains a lower alphabetic character
     * @throws NoLowerAlphaException
     */
    static boolean hasLowerAlpha(String password) throws NoLowerAlphaException {
        // if "password" doesn't equal its uppercase equivalent, then there must be at least one lower case letter
        if(password.equals(password.toUpperCase())) throw new NoLowerAlphaException();
        return !password.equals(password.toUpperCase());
    }

    /**
     * Checks to see if a password has more than 2 of the same character in sequence
     * @param password String to be checked for
     * @return true if password contains 2 of the same character in sequence
     * @throws InvalidSequenceException
     */
    static boolean hasSameCharInSequence(String password) throws InvalidSequenceException{
        for(int i = 1; i < password.length(); i++) {
            if (password.charAt(i-1) == password.charAt(i)) throw new InvalidSequenceException();
        }
        return false;
    }

    /**
     * Checks to see if password contains at least one special character
     * @param password String to be checked for
     * @return true if password contains a special character
     * @throws NoSpecialCharacterException
     */
    static boolean hasSpecialChar(String password) throws NoSpecialCharacterException {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()) throw new NoSpecialCharacterException();
        return (!matcher.matches());
    }

    /**
     * Checks to see if the password contains an upper case alphabetic character
     * @param password String to be checked for
     * @return true if password contains an upper alphabetic character
     * @throws NoUpperAlphaException
     */
    static boolean hasUpperAlpha(String password) throws NoUpperAlphaException{
        // if "password" doesn't equal its lower case equivalent, then there must be at least one upper case letter in the String
        if(password.equals(password.toLowerCase())) throw new NoUpperAlphaException();
        return !password.equals(password.toLowerCase());
    }

    /**
     * Checks to see if a password's length is at least 6 characters long
     * @param password String to be checked for
     * @return true if password's length is greater than or equal to 6
     * @throws LengthException
     */
    static boolean isValidLength(String password) throws LengthException{
        if(!(password.length() >= 6)) throw new LengthException();
        return password.length() >= 6;
    }

    /**
     * Checks to see if a password follows all the rules from above, in which case it would make it valid
     * @param password String to be checked for
     * @return true if password follows all the rules from above
     * @throws LengthException
     * @throws NoUpperAlphaException
     * @throws NoLowerAlphaException
     * @throws NoDigitException
     * @throws NoSpecialCharacterException
     * @throws InvalidSequenceException
     * @throws WeakPasswordException
     * @throws UnmatchedException
     */
    static boolean isValidPassword(String password) throws LengthException, NoUpperAlphaException, NoLowerAlphaException, NoDigitException, NoSpecialCharacterException, InvalidSequenceException{
        boolean valid = false;
        if(!(isValidLength(password))) throw new LengthException();
        else if(!(hasUpperAlpha(password))) throw new NoUpperAlphaException();
        else if(!(hasLowerAlpha(password))) throw new NoLowerAlphaException();
        else if(!(hasDigit(password))) throw new NoDigitException();
        else if(!(hasSpecialChar(password))) throw new NoSpecialCharacterException();
        else if(hasSameCharInSequence(password)) throw new InvalidSequenceException();
        else valid = true;
        return valid;
    }

    /**
     * Checks to see if a password is valid but between 6 and 9 characters long
     * @param password String to be checked for
     * @return true if password has between 6 and 9 characters (inclusive)
     * @throws WeakPasswordException
     */
    static boolean isWeakPassword(String password) throws WeakPasswordException{
        if(password.length() < 10) throw new WeakPasswordException();
        return password.length() >= 6 && password.length() <= 9;
    }
}
