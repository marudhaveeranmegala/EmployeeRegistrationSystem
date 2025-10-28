
import java.util.Scanner;
public class EmployeeRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int id = scan.nextInt();
        System.out.println("Enter Employee Name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("Enter Employee Email: ");
        String email = scan.nextLine();

        EmailValidator valid = new EmailValidator();
        if(valid.isValidEmail(email)){
            if(valid.isCompanyMail(email)){
                System.out.printf("Employee registered successfully!\n\n");
                Employee emp = new Employee(id,name,email);
                emp.displayDetails();
            }
            else{
                System.out.println("Email must be a company email end with '@company.com'. Please try again.");
            }
        }
        else{
            System.out.println("Invalid email format. Please try again.");
        }
    }
}
