
package json;

/**
 *
 * @author saara
 */

import java.util.ArrayList;  
import java.util.List;  

public class Company {
    
    String companyname;
    private List<Employee> employees;

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public List<Employee> getEmployers() {
        return employees;
    }

    public void setEmployees(List<Employee> employers) {
        this.employees = employers;
    }
      
    
}
