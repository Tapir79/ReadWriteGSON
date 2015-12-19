package json;

import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;  
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author saara
 */
public class WriteReadGson {
    
     public static void main(String[] args) {
         
    Gson gson = new Gson();  
    
    List <Employee> employees = new ArrayList();
    employees.add(new Employee("Elaine","Marley",500,"BOSS"));
    employees.add(new Employee("Gordon","Freeman",100,"Scientist"));
    employees.add(new Employee("Saara","Pakarinen",80,"Software developer"));
          
    
    Company company = new Company();
    company.setCompanyname("My company");
    company.setEmployees(employees);
    
  String json = gson.toJson(company);  
    
  try {  
  
   FileWriter writer = new FileWriter("/home/saara/NetBeansProjects/ReadJSON/src/main/java/json/emjson.json");  
   writer.write(json);  
   writer.close();  
    
  } catch (IOException e) {  
   e.printStackTrace();  
  }  
    
  System.out.println(json);  
    
// Reading the just printed JSON from a file        
     
  try {     
     
   BufferedReader br = new BufferedReader(  
     new FileReader("/home/saara/NetBeansProjects/ReadJSON/src/main/java/json/emjson.json"));  
     
   Company mycompany = gson.fromJson(br, Company.class);  
     
   System.out.println("Name Of List: "+mycompany.getCompanyname());  
   System.out.println("Employees as one object: "+mycompany.getEmployers());  
   System.out.println("Employees iterated :");  
     
   List<Employee> emps = mycompany.getEmployers();  
   for (int i = 0; i < emps.size(); i++) {  
    System.out.println(emps.get(i).FirstName + " " + emps.get(i).LastName + " " + emps.get(i).getSalary() + " " + emps.get(i).getStatus()); 
   }  
    
  } catch (IOException e) {  
   e.printStackTrace();  
 
    }          
 }
                 
}

