public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculatedWage(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }
    public void setBaseSalary( int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can't be 0 or negative!");
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can't be 0 or negative!");
        this.hourlyRate = hourlyRate;
    }
}
