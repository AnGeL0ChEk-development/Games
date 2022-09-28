import java.util.Scanner;

public class Machinka {
    public static void main (String[] args) {
        System.out.print("Запустить машину - танк запустить - '1' не включять - '0' ");
        Scanner machinastart = new Scanner(System.in);
        int start = machinastart.nextInt();
        System.out.print("Какую скорость ставить машине? ");
        Scanner machinaspeed = new Scanner(System.in);
        int speed = machinaspeed.nextInt();
        Car car = new Car();
        if (start == 1) {
            car.startEngine(true);
        }
        if (start == 0) {
            car.startEngine(false);
        }
        car.setSpeed(speed);
        car.setSpeed();
    }
    public static class Car{
        int DEFAULT_SPEED = 20;
        int actualSpeed = 0;

        public boolean enstrforspeed;
        public void startEngine(boolean enginestart){
            if (enginestart == false){
                System.out.println("Двигатель не был запущен!");
                actualSpeed = 0;
            }
            if (enginestart == true){
                System.out.println("Двигатель запущен!");
                enstrforspeed = true;
            }

        }


        public void setSpeed(int newSpeed){
            actualSpeed = newSpeed;
            if (newSpeed <= 0){
                System.out.println("Mашина - танк не едет!");
                System.out.println("Брум Брум Бабах");
            }
            else if (enstrforspeed == false){
                System.out.println("Mашина - танк не едет!");
            }
            else{
                System.out.println("Машина - танк может ехать со скоростью " + actualSpeed + " километров в час!");
                System.out.println(" ######------- ");
                System.out.println("##########");
                System.out.println("##-----##");
            }
        }
        public void setSpeed(){
            actualSpeed = DEFAULT_SPEED;
        }
    }
}
