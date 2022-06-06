//creating a class for person
public class Person {
        // Attributes
        String name;
        String email;
        String physical_address;
        int number;

        // creating a constructor method
        public Person(String name, String email, String physical_address, int number){
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
            String output = "Name: "+name;
            output += "\nEmail: "+ email;
            output += "\nPhysical Address: "+physical_address;
            output += "\nMobile Number: "+number;

            return output;
        }
}
