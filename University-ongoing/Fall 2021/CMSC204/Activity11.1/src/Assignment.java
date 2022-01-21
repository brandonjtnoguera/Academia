public class Assignment{
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) System.out.println("a");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) System.out.println("b");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 100; i++) System.out.println(i);
            }
        }).start();
    }
}
