package src;

public class Student extends Person {
  public static final String FRESHMAN = "Freshman";
  public static final String SOPHMORE = "Sophmore";
  public static final String JUNIOR = "Junior";
  public static final String SENIOR = "Senior";
  private String status;

  public Student() {
    super();
    status = FRESHMAN;
  }

  public Student(String status) {
    super();
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Student : " + getName();
  }
}
