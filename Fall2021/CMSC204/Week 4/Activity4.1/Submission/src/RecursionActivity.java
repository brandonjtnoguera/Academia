/**
 * @author Brandon Tenorio
 */
public class RecursionActivity {
    public static void main(String[] args) {
        int[] a = {1,2,3};

        displayBackward(a, 0, a.length - 1);

        displayBackwardRecursively(a, 0, a.length-1);

    }

    public static void displayBackward(int[] a, int first, int last){
        for(int i = last; i > 0; i--){
            System.out.println(a[i]);
        }
    }

    public static void displayBackwardRecursively(int[] a, int first, int last){
        System.out.println(a[last]);
        last--;
        if(last >= first) displayBackwardRecursively(a, first, last);
    }
}
