public class Customer {

        // Attributes
        String name;
        String email;
        String physical_address;
        int number;



        //constructor
        public Customer(String name, String email, String physical_address, int number){
            this.name =name;
            this.email = email;
            this.physical_address = physical_address;
            this.number = number;


        }
    public String toString() {
        String output = "Customer: "+name;
        output += "\nCustomer email: "+email;
        output += "\nCustomer physical address: "+physical_address;
        output += "\nCustomer number: "+number;

        return output;
    }
    }

