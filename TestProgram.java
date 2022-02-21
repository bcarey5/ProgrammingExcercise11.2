package src;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestProgram {

  @Test
  void test() {
    Person person = new Person();
    person.setName("Bryan");
    Assert.assertEquals(person.toString(), "Person : Bryan");
    
    Student student = new Student();
    student.setName("Bryan");
    Assert.assertEquals(student.toString(), "Student : Bryan");
    
    Employee employee = new Employee();
    employee.setName("Bryan");
    Assert.assertEquals(employee.toString(), "Employee : Bryan");
    
    Faculty faculty = new Faculty();
    faculty.setName("Bryan");
    Assert.assertEquals(faculty.toString(), "Faculty : Bryan");
    
    Staff staff = new Staff();
    staff.setName("Bryan");
    Assert.assertEquals(staff.toString(), "Staff : Bryan");

  }

}
