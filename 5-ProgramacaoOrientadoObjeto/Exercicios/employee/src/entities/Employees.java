package entities;

public class Employees {

     public String name;
     public double grossSalary;
     public double tax;

public double netSalary(){
      return grossSalary - tax;
}
public void increseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;
}

  public String toString(){
      return  name + String.format(", $ %.2f ", netSalary() );          

}

}
