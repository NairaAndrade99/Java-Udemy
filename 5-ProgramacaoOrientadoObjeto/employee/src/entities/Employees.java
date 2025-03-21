package entities;

public class Employees {

     public String name;
     public double grossSalary;
     public double tax;

public double netSalary(){
      return grossSalary + tax;
}
public void increseSalary(double percentage){
        grossSalary =+ ( grossSalary/100) *percentage;
}

  public String toString(){
      return "Employees: " 
             + name +
             String.format(",$ %.2f ", grossSalary);          

}

}
