import java.util.*;
//ignore error here if any appears
class myMath {
    static double a, b, p = 1, f = 1, res_ser1 = 1, res_ser2 = 1;
    static int i, n;

    myMath(double x, double y, int num) {
        a = x;
        b = y;
        n = num;
    }

    static double power(double a, double b) {
        if (b == 0) {
            return 1;
        }
        b--;
        return (a * power(a, b));
    }

    static double fact(double a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return (a * fact(a - 1));
    }

    static double fact2(double a, int n) {
        if (n == 0) {
            return 1;
        }
        n--;
        return (a * fact2(a - 1, n));
    }

    static double ser1(double a, int n) {
        for (i = 1; i < n; i++) {
            res_ser1 = res_ser1 + (power(a, i) / fact(i));
        }
        return res_ser1;
    }

    static double ser2(double a, double n) {
        for (i = 1; i < n; i++) {
            res_ser2 = res_ser2 + (fact2(n, i) * ((power(a, i)) / (fact(i))));
        }
        return res_ser2;
    }
}

public class series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x, y, P, F, r_s1, r_s2;
        int num;
        System.out.println("Enter the first number: ");
        x = sc.nextDouble();
        System.out.println("Enter the second number: ");
        y = sc.nextDouble();
        System.out.println("Enter the number of terms both series should have: ");
        num = sc.nextInt();
        myMath ob = new myMath(x, y, num);
        P = myMath.power(x, y);
        F = myMath.fact(x);
        r_s1 = myMath.ser1(x, num);
        r_s2 = myMath.ser2(x, y);
        System.out.println("The result of " + x + "^" + y + " is: " + P);
        System.out.println("The result of " + (int) x + "! is: " + (int) F);
        System.out.println("The result of e^x upto " + num + " terms is: " + r_s1);
        System.out.println("The result of (1+x)^n upto " + num + " terms is: " + r_s2);
    }
}