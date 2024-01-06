package experiment_8;
import java.util.*;

class Square extends Thread {
    int num;

    Square(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("The square of " + this.num + " is " + (this.num * this.num) + ".");
    }
}

class Cube extends Thread {
    int num;

    Cube(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("The cube of " + this.num + " is " + (this.num * this.num * this.num) + ".");
    }
}

class NumberGenerator extends Thread {
    int max;

    public void run() {
        Random randomnumber = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of random numbers to generate: ");
        int n = in.nextInt();
        System.out.println(
                "Enter the maximum value which any generated random number must not exceed (which must be less than 1290): ");
        do {
            max = in.nextInt();
            if (max > 1290) {
                System.out.println("The maximum value of generated integer cannot be more than 1290.");
                System.out.println(
                        "The reason being that the cube of such a number cannot be stored in an integer type variable.");
            }
        } while (max > 1290);
        for (int i = 0; i < n; i++) {
            int random_int = randomnumber.nextInt(max);
            System.out.println("The random integer generated is " + random_int + ".");
            if (random_int % 2 == 0) {
                Square sq_ob = new Square(random_int);
                sq_ob.start();
            } else {
                Cube cb_ob = new Cube(random_int);
                cb_ob.start();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
        in.close();
    }
}

class multithreading {
    public static void main(String args[]) {
        NumberGenerator ob = new NumberGenerator();
        ob.start();
    }
}
