import java.util.*;

class Employee {
    String E_Name;
    int E_Id;
    double E_Salary;

    Employee(String E_Name, int E_Id, double E_Salary) {
        this.E_Name = E_Name;
        this.E_Id = E_Id;
        this.E_Salary = E_Salary;
    }
}

class SortBySalary implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        if (a.E_Salary > b.E_Salary)
            return 1;
        else if (a.E_Salary < b.E_Salary)
            return -1;
        else
            return 0;
    }
}

public class employee_management_system_using_vector {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Vector<Employee> E = new Vector<Employee>();
        int ch, i, n;
        do {
            System.out.println(
                    "Enter:\n'1' to create a record of employees.\n'2' to insert more employee data.\n'3' to delete an employee's data based on name.\n'4' to delete an employee's data based on id.\n'5' to display the employee record.\n'6' to exit from the system.\nEnter your choice: ");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the number of employees initially: ");
                    n = in.nextInt();
                    for (i = 0; i < n; i++) {
                        System.out.println("For Employee " + (i + 1) + ", enter Name: ");
                        String E_Name1 = in.next();
                        System.out.println("For " + E_Name1 + ", enter Employee ID: ");
                        int E_Id1 = in.nextInt();
                        System.out.println("For " + E_Id1 + ", enter Salary: ");
                        double E_Salary1 = in.nextDouble();
                        E.addElement(new Employee(E_Name1, E_Id1, E_Salary1));
                    }
                    E.sort(new SortBySalary());
                    break;
                case 2:
                    System.out.println("For new Employee, enter Name: ");
                    String E_Name2 = in.next();
                    System.out.println("For " + E_Name2 + ", enter Employee ID: ");
                    int E_Id2 = in.nextInt();
                    System.out.println("For " + E_Id2 + ", enter Salary: ");
                    double E_Salary2 = in.nextDouble();
                    for (i = 0; i < E.size(); i++) {
                        if (E.get(i).E_Salary > E_Salary2) {
                            E.add(i, new Employee(E_Name2, E_Id2, E_Salary2));
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of the employee whose data you want to delete: ");
                    String del_E_Name = in.next();
                    int del_n_f = 0;
                    for (i = 0; i < E.size(); i++) {
                        if (E.get(i).E_Name.equals(del_E_Name)) {
                            E.remove(i);
                            del_n_f++;
                            break;
                        }
                        if (del_n_f != 0)
                            System.out.println("Deletion Successful.");
                        else
                            System.out.println("Deletion Unsuccessful.");
                    }
                    break;
                case 4:
                    System.out.println("Enter the id of the employee whose data you want to delete: ");
                    int del_E_Id = in.nextInt();
                    int del_i_f = 0;
                    for (i = 0; i < E.size(); i++) {
                        if (E.get(i).E_Id == del_E_Id) {
                            E.remove(i);
                            del_i_f++;
                            break;
                        }
                        if (del_i_f != 0)
                            System.out.println("Deletion Successful.");
                        else
                            System.out.println("Deletion Unsuccessful.");
                    }
                    break;
                case 5:
                    System.out.println("Sr. No.\tName\t\tId\tSalary");
                    for (i = 0; i < E.size(); i++) {
                        System.out.println(
                                (i + 1) + "\t" + E.get(i).E_Name + "\t\t" + E.get(i).E_Id + "\t" + E.get(i).E_Salary);
                    }
                    break;
                case 6:
                    System.out.println("THANK\tYOU\tVERY\tMUCH\nE\tX\tI\tT\tI\tN\tG\t.\t.\t.");
                    break;
                default:
                    System.out.println("Please enter '1', '2', '3', '4', '5' or '6' only and try again!");
            }
        } while (ch != 6);
        in.close();
    }
}
