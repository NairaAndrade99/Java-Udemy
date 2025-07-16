public class OutsourcedEmployee extends Employee{
    
    private double OutsourcedEmployee;
    

public OutsourcedEmployee(){

}

public OutsourcedEmployee(String name, int hours, Double valuePerHour, double outsourcedEmployee) {
    super(name, hours, valuePerHour);
    OutsourcedEmployee = outsourcedEmployee;
}

public double getOutsourcedEmployee() {
    return OutsourcedEmployee;
}

public void setOutsourcedEmployee(double outsourcedEmployee) {
    OutsourcedEmployee = outsourcedEmployee;
}


}
