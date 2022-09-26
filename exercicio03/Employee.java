package exercicio03;

public class Employee {
    String name;
    double grossSalary;
    double tax;

    double netSalary(){
        return grossSalary - tax;
    }

    void increaseSalary(double percentagem){
        grossSalary += grossSalary * percentagem/100;
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
