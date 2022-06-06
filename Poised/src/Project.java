//creating a class for projects
public class Project {

    // Attributes
    String project_name;
    int project_id;
    String building_type;
    String address;
    String efr_number;
    double project_cost;
    double amount_paid;
    String deadline;
    Person architect;
    Person contractor;
    Person customer;

    //creating a constructor method
    public Project(String project_name, int project_id, String building_type, String address,
                   String efr_number, Double project_cost, Double amount_paid, String deadline,
                   Person architect, Person contractor, Person customer){
        this.project_name = project_name;
        this.project_id = project_id;
        this.building_type = building_type;
        this.address = address;
        this.efr_number = efr_number;
        this.project_cost = project_cost;
        this.amount_paid = amount_paid;
        this.deadline = deadline;
        this.architect = architect;
        this.contractor = contractor;
        this.customer = customer;
    }

    //Method for getting Architect details
    public Person getArchitect() {
        return architect;
    }

    //Method for getting Contractor details
    public Person getContractor() {
        return contractor;
    }

    //Method for getting Customer details
    public Person getCustomer() {
        return customer;
    }

    //creating a setter method for setting a new deadline
    public void setDeadline(String new_deadline)
    {
        this.deadline = new_deadline;
    }

    //creating a setter method for setting a new amount paid
    public void setAmount_paid(Double new_amount)
    {
        this.amount_paid = new_amount;
    }

    //toString method for displaying objects
    public String toString() {
        String output = "Project Name: " + project_name;
        output += "\nProject Number: " + project_id;
        output +="\nBuilding Type:"+ building_type;
        output += "\nAddress: "+ address;
        output +="\nEFR Number:"+ efr_number;
        output +="\nArchitect:\n"+ architect;
        output +="\nContractor:\n"+ contractor;
        output +="\nCustomer:\n"+ customer;

        return output;
    }
}
