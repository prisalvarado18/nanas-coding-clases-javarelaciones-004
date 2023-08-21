package practice001;

import practice001.entities.Dni;
import practice001.entities.Person;

/*Realiza un programa en donde una clase Person tenga como atributo name, surname y un
                    objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
                    acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.*/
public class Practice001 {

    public static void main(String[] args) {
        Dni dniMiriam = new Dni('A', 123);
        Person miriam = new Person("Miriam", "Solís", dniMiriam);
        
        System.out.println("Nomre: " + miriam.getName());
        System.out.println("Apellido: " + miriam.getSurname());
        System.out.println("Serie DNI: " + miriam.getDni().getSeries());
        System.out.println("Número DNI: " + miriam.getDni().getNumber());
    }
}
