package Synchronisation;

public class InstanceSyncDemo {
    public static void main(String[] args) {
        // FIRST WAY TO SYNCHRONIZE

        /*

        Task task1 = new Task();
        Executor executor1 = new Executor("Task1", task1, 2);
        Executor executor2 = new Executor("Task2", task1, 10);
        executor1.start();
        executor2.start();

        */

        // SECOND WAY TO SYNCHRONIZE

        Task2 task2 = new Task2();
        Doer first = new Doer("First", task2);
        Redoer second = new Redoer("Second", task2);
        first.start();
        second.start();
    }
}
