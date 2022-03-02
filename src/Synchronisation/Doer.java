package Synchronisation;

public class Doer extends Thread{
    private String name;
    Task2 function;

    public Doer(String name, Task2 multiply){
        this.name = name;
        this.function = multiply;
    }
    @Override
    public void run(){
        System.out.println(name + " S-T-A-R-T-E-D");
        function.multiply(9, 6);
        System.out.println(name + " C-O-M-P-L-E-T-E-D");
    }
}
