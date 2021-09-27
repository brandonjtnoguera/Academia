import java.util.Scanner;

public class WiFiDriver {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n" +
                "First step: Reboot your computer\nAre you able to connect with the internet? (yes or no)");

        String answer1 = keyboard.nextLine();

        if (answer1.charAt(0) == 'y' || answer1.charAt(0) == 'Y') {
            System.out.println("Rebooting your computer seemed to work");
        }else{
            System.out.println("Second step: Reboot your router\nAre you able to connect with the internet? (yes or no)");

            String answer2 = keyboard.nextLine();

            if (answer2.charAt(0) == 'y' || answer2.charAt(0) == 'Y') {
                System.out.println("Rebooting your router seemed to work");
            }else{
                System.out.println("Third step: Make sure the cables to your router are plugged in firmly and your " +
                        "router is getting power\nAre you able to connect with the internet? (yes or no)");

                String answer3 = keyboard.nextLine();

                if (answer3.charAt(0) == 'y' || answer3.charAt(0) == 'Y') {
                    System.out.println("Checking the router's cables seemed to work");
                }else{
                    System.out.println("Fourth step: Move your computer closer to your router\nAre you able to connect " +
                            "with the internet? (yes or no)");

                    String answer4 = keyboard.nextLine();

                    if (answer4.charAt(0) == 'y' || answer4.charAt(0) == 'Y') {
                        System.out.println("Moving your router closer to your computer seemed to work");
                    }else{
                        System.out.println("Fifth step: Contact your ISP\nMake sure your ISP is hooked up to your " +
                                "router");
                    }
                }
            }
        }
    }
}
