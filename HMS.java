import java.util.*;

class Hostel {
    int roll_no, age, dob;
    String name, phn_no;
    char gender;
    static boolean rooms[] = { false, false, false, false, false };

    // int room_num_cap[2][2];
    Hostel() {

    }

    Hostel(int roll_no, String name, char gender,
            int age, int dob, String phn_no) {
        this.roll_no = roll_no;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dob = dob;
        this.phn_no = phn_no;
    }

    static int get_vacancy_status() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == false)
                return i;
        }
        return -1;
    }
}

class Student extends Hostel {
    int room_allotted;
    boolean allotment_status;

    Student() {

    }

    Student(int roll_no, String name, char gender, int age, int dob, String phn_no) {
        super(roll_no, name, gender, age, dob, phn_no);
        this.allotment_status = false;
        this.room_allotted = -1;
    }

    public void allot() {
        int vacancy_room_id = 0;
        vacancy_room_id = Hostel.get_vacancy_status();
        if (vacancy_room_id != -1) {
            this.allotment_status = true;
            this.room_allotted = vacancy_room_id + 1;
            rooms[vacancy_room_id] = true;
        }
    }

    static void delete(Vector<Student> s, int del_roll_no) {
        for (int i = 0; i < s.size(); i++) {
            if (del_roll_no == s.get(i).roll_no) {
                s.get(i).allotment_status = false;
                s.get(i).room_allotted = -1;
                rooms[i] = false;
                s.removeElementAt(i);
            } else
                System.out.println("Student not found.");
        }
    }

    public void display_details() {

        System.out.println(this.roll_no + "\t" + this.name + "\t" + this.gender +
                "\t" + this.age + "\t" + this.dob + "\t" + this.phn_no + "\t" + this.allotment_status + "\t"
                + this.room_allotted);
    }

}

public class HMS {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the number of students you want to add initially:
        // ");
        // int n = in.nextInt();
        // int ar[] = new int[10];
        Vector<Student> obj_student = new Vector<Student>();
        Iterator<Student> itr = obj_student.iterator();
        int ch;
        do {
            System.out.println("Enter:\n'1' To add a student\n'2' To delete a student\n");
            System.out.print("'3' To allocate a room\n'4' To display the allocation list\n");
            System.out.print("'5' To exit\nEnter your choice:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    /* int roll_no, String name, char gender, int age, int dob, String phn_no */

                    System.out.println("For record, enter Name: ");
                    String NAME = in.next();
                    in.nextLine();
                    System.out.println("For " + NAME + ", enter Roll Number: ");
                    int ROLL_NO = in.nextInt();
                    System.out.println("For " + NAME + ", enter Gender: ");
                    char GENDER = in.next().charAt(0);
                    System.out.println("For " + NAME + ", enter Age: ");
                    int AGE = in.nextInt();
                    System.out.println("For " + NAME + ", enter Date of Birth (DDMMYYYY): ");
                    int DOB = in.nextInt();
                    System.out.println("For " + NAME + ", enter Phone Number: ");
                    String PHN_NO = in.next();
                    in.nextLine();
                    Student s = new Student(ROLL_NO, NAME, GENDER, AGE, DOB, PHN_NO);
                    obj_student.add(s);

                    break;
                case 2:
                    // delete student from a room based on roll number
                    System.out.println("\nEnter the roll number of the student whose admission you want to cancel: ");
                    int del_roll_no = in.nextInt();
                    Student.delete(obj_student, del_roll_no);
                    break;
                case 3:
                    for (int i = 0; i < obj_student.size(); i++) {
                        if (obj_student.get(i).allotment_status == false)
                            obj_student.get(i).allot();

                    }
                    System.out.println("Allotment completed based on availability.");
                    break;
                case 4:
                    // display
                    System.out.println("KJSCE\tHostel\tManagement\tSystem\n");
                    System.out.println(
                            "\nPlease note that if the Admission Status is ''true'' and if the Room Allocated is a number");
                    System.out.println(
                            "\nother than -1, then only the student has been admitted to the hostel. Further, admission status");
                    System.out.println("\nis subject to change based on changing input.");
                    System.out.println(
                            "\nRoll No.\tName\tGender\tAge\tDate of Birth\tPhone Number\tAllotment Status\tRoom Allotted\n");
                    for (int i = 0; i < obj_student.size(); i++) {
                        obj_student.get(i).display_details();
                    }
                    break;
                case 5:
                    System.out.println("Thank you very much\nE\tX\tI\tT\tI\tN\tG\t.\t.\t.");
                    break;
                default:
                    System.out.println("Please enter '1', '2', '3' or '4' only and try again!");
            }

        } while (ch != 5);
        in.close();
    }
}