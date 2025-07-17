package entidades;
public class Company extends TaxPayer {
      private int numberOfEmployee;

    public Company(){

    }

    public Company(String name, double anualIncome, int numberOfEmployee) {
        super(name, anualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }
    
    @Override 
    public double tax(){
     if (numberOfEmployee > 10){
         return getAnualIncome() * 0.14;
    }else {
         return getAnualIncome() * 0.16;
    }
}

}
