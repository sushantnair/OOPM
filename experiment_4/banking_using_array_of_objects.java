import java.util.*;

class Account {
    int id;
    String name;
    float bal;

    Account(int id, String name, float bal) {
        this.id = id;
        this.name = name;
        this.bal = bal;
    }

}

public class banking_using_array_of_objects {
    public static void main(String[] args) {
        int ch, acc_id, balance, del_acc_id, flag;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of accounts:");
        int noa = sc.nextInt();
        Account[] ac = new Account[noa];
        System.out.println("Enter the intial number of accounts to be added:");
        int inoa = sc.nextInt();
        int inoa1 = inoa;
        if (inoa <= noa) {
            for (int i = 0; i < inoa; i++) {
                System.out.println("For Record " + (i + 1) + ", enter the Account Number: ");
                acc_id = sc.nextInt();
                System.out.println("For Account Number " + acc_id + ", enter Name: ");
                name = sc.next();
                System.out.println("For " + name + ", enter the Balance: ");
                balance = sc.nextInt();
                ac[i] = new Account(acc_id, name, balance);
            }
            do {
                System.out.println(
                        "Enter:\n'1' to add an account.\n'2' to delete an account.\n'3' to display the entire record.\n'4' to exit.\nEnter your choice: ");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        if (inoa >= noa) {
                            System.out.println("Sorry! The number of accounts exceeds the initial number of accounts.");
                            System.out.println("In order to add more, delete one record first.");
                        } else {
                            if (inoa >= inoa1) {
                                System.out.println("For Record, enter the Account Number: ");
                                acc_id = sc.nextInt();
                                System.out.println("For Account Number " + acc_id + ", enter Name: ");
                                name = sc.next();
                                System.out.println("For " + name + ", enter the Balance: ");
                                balance = sc.nextInt();
                                ac[inoa++] = new Account(acc_id, name, balance);

                            } else {
                                System.out.println("For Record, enter the Account Number: ");
                                acc_id = sc.nextInt();
                                System.out.println("For Account Number " + acc_id + ", enter Name: ");
                                name = sc.next();
                                System.out.println("For " + name + ", enter the Balance: ");
                                balance = sc.nextInt();
                                ac[inoa].id = acc_id;
                                ac[inoa].name = name;
                                ac[inoa].bal = balance;
                                inoa++;
                            }
                        }
                        break;
                    case 2:
                        flag = 0;
                        System.out.println("Enter the Account Number of the account to delete:");
                        del_acc_id = sc.nextInt();
                        for (int i = 0; i < inoa; i++) {
                            if (del_acc_id == ac[i].id) {
                                for (int j = i; j < (inoa - 1); j++) {
                                    ac[j] = ac[j + 1];
                                }
                                inoa--;
                                flag = 1;
                            }

                        }
                        if (flag == 1)
                            System.out.println("Record found.");
                        else
                            System.out.println("Record not found.");
                        break;
                    case 3:
                        System.out.println("Account Number\tName\t Balance");
                        for (int i = 0; i < inoa; i++) {
                            System.out.println(ac[i].id + "\t\t" + ac[i].name + "\t" + ac[i].bal);
                        }
                        break;
                    case 4:
                        System.out.println("E\tX\tI\tT\tI\tN\tG\t.\t.\t.");
                        break;
                    default:
                        System.out.println("Enter '1', '2', '3' or '4' only. Please try again.");
                        break;
                }

            } while (ch != 4);
        } else {
            System.out.println("Sorry! The initial number of accounts cannot exceed the number of accounts.");
        }
        sc.close();
    }
}
