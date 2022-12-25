import java.util.*;

class Employee {
    int eno;
    String ename;
    String desig;
    int salary;

    Employee(){
        eno = 0;
        ename = "";
        desig = "";
        salary = 0;
    }

    Employee(int empno, String empname, String designation, int sal) {
        eno = empno;
        ename = empname;
        desig = designation;
        salary = sal;
    }

    public void read(Scanner sc) {
        eno = Integer.parseInt(sc.nextLine());
        ename = sc.nextLine();
        desig = sc.nextLine();
        salary = Integer.parseInt(sc.next());
    }

    public void display() {
        System.out.println("Eno: " + eno);
        System.out.println("Ename: " + ename);
        System.out.println("Designation: " + desig);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee{
    int totemp;
    int totsuper;

    Manager(){
        totemp = 0;
        totsuper = 0;
    }

    Manager(int empno, String empname, String designation, int sal, int tot_emp, int tot_sup) {
        super(empno, empname, designation, sal);
        totemp = tot_emp;
        totsuper = tot_sup;
    }

    public void read(Scanner sc) {
        super.read(sc);
        totemp = sc.nextInt();
        totsuper = sc.nextInt();
    }

    public void display() {
        super.display();
        System.out.println("Total employees in the dept: " + totemp);
        System.out.println("Total supervisors in the dept: " + totsuper);
    }
}

public class inheritance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Manager m1 = new Manager();
        m1.read(sc);
        m1.display();
        sc.close();
}
}