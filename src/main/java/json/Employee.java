
package json;

/**
 *
 * @author saara
 */
class Employee {
   
    String FirstName;
    String LastName;
    int salary;
    String status;

    

    public Employee(String name, String lname, int salary,String status){
       this.FirstName = name;
       this.LastName = lname;
       this.salary = salary;
       this.status = status;
    }
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
            
}
