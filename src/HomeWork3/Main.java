package HomeWork3;

public class Main {

    public static void main(String[] args) {

        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("DEMİROĞ");
        instructor.setNationality("TÜRK");
        instructor.setProfile("4 dil biliyor, savunma bakanlığına proje geliştiriyor , akademisyen");
        Instructor instructor1 = new Instructor();
        instructor1.setFirstName("İsmail");
        instructor1.setLastName("AKGÜL");
        instructor1.setNationality("TÜRK");
        instructor1.setProfile("4 dil biliyor, Erzincan Binali Yıldırım Üniversitesinde Akademisyen");


        Student student = new Student();
        student.setFirstName("Yağız");
        student.setLastName("KÖKSAL");
        student.setEducationStatus("Üniversite okuyor");
        student.setLanguages("Türkçe, İngilizce");

        Student student1 = new Student();
        student1.setFirstName("Aleyna");
        student1.setLastName("ERTOK");
        student1.setEducationStatus("Üniversite okuyor");
        student1.setLanguages("Türkçe,İngilizce,Almanca,Rusça");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.informationOfInstructor(instructor);
        instructorManager.informationOfInstructor(instructor1);

        StudentManager studentManager = new StudentManager();
        studentManager.informationOfStudents(student);
        studentManager.informationOfStudents(student1);

        UserManager userManager = new UserManager();
        userManager.registrationLog(instructor);
        userManager.registrationLog(instructor1);
        userManager.registrationLog(student);
        userManager.registrationLog(student1);

    }
}
