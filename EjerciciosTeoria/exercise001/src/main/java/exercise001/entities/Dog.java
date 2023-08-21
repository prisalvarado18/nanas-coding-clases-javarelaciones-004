package exercise001.entities;
/* Perro, que tendrá como atributos: nombre, raza, edad y tamaño*/
public class Dog {
    private String name;
    private String breed;
    private Float size;

    public Dog(String name, String breed, Float size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + ", size=" + size + '}';
    }
}
