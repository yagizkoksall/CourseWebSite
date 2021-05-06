package HomeWork3;

public class StudentManager {

            public void informationOfStudents(Student student){

                System.out.println("Öğrencinin adı soyadı : " + student.getFirstName() + " "+ student.getLastName());
                System.out.println("Öğrencinin bildiği diller : " + student.getLanguages());
                System.out.println("Öğrencinin eğitim seviyesi : " + student.getEducationStatus() + "\n ---------------------------------------");

            }

}
