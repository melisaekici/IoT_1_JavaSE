package oop;

    /*
    Access Modifier
    1. public: bonkör
    2. private: yalnızca kendi alanında çalışır (cimri) -> encapsulation işlemi yaparız
    3. protected
     */

    // POJO: Plain Old Java Object: variable + Getter_and_Setter
    // BEAN: POJO + constructor
    // @Override

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {      // Serileştirme ekledik

    // Serileştirme (veriyi başka yere taşıdığımızda doğru bir şekilde yapsın??)
    // veri parçalanmasın eksik gelmesin vsvs
    public static final Long serialVersionUID = 1L;

    // Variable
    private String name;
    private String surname;
    private String address;


    /* Kurucu Metotlar (Parametreli Parametresiz)

    1. Kurucu metottur
    2. class ismiyle aynı yazılır
    3. return yapamazsınız
    4. private Student(){} => burada instance oluşturamazsınız.
    5. overloading yapabilirsiniz
     */
    // Parametresiz Constructor
    // this: Global Variable erişmek içindir.
    public Student(){       // (parametresiz constructor yapısı)
        this.name = "adınızı girmediniz";
        this.surname = "adınızı girmediniz";
        this.address = "-------";
    }

    // Parametreli Constructor
    // sağ tık + generate + constructor + ctrl (çoklu seçim)

    public Student(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
            //overloading
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    //toString (sağ tık + generate + toString)
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //equals - HashCode (classa ait parmak izi?)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address);
    }
    //Metotlar
    public void fullName(){
        System.out.println("Adınız: " + this.name + " Soyadınız: " + this.surname);
    }

    // DATA CALLING
     //GETTER AND SETTER (dış dünyada kullanılacaksa yazılmak zorundadır yoksa erişim sağlanamaz)(get getirir setter değiştirir)
        // Alt+Ins ya da sağ tık+Generate+GetterSetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}   // end class


