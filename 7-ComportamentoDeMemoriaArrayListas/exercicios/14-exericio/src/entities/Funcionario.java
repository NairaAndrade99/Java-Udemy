package entities;

public class Funcionario {

    private Integer id;
    private String name;
    private Double salary;

    public Funcionario(){

    }
    public Funcionario(Integer id,String name,Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        
    }
    public void increaseSlary(Double percentage){
         salary += salary * percentage/100.0;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public String toString (){
         return id + ", " +
                name + ", R$" +
                String.format("%.2f ", getSalary());
    }
}
