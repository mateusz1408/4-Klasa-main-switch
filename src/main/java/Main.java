import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service service = new Service();
      Scanner scanner = new Scanner(System.in);
    while(true){
      System.out.println("Wybierz akcje (1. Dodaj studenta, 2: Wypisz studenta, 3: Dodaj studenta z dodatkowymi danymi, 4: Wyłącz program):");
      String funkcja = scanner.nextLine();

      switch(funkcja) {
       case"1":
        System.out.println("Podaj imie studenta:");
        String imie = scanner.nextLine();
        System.out.println("Podaj wiek studenta:");
        int wiek = scanner.nextInt();
        scanner.nextLine();
      service.addStudent(new Student(imie, wiek));
      break;
       case"2":
        var students = service.getStudents();
      for(Student student : students){
        System.out.println(student.ToString());
      }
      break;
        case"4":
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