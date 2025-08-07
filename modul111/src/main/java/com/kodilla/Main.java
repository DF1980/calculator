package com.kodilla;
class Application111 {
    public static void main(String[] args) {

        FixedSalaryEmployee employeeZmienna = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee1Zmienna = new HourlySalaryEmployee(10, 5);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee1Zmienna);
        processor.processPayout();



    }

}