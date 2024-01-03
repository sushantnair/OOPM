import java.util.*; 

class Complex_Number {
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double re1, im1, re2, im2;
        System.out.println(
                "In this program, the accessibility of static and non-static methods inside a class is shown.");
        System.out.println("Enter the real part of the first complex number: ");
        re1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number: ");
        im1 = sc.nextDouble();
        System.out.println("Enter the real part of the second complex number: ");
        re2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number: ");
        im2 = sc.nextDouble();
        Complex_Number obj = new Complex_Number();
        add(re1, im1, re2, im2); // accessing a static method; object is not required
        subtract(re1, im1, re2, im2); // accessing a static method; object is not required
        obj.multiply(re1, im1, re2, im2); // accessing a non-static method; object is required
        obj.divide(re1, im1, re2, im2); // accessing a non-static method; object is
        sc.close();
    }
}
