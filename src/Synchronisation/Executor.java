package Synchronisation;

public class Executor extends Thread{
    private final Task task;
    private String name;
    private Thread thread;
    private int number;
    public Executor(String name, Task task, int number){
        this.name = name;
        this.task = task;
        this.number = number;
    }
    @Override
    public void run(){
        System.out.println(name + " is STARTED");
        // This sync block allows prioritizing of resource sharing
        // can't access task when another thread is using it
        // synchronizing for Task
        synchronized (task) {
            task.perform(number);
        }
        System.out.println(name + " is COMPLETED");
    }
    @Override
    public void start(){
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }
    }
}
