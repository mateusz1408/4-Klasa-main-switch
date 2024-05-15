import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service service = new Service();
      Scanner scanner = new Scanner(System.in);
    while(true){
      System.out.println("Wybierz akcje (1. Dodaj studenta, 2: Wypisz studenta, 3: Dodaj studenta z dodatkowymi danymi, 4: Wyszukaj studenta po nazwisku, 5: Wyłącz program):");
      String funkcja = scanner.nextLine();

      switch(funkcja) {
       case"1":
          System.out.println("Podaj imie studenta:");
        String imie = scanner.nextLine();
          System.out.println("Podaj wiek studenta:");
        int wiek = scanner.nextInt();
          System.out.println("Podaj nazwisko studenta:");
        String nazwisko1 = scanner.nextLine();
          System.out.println("Podaj date urodzenia studenta (DD-MM-YYYY):");
        String datauro = scanner.nextLine();
      service.addStudent(new Student(imie, nazwisko1, wiek, datauro));
      break;
       case"2":
        var students = service.getStudents();
      for(Student student : students){
        System.out.println(student.ToString());
      }
      break;
          case"3":
          System.out.println("Podaj imie:");
          String imie1 = scanner.nextLine();

          System.out.println("Podaj nazwisko");
          String nazwisko = scanner.nextLine();

          System.out.println("Podaj wiek:");
          int wiek1 = scanner.nextInt();
          scanner.nextLine();
          
          System.out.println("Podaj date urodzenia (DD-MM-YYYY):");
          String datauro1 = scanner.nextLine();

          
          service.addStudent(new Student(imie1, nazwisko, wiek1, datauro1));
          break;
      
        case "4":
          System.out.println("Podaj nazwisko studenta:");
          String lastName = scanner.nextLine();
          Student foundStudent = service.findStudentByLastName(lastName);
          if (foundStudent != null) {
              System.out.println("Student znaleziony: " + foundStudent.ToString());
          } else {
              System.out.println("Student nieznaleziony:");
          }
          break;
        case"5":
        System.out.println("Zamykam program");
        System.exit(0);
         
          
      return;
        default:
          System.out.println("Niepoprawna akcja");
          break;
    }

      
    }
    
    }
   catch (IOException e) {

    }
  }
} 