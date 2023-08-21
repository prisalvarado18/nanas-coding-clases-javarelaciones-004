package practice002;

import java.util.ArrayList;
import practice002.entities.Player;
import practice002.entities.Team;

/*Realiza un programa en donde exista una clase Player que contenga name, lastname, position
                                    y number. Luego otra clase Team que contenga una colección de players. Una vez hecho
                                    esto, desde el main recorreremos el team mostrando la información de cada player.*/
public class Practice002 {

    public static void main(String[] args) {
        Player p1 = new Player("Roberta", "Palacios", 1, 123);
        Player p2 = new Player("Eva", "Diaz", 2, 124);
        Player p3 = new Player("Arturo", "Ruiz", 3, 125);
        
        ArrayList<Player> players = new ArrayList();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        
        Team team = new Team(players);
        
        ArrayList<Player> teamPlayers = team.getPlayers();
        
        for(Player player: teamPlayers){
            System.out.println("Name: " + player.getName());
            System.out.println("Lastname: " + player.getLastname());
            System.out.println("Position: " + player.getPosition());
            System.out.println("Number: " + player.getNumber());
        }
    }
}
