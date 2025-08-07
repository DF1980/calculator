package com.kodilla;
interface Employee1212 {

    double calculateSalary();
}
class FixedSalaryEmployee implements Employee1212 {

    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }
    public double calculateSalary() {
        return this.salary;
    }
}

class HourlySalaryEmployee implements Employee1212 {

    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }
    public double calculateSalary() {
        return this.hourlyPay * this.hours;
    }
}

// Payout
abstract class SalaryPayout {

    private Employee1212 employee;

    public SalaryPayout(Employee1212 employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for: " + this.employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout has been completed!");
    }
}

class SalaryPayoutProcessor extends SalaryPayout {

    public SalaryPayoutProcessor(Employee1212 employeeWWW) {
        super(employeeWWW);
    }
    protected void payout() {
        System.out.println("Sending money to employee");
    }
}


