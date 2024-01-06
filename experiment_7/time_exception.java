import java.util.*;

class TimeException extends Exception {
    public String toString() {
        return "The time is greater than 60 seconds.";
    }
}

public class time_exception {
    public static void time(float minute, float second) throws Exception {
        float time;
        time = 60 * minute + second;
        if (time > 60) {
            throw new TimeException();
        } else {
            System.out.println("The time is: " + time);
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter the minutes: ");
            float min = in.nextFloat();
            System.out.println("Enter the seconds: ");
            float s = in.nextFloat();
            try {
                time(min, s);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Do you want to continue?\nPress 'Y' otherwise press any character: ");
            ch = in.next().charAt(0);
        } while (ch == 'Y');
    }
}