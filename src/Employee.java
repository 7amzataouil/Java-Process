public class Employee {
    public int baseSalary;

    public int hourlyRate;

    public int calculatedWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
}
