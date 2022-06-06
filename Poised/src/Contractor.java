public class Contractor {
        // Attributes
        String name;
        String email;
        String physical_address;
        int number;


        //creating a constructor method
        public Contractor(String name, String email, String physical_address, int number){
            this.name =name;
            this.email = email;
            this.physical_address = physical_address;
            this.number = number;
        }

        //method for setting new number
        public void setNumber( Integer new_number){
            this.number = new_number;
        }

        //toString method for displaying objects
        public String toString() {
            String output = "Contractor: "+name;
            output += "\nContractor email: "+ email;
            output += "\nContractor physical address: "+physical_address;
            output += "\nContractor number: "+number;

            return output;
        }
}

