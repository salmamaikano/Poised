public class Architect {
    // Attributes
    String name;
    String email;
    String physical_address;
    int number;


    //constructor
    public Architect(String name, String email, String physical_address, int number){
        this.name =name;
        this.email = email;
        this.physical_address = physical_address;
        this.number = number;

    }
    public String toString() {
        String output ="Architect: "+name;
        output += "\nArchitect email: "+email;
        output += "\nArchitect physical address: "+physical_address;
        output += "\nArchitect number: "+number;

        return output;
    }
}
