package MentorinDersler.SemaHoca.Encapsulation._1_Student;

public class studedntMain {
    public static void main(String[] args) {
        Student student1=new Student();
        //set student
        student1.setStudentRoll(1);
        student1.setStudentName("Suzanna");
        student1.setStudentAge(15);
        //display
        System.out.println("ogrencinin kayit numarasi:"+student1.getStudentRoll());
        System.out.println("ogrencinin adi:"+student1.getStudentName());
        System.out.println("ogrencinin yasi:"+student1.getStudentAge());


    }
}
