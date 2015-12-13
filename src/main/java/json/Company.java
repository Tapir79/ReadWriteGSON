
package json;

/**
 *
 * @author saara
 */

import java.util.ArrayList;  
import java.util.List;  

public class Company {
    
    String listname;
    private List<Employee> employees;

    public String getListname() {
        return listname;
    }

    public void setListname(String listname) {
        this.listname = listname;
    }

    public List<Employee> getEmployers() {
        return employees;
    }

    public void setEmployees(List<Employee> employers) {
        this.employees = employers;
    }
      
    
}
