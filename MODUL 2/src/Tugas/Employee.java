package Tugas;
    public class Employee extends Person implements EmployeeInterface { //extract interface

        //extract.supr.cls
        public Employee(employeeInfo employeeInfo) {
            super(employeeInfo.employeeName(), employeeInfo.employeeAge(), employeeInfo.salary(), employeeInfo.jobDescription()); //param>intrdc.param
        }

        @Override
        public void e() {
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Age: " + employeeAge);
            System.out.println("Salary: $" + salary);
            System.out.println("Job Description: " + jobDescription);
        }

        @Override
        public double c() {
            return salary * 12;
        }

        @Override
        public void s(double raisePercentage) {
            salary += (salary * raisePercentage / 100);
        }

        private static record employeeInfo(String employeeName, int employeeAge, double salary, String jobDescription) {
        }
    }

    /*
1.ubh semua nama di refactoring.
2.extrack interface dengan nama EmployeeInterface, semua bulet pink di centang terus refactoring.
3. Extrack superclass public employee jadi person  bulet kuning semua di centang terus refactoring.
4. Introduce parameter object sebelah nomor 3 semua centang terus refactoring.
*/

