package Synchronisation;

public class Redoer extends Thread{
        private String name;
        Task2 function;

        public Redoer(String name, Task2 multiply){
            this.name = name;
            this.function = multiply;
        }
        @Override
        public void run(){
            System.out.println(name + " S-T-A-R-T-E-D");
            function.multiply(1, 0);
            System.out.println(name + " C-O-M-P-L-E-T-E-D");
    }

}
