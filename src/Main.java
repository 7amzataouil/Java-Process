public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50000);
        employee.getBaseSalary();
        employee.getHourlyRate();
        employee.setHourlyRate(20);
        int wage = employee.calculatedWage( 20);
        System.out.println(wage);

    }

}