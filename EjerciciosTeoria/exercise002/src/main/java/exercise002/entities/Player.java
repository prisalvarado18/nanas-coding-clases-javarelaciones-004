package exercise002.entities;

/*Clase Player: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.*/

 /*Métodos:
• waterShot(WaterGun w): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador*/
public class Player {

    private int id;
    private String name;
    private boolean dunked;

    public Player(int id) {
        this.id = id;
        this.name = "Gamer Nro. " + id;
        this.dunked = false;
    }

    public boolean waterShot(WaterGun gun) {
        System.out.println(name + " is aimed with the water gun.");
        gun.nextStream();
        if (gun.dunk()) {
            dunked = true;
            System.out.println(name + " got wet!");
            return true;
        } else {
            System.out.println("Click! " + name + " is safe.");
            return false;
        }
    }
    
    public boolean isDunked(){
        return dunked;
    }
    
    public String getName(){
        return name;
    }
}
