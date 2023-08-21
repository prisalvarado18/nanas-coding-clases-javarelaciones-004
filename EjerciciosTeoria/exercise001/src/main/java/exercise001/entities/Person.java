package exercise001.entities;
/*y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.*/
public class Person {
    private String name;
    private String lastname;
    private int age;
    private int dni;
    private Dog dog;

    public Person(String name, String lastname, int age, int dni, Dog dog) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.dni = dni;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastname=" + lastname + ", age=" + age + ", dni=" + dni + ", dog=" + dog + '}';
    }
}
