package src;

public class Employee extends Person {
  private String office;
  private double salary;
  private MyDate dateHired;

  public Employee() {
    super();
    office = "";
    salary = 0.0;
    dateHired = new MyDate();
  }

  public Employee(String office, double salary, MyDate dateHired) {
    super();
    this.office = office;
    this.salary = salary;
    this.dateHired = dateHired;
  }

  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public MyDate getDateHired() {
    return dateHired;
  }

  @Override
  public String toString() {
    return "Employee : " + getName();
  }
}
