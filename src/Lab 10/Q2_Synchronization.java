// 10.2 Write a program in java which will display the working of two
// threads in synchronization.

class Thread3 extends Thread {
    String name;
    String[] msg;

    Thread3(String name, String[] msg) {
        this.name = name;
        this.msg = msg.clone();
    }

    @Override
    public synchronized void run() {
        for (String str : this.msg) {
            System.out.println(this.name + ": " + str);
        }
    }
}

class Thread4 extends Thread {
    String name;
    String[] msg;

    Thread4(String name, String[] msg) {
        this.name = name;
        this.msg = msg.clone();
    }

    @Override
    public synchronized void run() {
        for (String str : this.msg) {
            System.out.println(this.name + ": " + str);
        }
    }
}

class Synchronization extends Thread {
    String name;
    String[] msg;

    Synchronization(String name, String[] msg) {
        this.name = name;
        this.msg = msg.clone();
    }

    @Override
    public void run() {
        synchronized (Synchronization.class) {
            for (String str : this.msg) {
                System.out.println(this.name + ": " + str);
            }
        }
    }

    public static void main(String[] args) {
        String[] msg = {"I", "Love", "Java", "Very", "Much"};
        Synchronization thread1 = new Synchronization("Thread1", msg), thread2 = new Synchronization("Thread2", msg);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        Thread3 thread3 = new Thread3("Thread3", msg);
        Thread4 thread4 = new Thread4("Thread4", msg);
        thread3.start();
        thread4.start();
    }
}