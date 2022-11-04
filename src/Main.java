import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setFullName("Shabdanov Ilim");
        student.setPhoneNumber(730547843);
        student.setAddress("alamedin");
        student.setBankAccount(63000);

        Student student1 = new Student();
        student1.setFullName("Djoldoshev Nuradil");
        student1.setPhoneNumber(779784309);
        student1.setAddress("alamedin");
        student1.setBankAccount(52000);

        Student student2 = new Student();
        student2.setFullName("Akbaraliev Dastan");
        student2.setPhoneNumber(773402201);
        student2.setAddress("alamedin");
        student2.setBankAccount(35000);

        Student student3 = new Student();
        student3.setFullName("Abdymomunov Sanjar");
        student3.setPhoneNumber(777665850);
        student3.setAddress("vostok-5");
        student3.setBankAccount(38000);

        Student student4 = new Student();
        student4.setFullName("Kenjebekov Baiel");
        student4.setPhoneNumber(999978431);
        student4.setAddress("vostok-5");
        student4.setBankAccount(44000);

        Student student5 = new Student();
        student5.setFullName("Nursultanov Argen");
        student5.setPhoneNumber(723784307);
        student5.setAddress("vostok-5");
        student5.setBankAccount(60000);

        /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~**/

        Apartment apartment = new Apartment();
        apartment.setTitle("Ihlas");
        apartment.setPrice(18000);
        apartment.setAddress("alamedin");

        Apartment apartment1 = new Apartment();
        apartment1.setTitle("Avangard");
        apartment1.setPrice(15000);
        apartment1.setAddress("vostok-5");

        /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~**/

        Student[] arrayStudent = {student, student1, student2, student3, student4, student5};
        Apartment[] arrayApartment = {apartment, apartment1};



        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Enter number");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                System.out.print(" Write the name of the apartment : ");
                methodStudentAppartment(scanner.nextLine(), arrayStudent, arrayApartment);
            } else if (input == 2) {
                System.out.println(" Which house's rent ");
                String name = new Scanner(System.in).nextLine();
                if (name.equals("Ihlas"))
                    System.out.println(apartment.payPerMonth(arrayStudent));
                else if (name.equals("Avangard"))
                    System.out.println(apartment1.payPerMonth(arrayStudent));
            } else if (input == 3) {
                System.out.println(" Chek student bankAccount");
                for (Student stud : arrayStudent) {
                    if (stud.getFullName().equals(scanner.nextLine())) {
                        stud.livein(arrayApartment, arrayStudent);
                        break;
                    }
                }
            } else if (input == 4) {
                System.out.println(" Replace student ");
                for (Student stud : arrayStudent) {
                    if (stud.getFullName().equals(scanner.nextLine())) stud.changeInfo(); break;
                }
            } else {
                System.out.println("Error");
                break;
            }
        }

    }

    public static void methodStudentAppartment(String title, Student[] arrayStudent, Apartment[] arrayApartment) {
        for (Apartment apartment : arrayApartment) {
            if (Objects.equals(apartment.getTitle().toUpperCase(), title.toUpperCase())) {
                apartment.getInfo();
                System.out.println();
            }
        }
        for (Student student : arrayStudent) {
            for (Apartment apartment : arrayApartment) {
                if (Objects.equals(apartment.getTitle().toUpperCase(), title.toUpperCase()) &&
                        Objects.equals(apartment.getAddress().toLowerCase(), student.getAddress().toLowerCase())) {
                    student.getInfo();
                    System.out.println();
                }
            }
        }
    }
}