import java.util.Scanner;

public class poised {
    public static void main(String[] args) {

        /*
        Getting customer details by initializing and reinitializing the Scanner object,
        so the scanner does not store previous data
        */
        System.out.println("---------Customer Details---------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the costumer name: ");
        String cs_name = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the costumer email address: ");
        String cs_email = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the costumer physical address: ");
        String cs_physical_address = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the costumer number: ");
        Integer cs_number = input.nextInt();

        /*
        Getting Contractor details by reinitializing multiple times the Scanner object,
        so the scanner does not store previous data
        */
        System.out.println("---------Contractor Details---------");
        input = new Scanner(System.in);

        System.out.print("Enter the Contractor name: ");
        String ct_name = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the Contractor email address: ");
        String ct_email = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the Contractor physical address: ");
        String ct_physical_address = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the Contractor number: ");
        Integer ct_number = input.nextInt();


        /*
        Getting Architect details by reinitializing multiple times the Scanner object,
        so the scanner does not store previous data
        */
        System.out.println("---------Architect Details---------");
        input = new Scanner(System.in);

        System.out.print("Enter the Architect name: ");
        String arc_name = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the Architect email address: ");
        String arc_email = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the Architect physical address: ");
        String arc_physical_address = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the Architect number: ");
        Integer arc_number = input.nextInt();


        /*
        Getting Project details by reinitializing multiple times the Scanner object,
        so the scanner does not store previous data
        */
        System.out.println("---------Project Details---------");
        input = new Scanner(System.in);

        System.out.print("Enter the Project name: ");
        String project_name = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the project ID: ");
        Integer id = input.nextInt();

        input = new Scanner(System.in);

        System.out.print("Enter the building type: ");
        String building_type = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter project address: ");
        String address = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the project EFR number ");
        String efr_number = input.nextLine();

        input = new Scanner(System.in);

        System.out.print("Enter the project cost: ");
        Double cost = input.nextDouble();

        input = new Scanner(System.in);

        System.out.print("Enter the amount paid: ");
        Double amount_paid = input.nextDouble();

        input = new Scanner(System.in);

        System.out.print("Enter the project deadline: ");
        String deadline = input.nextLine();

        //creating objects of a class
        Person customer = new Person(cs_name, cs_email, cs_physical_address, cs_number);
        Person architect = new Person(arc_name, arc_email, arc_physical_address, arc_number);
        Person contractor = new Person(ct_name, ct_email, ct_physical_address, ct_number);
        Project poised = new Project(project_name, id, building_type, address, efr_number, cost, amount_paid, deadline
                , architect, contractor, customer);

        // initializing a variable
        int choice;

        //while loop for displaying a menu to the user and getting there choice use a scanner object
        while (true) {

            System.out.println("Enter the option number for the action you want to implement\n" +
                    "1- View all projects\n" +
                    "2- Edit due date\n" +
                    "3- Edit Amount paid\n" +
                    "4- Edit contractor contact detail\n" +
                    "0- to exit\n" +
                    "\nSelection: ");

            input = new Scanner(System.in);
            choice = input.nextInt();

            //statement for calling functions based on the users input
            if (choice == 1) {

                //printing the project detail
                System.out.println(poised);

            } else if (choice == 2) {

                //setting new date
                System.out.println("Enter a new deadline: ");
                input = new Scanner(System.in);
                String new_deadline = input.nextLine();
                poised.setDeadline(new_deadline);

            } else if (choice == 3) {

                //setting a new amount
                System.out.println("Enter a new amount_paid: ");
                input = new Scanner(System.in);
                Double new_amount = input.nextDouble();
                poised.setAmount_paid(new_amount);

            } else if (choice == 4) {

                //updating contractor contact detail
                System.out.println("Enter the new contractor contact detail: ");
                input = new Scanner(System.in);
                Integer new_contact = input.nextInt();
                poised.getContractor().setNumber(new_contact);

            } else if (choice == 0) {

                break;
            }
        }
    }
}
