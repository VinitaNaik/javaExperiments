import java.util.Scanner;       

class employeeDetails {
    int empNo;
    String empName;
    double salary, hra, da, netPay;  //hra=house rent allowance, dr=dearness allowance

    void haveData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        empNo = sc.nextInt();
    
        System.out.print("Enter Name: ");
        empName = sc.next();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter House Rent Allowance: ");
        hra = sc.nextDouble();

        System.out.print("Enter Dearness Allowance: ");
        da = sc.nextDouble();

        calculateNetPay();  //invoked calculation

        System.out.println("");
    }

    void calculateNetPay() {
        netPay = salary + hra + da;
    }

    void displayData() {
        System.out.println("<<< EMPLOYEE DETAILS >>>");
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee House Rent Allowance: " + hra);
        System.out.println("Employee Dearness Allowance: " + da);
        System.out.println("Employee Net Pay: " + netPay);
    }
}

class Employee {
    public static void main(String args[]) {
        employeeDetails obj = new employeeDetails();
        obj.haveData();
        obj.displayData();
    }
}




