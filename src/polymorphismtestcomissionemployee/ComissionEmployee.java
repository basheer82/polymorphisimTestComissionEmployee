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
public class ComissionEmployee extends PolymorphismTestComissionEmployee {
    
    private double comissionRate;
    private double grossSales;
    
    
    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double comissionRate, 
                             double grossSales)
    {
        super(firstName, lastName, socialSecurityNumber);
        
        this.comissionRate = comissionRate;
        this.grossSales = grossSales;
    }
    
    public double getComissionRate()
    {
        return comissionRate;
    }
    
    public void setComissionRate(double comissionRate)
    {
        this.comissionRate = comissionRate;
    }

    public double getGrossSales()
    {
        return grossSales;
    }
    
    public double getEarnings()
    {
        return grossSales * comissionRate;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s%n%s%n%s: %.2f%n%s: %.2f%n","Comission Employee", super.toString(),"Gross Sales", this.getGrossSales(),"Earnings",this.getEarnings());
    }


}
