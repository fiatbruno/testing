package Synchronisation;

public class Task2 {
    // This will lock this method for all THREADS OF SAME TYPE
    // ONLY SAME TYPE
    // For threads of different types we need a more advanced way
    // synchronizing for Task2
    synchronized void multiply(int numberOne, int numberTwo){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(numberTwo + " * " + numberOne + " = " + numberTwo * numberOne);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
