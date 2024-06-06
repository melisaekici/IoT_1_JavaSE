package oop;

public class MainObject {

    public static void main(String[] args) {
        // Parametresiz Student Instance (Constructor)
        Student student1 = new Student();
        student1.setName("Melisa");
        student1.setSurname("Ekici");
        student1.fullName();
        System.out.println("Name : " + student1);

        System.out.println("****************************************");

        // Parametreli Student Instance
        Student student2 = new Student("name1" , "surname1" , "address1");
        student2.fullName();
        System.out.println(student2);

        System.out.println("****************************************");

        // Parametreli Student Instance
        Student student3 = new Student("name2" , "surname2");
        student2.fullName();
        System.out.println(student3);

        System.out.println("***************************************");
        // Parametreli Teacher Instance
        Teacher teacher= new Teacher("Teachername1","Teachersurname1","Teacheraddress1");
        teacher.fullName();
        System.out.println(teacher);
    }
}
