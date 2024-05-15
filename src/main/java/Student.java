public class Student {

  private String FirstName;
  private String LastName;
  private int Age;

  public Student(String firstName, String lastName, int age) {
    FirstName = firstName;
    Age = age;
    LastName = lastName;
  }
  
  public String ToString() {
           return FirstName + " " + LastName + " " + Age;
    }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) {
      return new Student("Parse Error", "Parse Error", -1);
    }
      return new Student(data[0], data[1], Integer.parseInt(data[2]));

  }
}