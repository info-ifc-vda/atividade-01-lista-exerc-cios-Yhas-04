package entities;

public class Worker {
    public static double TAX = 0.3;
    private Double hoursWorked;
    private Double valuePerHour;
    private Double grossSalary;
    private Double netSalary;

    public Worker(Double hoursWorked, Double valuePerHour) {
        this.hoursWorked = hoursWorked;
        this.valuePerHour = valuePerHour;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double gross_Salary(double valuePerHour, double hoursWorked) {
        return this.grossSalary = valuePerHour * hoursWorked;
    }

    public double net_salary() {
        return this.netSalary = grossSalary - (grossSalary * TAX);
    }
}

