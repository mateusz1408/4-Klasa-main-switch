public class Student {

  private String FirstName;
  private String LastName;
  private int Age;
  private String Datauro;

  public Student(String firstName, String lastName, int age,String datauro) {
    FirstName = firstName;
    Age = age;
    LastName = lastName;
    Datauro = datauro;
  }
  
  public String ToString() {
           return FirstName + " " + LastName + " " + Age + " " + Datauro;
    }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) {
      return new Student("Parse Error", "Parse Error", -1, "Parse Error");
    }
      return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);

  }
}