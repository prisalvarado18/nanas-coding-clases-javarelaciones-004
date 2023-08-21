package exercise002.entities;

import java.util.Random;

/*Esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.*/

 /*Métodos:
• fillGun(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• dunk(): devuelve true si la posición del agua coincide con la posición actual
• nextStream(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)*/
public class WaterGun {

    private int currentPosition;
    private int waterPosition;
    
    public WaterGun(){
        fillGun();
    }

    public void fillGun() {
        Random random = new Random();
        currentPosition = random.nextInt(6);
        waterPosition = random.nextInt(6);
    }

    public boolean dunk() {
        return currentPosition == waterPosition;
    }

    public void nextStream() {
        currentPosition = (currentPosition + 1) % 6;
    }

    @Override
    public String toString() {
        return "WaterGun{" + "currentPosition=" + currentPosition + ", waterPosition=" + waterPosition + '}';
    }
}
