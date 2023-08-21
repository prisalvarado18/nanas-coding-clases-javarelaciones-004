package exercise001;

import exercise001.entities.Dog;
import exercise001.entities.Person;

/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/
public class Exercise001 {

    public static void main(String[] args) {
        Dog d1 = new Dog("Manchas", "Labrador", (float) 1.20);
        Dog d2 = new Dog("Max", "Akita", (float) 1.50);

        Person p1 = new Person("Ines", "Mini", 61, 123, d1);
        Person p2 = new Person("Beto", "Alv", 62, 124, d2);

        System.out.println(p1);
        System.out.println(p2);
    }
}
