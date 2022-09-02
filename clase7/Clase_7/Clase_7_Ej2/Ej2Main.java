package Clase_7.Clase_7_Ej2;

public class Ej2Main {

    public static void main(String[] args) {

        for(int i = 0;i<100;i++){
            FlyweightFactory computer = new FlyweightFactory();
            Computer mac1 = computer.getComputer(1);
            mac1.setDisco(i+10);
            mac1.setRam(i);
            Computer windows = computer.getComputer(2);
            windows.setDisco(i+20);
            windows.setRam(i+2);


        }



    }
}
