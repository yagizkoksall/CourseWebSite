package HomeWork3;


public class InstructorManager {

    public void informationOfInstructor(Instructor instructor) {
        System.out.println("Eğitmenin adı soyadı :  " + instructor.getFirstName()+ " " + instructor.getLastName());
        System.out.println("Eğitmenin uyruğu : " + instructor.getNationality());
        System.out.println("Eğitmenin özgeçmişi : " + instructor.getProfile() + "\n -------------------------------------------");
    }
}
