import java.util.*; 

class CN_OP {
    static double r, i;

    static void add(double r1, double i1, double r2, double i2) {
        r = r1 + r2;
        i = i1 + i2;
        System.out.println("The sum of " + r1 + "+i" + i1 + " and " + r2 + "+i" + i2 + " is " + r + "+i" + i);
    }

    static void subtract(double r1, double i1, double r2, double i2) {
        r = r1 - r2;
        i = i1 - i2;
        System.out.println("The difference of " + r1 + "+i" + i1 + " and " + r2 + "+i" + i2 + " is " + r + "+i" + i);
    }

    void multiply(double r1, double i1, double r2, double i2) {
        r = (r1 * r2 - i1 * i2);
        i = (r2 * i1 + r1 * i2);
        System.out.println("The product of " + r1 + "+i" + i1 + " and " + r2 + "+i" + i2 + " is " + r + "+i" + i);
    }

    void divide(double r1, double i1, double r2, double i2) {
        r = (r1 * r2 + i1 * i2) / (r2 * r2 + i2 * i2);
        i = (r2 * i1 - r1 * i2) / (r2 * r2 + i2 * i2);
        System.out.println("The quotient of " + r1 + "+i" + i1 + " and " + r2 + "+i" + i2 + " is " + r + "+i" + i);
    }
}

class Complex_Number2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double re1, im1, re2, im2;
        System.out.println(
                "In this program, the accessibility of static and non-static methods outside a class is shown.");
        System.out.println("Enter the real part of the first complex number: ");
        re1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number: ");
        im1 = sc.nextDouble();
        System.out.println("Enter the real part of the second complex number: ");
        re2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number: ");
        im2 = sc.nextDouble();
        CN_OP ob = new CN_OP();
        CN_OP.add(re1, im1, re2, im2); // accessing static method from outside the class
        CN_OP.subtract(re1, im1, re2, im2); // accessing static method from outside the class
        ob.multiply(re1, im1, re2, im2); // accessing non-static method from outside class
        ob.divide(re1, im1, re2, im2); // accessing non-static method from outside class
        sc.close();
    }
}
