package src;

public class Faculty extends Employee {
  private String officeHours;
  private String rank;

  public Faculty() {
    super();
    officeHours = "";
    rank = "";
  }

  public Faculty(String officeHours, String rank) {
    super();
    this.officeHours = officeHours;
    this.rank = rank;
  }

  public String getOfficeHours() {
    return officeHours;
  }

  public void setOfficeHours(String officeHours) {
    this.officeHours = officeHours;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  @Override
  public String toString() {
    return "Faculty : " + getName();
  }

}
