package entities.worker;

import java.util.ArrayList;
import java.util.List;

import entities.department.Department;
import entities.hourContract.HourContract;
import enuns.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Associações 
    private Department department;
    private List <HourContract> contracts = new ArrayList<>();
    
public Worker() {

}
public Worker(String name, WorkerLevel level, Double baseSalary,Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public WorkerLevel getLevel() {
    return level;
}
public void setLevel(WorkerLevel level) {
    this.level = level;
}
public Double getBaseSalary() {
    return baseSalary;
}
public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
}

public Department getDepartment() {
    return department;
}
public void setDepartment(Department department) {
    this.department = department;
}
public List<HourContract> getContracts() {
    return contracts;
}

public void addContract (HourContract contract){
    contracts.add(contract);
}
public void removerContract (HourContract contract){
    contracts.add(contract);
}
public double income (Integer year,Integer month){
      return;
}
    
}
