/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismtestcomissionemployee;

/**
 *
 * @author Salah
 */
public class PolymorphismTestComissionEmployee extends Object {

    /**
     * @param args the command line arguments
     */
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public PolymorphismTestComissionEmployee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
            
    public void setFirstName()
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String lastName)
    {
        lastName = lastName;
    }
    
    public String getSocialNumber()
    {
        return socialSecurityNumber;
    }
    
    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    @Override
    public String toString()
    {
     return String.format("%s%n %s: %s %s%n%s:%n", "PolymorphismTestComissionEmployee","Employee Name",
                            this.getFirstName(), this.getLastName(),this.getSocialNumber());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    
            PolymorphismTestComissionEmployee Employee = new PolymorphismTestComissionEmployee("Bob", "Lewis", "333-33-3333");
        
            System.out.printf("%s%n",Employee.toString());
    
    }
    
}
