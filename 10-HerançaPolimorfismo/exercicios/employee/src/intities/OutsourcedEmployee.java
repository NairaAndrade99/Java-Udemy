public class OutsourcedEmployee extends Employee{
    
    private double additionalcharge;


public OutsourcedEmployee(){
    
}

public OutsourcedEmployee(String name, int hours, Double valuePerHour, double additionalcharge) {
    super(name, hours, valuePerHour);
    additionalcharge = additionalcharge;
}

public double getOutsourcedEmployee() {
    return additionalcharge;
}

public void setOutsourcedEmployee(double additionalcharge) {
   additionalcharge = additionalcharge;
}

@Override
 public double payment(){
      return super.payment() + additionalcharge * 1.1;
   
 }

}
