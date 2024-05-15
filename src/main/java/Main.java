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
          String nazwisko1 = scanner.nextLine();
           System.out.println("Podaj nazwisko studenta:");
        scanner.nextLine();
      service.addStudent(new Student(imie, nazwisko1, wiek));
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

          String nazwa = imie1 + " " + nazwisko;
          service.addStudent(new Student(imie1, nazwisko, wiek1));
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