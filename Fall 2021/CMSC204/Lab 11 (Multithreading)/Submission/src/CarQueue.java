import java.util.*;

/**
 * @author Brandon Tenorio
 */
public class CarQueue {
    Queue<Integer> queue = new ArrayDeque<>();
    Random random = new Random();

    public CarQueue(){
        for(int i = 0; i < 5; i++) queue.add(random.nextInt(4));
    }

    public void addToQueue(){
        new Thread(() -> {
            try{
                queue.add(random.nextInt(4));
                queue.add(random.nextInt(4));
                queue.add(random.nextInt(4));
                queue.add(random.nextInt(4));
                queue.add(random.nextInt(4));
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();
    }

    public int deleteQueue(){
        if(queue.isEmpty()) return 0;
        else return queue.remove();
    }
}
