package exercise002.entities;

import java.util.ArrayList;

/*Clase Game: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver*/
 /*Métodos:
• fillGame(ArrayList<Player>players, WaterGun g): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• round(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class Game {

    private ArrayList<Player> players;
    private WaterGun gun;

    public Game(ArrayList<Player> players) {
        this.players = players;
        gun = new WaterGun();
    }

    public void fillGame(ArrayList<Player> players, WaterGun gun) {
        this.players = players;
        this.gun = gun;
    }

    public void round() {
        int currentPlayer = 0;
        while (true) {
            Player player = players.get(currentPlayer);
            if (player.waterShot(gun)) {
                System.out.println("Game over! " + player.getName() + " got wet.");
                break;
            }
            currentPlayer = (currentPlayer + 1) % players.size();
        }
    }
}
