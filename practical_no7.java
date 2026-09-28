package multithread;


class User extends Thread {

    boolean suspended = false;
    boolean stopped = false;

    User(String name) {
        super(name);
    }

    synchronized void suspendThread() {
        suspended = true;
    }

    synchronized void resumeThread() {
        suspended = false;
        notify();
    }

    synchronized void stopThread() {
        stopped = true;
        suspended = false;
        notify();     
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {

            synchronized (this) {
                while (suspended && !stopped) {
                    try {
                        wait();
                    } catch (Exception e) {}
                }

                if (stopped)
                    break;
            }

            System.out.println(getName() + " sends message " + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }

        System.out.println(getName() + " stopped.");
    }
}

public class oj {

    public static void main(String[] args) throws Exception {

        User u1 = new User("ritesh");
        User u2 = new User("sharyuu");
        User u3 = new User("soha");
       
        u1.start();
        u2.start();
        u3.start();
    
        
        System.out.println("ritesh alive: " + u1.isAlive());

        Thread.sleep(1000);

        u2.suspendThread();
        System.out.println("sharyuu  suspended");

        Thread.sleep(1000);

        u2.resumeThread();
        System.out.println("sharyuu resumed");

        u3.stopThread();
       System.out.println("soha stopped");
     
        u1.join();
        u2.join();
        u3.join();

        System.out.println("All threads completed.");
    }
}


