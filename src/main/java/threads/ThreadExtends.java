package threads;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ThreadExtends extends Thread{
    // Variable
    private Long threadID;
    private String threadName;

    public ThreadExtends(){
    }

    public ThreadExtends(Long threadID, String threadName) {
        this.threadID = threadID;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread Extends");
        for (int i = 0; i < 9; i++) {
            System.out.println("Thread" + this.threadID + " " + i + " " + this.threadName + " ");
            try {
                Thread.sleep(1000);     // her 1 saniyede bir uyu sonra tekrar çalış
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } // end for
    } // end run
} // end class

// psvm
class ThreadTextMain {
    public static void main(String[] args) throws InterruptedException {
        // Thread Instance
        ThreadExtends t1 = new ThreadExtends(1L,"zoom");
        ThreadExtends t2 = new ThreadExtends(2L,"intellij idea");
        ThreadExtends t3 = new ThreadExtends(3L,"browser");

        // Start
        System.out.println("getName: " + t1.getName());
        System.out.println("hashCode: " + t1.hashCode());
        System.out.println("is alive: " + t1.isAlive()); // false vermeli

        // bu programlarda öncelikle zoom çalışsın sonrasında diğer programlar çalışsın
        t1.start(); // üst artık true verir
        //System.out.println("is alive: " + t1.isAlive());
        t1.join();

        t2.start();
        t3.start();

    }


}
