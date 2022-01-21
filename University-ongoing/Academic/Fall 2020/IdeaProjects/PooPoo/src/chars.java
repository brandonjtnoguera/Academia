public class chars {
    public static void main(String[] args){

        //This is how you encrypt the shit for Caesar
        String h = "Hello World";
        int key =3;
        String encrypted ="";
        String decrypt = "";
        for (int i =0; i < h.length(); i++){
            encrypted += (char)(h.charAt(i) + key);
        }

        System.out.println(encrypted);

        // This is how you decrypt the shit for caesar
        for (int i = 0; i < encrypted.length(); i++){
            decrypt += (char)(encrypted.charAt(i) - key);
        }
        System.out.println(decrypt);


        //Encrypting shit for bellasso
        String plainText = "ABCDEFGHI"; //This is the shit you wanna encrypt
        String bellasso = "CMS";    //pretty sure this shit is the key
        String encrypt = "";
        int diff = (plainText.length() - bellasso.length());
        while (plainText.length() != bellasso.length()){
            for (int i = 0; i < diff; i++){
                bellasso = bellasso + bellasso.charAt(i);
            }
        }

        for (int i = 0; i < plainText.length(); i++){
            encrypt += (char)(plainText.charAt(i) + bellasso.charAt(i));
        }

        System.out.println(bellasso);
        System.out.println(encrypt);
    }
}
