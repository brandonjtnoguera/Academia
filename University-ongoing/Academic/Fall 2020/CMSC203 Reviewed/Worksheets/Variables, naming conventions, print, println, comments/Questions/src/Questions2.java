public class Questions2 {
    public static void main(String[] args) {
        /*
            1.	What is the result of the following expression?
                25 / 4 + 4 * 10 % 3
                    a)	19
                    b)	5.25
                    c)	3
                    d)	7

                    Answer: 6 + 4 = 10


            2.	What will be the value of z as a result of executing the following code?
                int x = 5, y = 28;
                double z;
                z = (double) (y / x);
                    a) 5.60
                    b) 5.6
                    c) 3.0
                    d) 5.0

                    Answer: B


            3.	What is the output of the following code (what is displayed on the console)?
                int myAge = 22;
                System.out.println("my age now: " + myAge);
                System.out.println("my age after 10 years " + myAge + 10);
                System.out.println(myAge + 10 +" is my age after 10 years");

                Answer: my age now 22
                        my age after 10 years 2210
                        2210 is my age after 10 years



            4.	Which of the following statements correctly creates a Scanner object for keyboard input?
                a) Scanner kbd = new Scanner(System.keyboard);
                b) Scanner keyboard(System.in);
                c) Scanner keyboard = new Scanner(System.in);
                d) Keyboard scanner = new Keyboard(System.in);

                Answer: C


           5.	Rearrange the code given below to accomplish the following goal:
                -	Prompt user to enter his/her age
                -	Input age
                -	Prompt user to enter his/her average score
                -	Input average score

                    import java.util.Scanner;
                    public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    }
                    public class ScannerExample {
                            int myAge;
                            System.out.println ("Enter your age:");
                            myAge = input.nextInt();

                    	    double avgScore;
                    		System.out.println ("Enter your average score:");
                    		avgScore= input.nextDouble();

                    }



            6.	Write a program to accomplish the following goal:
                -Prompt the user to enter his/her name as (FirstName  LastName)
                -Display the number of characters of the name entered
                -Display the name as all uppercase letters
                -Display the first character of the first name

                import java.util.Scanner;
                public class Answer{
                    public static void main(String [] args){
                        Scanner k = new Scanner(System.in);
                        String firstName;
                        String lastName;
                        System.out.println("Enter your first name:");
                        firstName = k.nextLine();
                        System.out.println("Enter your last name:");
                        lastName = k.nextLine();
                        System.out.println((firstName.length()+lastName.length()));
                        System.out.println(firstName.toUpper() + " " + lastName.toUpper());
                        System.out.println(firstName[0]);

                    }
                }




         */
    }
}
