package main.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * This is your test file.  Complete the following test cases to test your project where they make sense.
 * Include additional test cases if you like.
 *
 * STUDENT tests for the methods of PasswordChecker
 * @author Brandon Tenorio
 *
 */
public class PasswordCheckerTest_STUDENT {
	ArrayList<String> passwords;

	@Before
	public void setUp() throws Exception {
		passwords = new ArrayList<String>();

		// Valid, strong passwords [0-4]
		passwords.add("06&csuy3xgMmQkYgA!v1aT5AkdV0QLhFeoUSlb8uKIfrjWxzg@$eAdpAFRK7kpHVqvr0%@5T^cQXoXn^bW@&@SoYEYmzma*byI!");
		passwords.add("jy2sE8&*MkKXKhdiw6^H&aVvg9MovhXrBl7");
		passwords.add("RlUDI6V8oX9S5*2#wsD5Co7Za6Dd!*59kMt");
		passwords.add("!vcr&6xID%yf9E35B#EoP!huhsy$tWtJ3Dx");
		passwords.add("h@WR8gSN8SCb8z873@H6&a@xsIe^Amhzj5a5BARucvkzkKM@Zvi2CGu5@b%ENnFLP%cO^AOVIKFLcxNqzs2*FuxubNGr$Cks!Ql");

		// Valid weak passwords [5-9]
		passwords.add("M43$su");
		passwords.add("4u1MK@6");
		passwords.add("Ky670Au$");
		passwords.add("8Nh@38");
		passwords.add("4Rl&94d");

		// No Lowercase Exception [10-14]
		passwords.add(passwords.get(0).toUpperCase());
		passwords.add(passwords.get(1).toUpperCase());
		passwords.add(passwords.get(2).toUpperCase());
		passwords.add(passwords.get(3).toUpperCase());
		passwords.add(passwords.get(4).toUpperCase());

		// No Digit Exception [15-19]
		passwords.add("MAE$suJikO");
		passwords.add("AuiMK@gkI&");
		passwords.add("KyGHOAu$kOLps%");
		passwords.add("bNh@eBJujI&");
		passwords.add("aRl&DGuH%");

		// No Upper [20-24]
		passwords.add(passwords.get(0).toLowerCase());
		passwords.add(passwords.get(1).toLowerCase());
		passwords.add(passwords.get(2).toLowerCase());
		passwords.add(passwords.get(3).toLowerCase());
		passwords.add(passwords.get(4).toLowerCase());

		// No Special [25-29]
		passwords.add("IchigoKurosaki69");
		passwords.add("NarutoUzumaki69");
		passwords.add("SasukeUchiha69");
		passwords.add("TanjiroKamado69");
		passwords.add("GaryThai420");

		// Invalid sequence [30-34]
		passwords.add("IchigooKurosaki69!");
		passwords.add("NarutoUzumaki69&&");
		passwords.add("TTanjiroKamado69!");
		passwords.add("SasukeUchiha669&");
		passwords.add("GaryThai4420%");

		// Too short [35-39]
		passwords.add("Cat6&");
		passwords.add("cAt6&");
		passwords.add("caT6&");
		passwords.add("Cat6%");
		passwords.add("Cat6!");

	}

	@After
	public void tearDown() throws Exception {
		passwords = null;

	}

	/**
	 * Test if the password is less than 6 characters long.
	 * This test should throw a main.java.LengthException for second case.
	 */
	@Test
	public void testIsValidPasswordTooShort()
	{
		try{
			for(int i = 35; i < 40; i++) {
				assertTrue(PasswordCheckerUtility.isValidPassword(passwords.get(i)));
			}
		} catch(LengthException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test if the password has at least one uppercase alpha character
	 * This test should throw a main.java.NoUpperAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoUpperAlpha()
	{
		try{
			for(int i = 20; i < 25; i++) {
				assertFalse(PasswordCheckerUtility.hasUpperAlpha(passwords.get(i)));	// These passwords do not have an upperAlpha
			}
		} catch(NoUpperAlphaException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test if the password has at least one lowercase alpha character
	 * This test should throw a main.java.NoLowerAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoLowerAlpha()
	{
		try{
			for(int i = 10; i < 15; i++) {
				assertFalse(PasswordCheckerUtility.hasLowerAlpha(passwords.get(i)));	// These passwords do not have an upperAlpha
			}
		} catch(NoLowerAlphaException e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * //Test if the password has more than 2 of the same character in sequence
	 * //This test should throw a main.java.InvalidSequenceException for second case
	 * Tst if the password has between 6 and 9 characters
	 */
	@Test
	public void testIsWeakPassword()
	{
		try{
			for(int i = 5; i < 10; i++) {
				assertTrue(PasswordCheckerUtility.isWeakPassword(passwords.get(i)));
			}
		} catch(WeakPasswordException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a main.java.InvalidSequenceException for second case
	 */
	@Test
	public void testIsValidPasswordInvalidSequence()
	{
		try{
			for(int i = 10; i < 15; i++) {
				assertFalse(PasswordCheckerUtility.hasSameCharInSequence(passwords.get(i)));
			}
		} catch(InvalidSequenceException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test if the password has at least one digit
	 * One test should throw a main.java.NoDigitException
	 */
	@Test
	public void testIsValidPasswordNoDigit()
	{
		try{
			for(int i = 15; i < 20; i++) {
				assertFalse(PasswordCheckerUtility.hasDigit(passwords.get(i)));
			}
		} catch(NoDigitException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test correct passwords
	 * This test should not throw an exception
	 */
	@Test
	public void testIsValidPasswordSuccessful()
	{
		for(int i = 0; i < 5; i++) {
			assertTrue(PasswordCheckerUtility.isValidPassword(passwords.get(i)));
		}
	}

	/**
	 * Test the invalidPasswords method
	 * Check the results of the ArrayList of Strings returned by the validPasswords method
	 */
	@Test
	public void testInvalidPasswords() {
		ArrayList<String> invalidPasswords = PasswordCheckerUtility.getInvalidPasswords(passwords);
//		for(int i = 0; i < invalidPasswords.size(); i++){
//			assertFalse(PasswordCheckerUtility.isValidPassword(invalidPasswords.get(i)));
//		}
	}

}

