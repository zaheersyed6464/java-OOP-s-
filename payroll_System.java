import java.util.ArrayList;

//Details of employee ***
//superclass---0
abstract class EmployeMain {
 private String name;
 private int id;
 public EmployeMain(String name, int id) {
 this.name = name;
 this.id = id;
}
 public String getname() {
     return name;
 }
 public int getid() {
   return id;
 }
 public abstract double calculatesalary();
   public String toString() {
     return "Employee=[name=" + name + " id=" + id + " salary=" + 
      calculatesalary() + "]";
 }
}
//childclass---1
 class fulltimeEmploye extends EmployeMain {
   private double montlysalary;
     public fulltimeEmploye(String name, int id, double montlysalary) {
         super(name, id);
           this.montlysalary = montlysalary;
 }
 @Override
 public double calculatesalary() {
     return montlysalary;
 }
 }


 //childclass---2
 class parttimeEmploy extends EmployeMain {
   private int hourWorked;
   private int hourRate;
 public parttimeEmploy(String name,int id,int hourRate,int 
hourWorked){
   super(name,id);
   this.hourRate=hourRate;
   this.hourWorked=hourWorked;
 }
 @Override
 public double calculatesalary() {
   return hourRate*hourWorked;
 }
 }


 //****payroll system***
class payrollsystem {
   private ArrayList<EmployeMain> employeList;
   public payrollsystem() {
     employeList = new ArrayList<>();
   }
 public void addEmploye(EmployeMain employes) {
 employeList.add(employes);
 }
 public void removeEmploye(int id) {
   EmployeMain employeRemovebyId = null;
   for (EmployeMain employee : employeList) {
     if (employee.getid() == id) {
     employeRemovebyId = employee;
      break;
 }
 }
 if (employeRemovebyId != null) {
   employeList.remove(employeRemovebyId);
         }
 }
 public void displayEmployes(){
 for (EmployeMain employe : employeList) {
     System.out.println(employe);
                 }
          }
 }
 
