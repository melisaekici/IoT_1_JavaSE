package oop;

import jdk.jfr.DataAmount;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

//LOMBOK
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Serializable {      // Serileştirme ekledik

    // Serileştirme
    public static final Long serialVersionUID = 1L;

    // Variable
    private String name;
    private String surname;
    private String address;

    //Metotlar
    public void fullName(){
        System.out.println("Adınız: " + this.name + " Soyadınız: " + this.surname);
    }
}
