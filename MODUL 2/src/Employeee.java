public class Employeee { //extract interface
        private String employeeName;
        private int employeeAge;
        private double salary;
        private String jobDescription;

        public Employeee(String employeeName, int employeeAge, double salary, String jobDescription) { //parameter>intrdc.param
            this.employeeName = employeeName;
            this.employeeAge = employeeAge;
            this.salary = salary;
            this.jobDescription = jobDescription;
        }

        public void printEmployeeInfo() {
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Age: " + employeeAge);
            System.out.println("Salary: $" + salary);
            System.out.println("Job Description: " + jobDescription);
        }

        public double calculateAnnualSalary() {
            return salary * 12;
        }

        public void applyRaise(double raisePercentage) {
            salary += (salary * raisePercentage / 100);
        }
    }

