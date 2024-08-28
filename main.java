public class Main {
 public static void main(String[] args) {
 payrollsystem py=new payrollsystem();
 fulltimeEmploye emp1=new 
fulltimeEmploye("zaheer",42113,500000.0);

 parttimeEmploy emp2=new parttimeEmploy("sami",42123,100,40);
 py.addEmploye(emp1);
 py.addEmploye(emp2);

 System.out.println("initial employee details");
 py.displayEmployes();
 System.out.println("removing employee");
 py.removeEmploye(42123);
 System.out.println("After removing remaining employe");
 py.displayEmployes();
 System.out.println("part time salary :"+emp2.calculatesalary());
 System.out.println("fulltime employe salary 
:"+emp1.calculatesalary());
    }
}
