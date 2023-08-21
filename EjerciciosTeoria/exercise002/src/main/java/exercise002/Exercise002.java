package exercise002;

import exercise002.entities.Game;
import exercise002.entities.Player;
import exercise002.entities.WaterGun;
import java.util.ArrayList;

public class Exercise002 {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList();

        int amountPlayers = 6;

        for (int i = 1; i <= amountPlayers; i++) {
            players.add(new Player(i));
        }

        Game game = new Game(players);
        game.fillGame(players, new WaterGun());

        game.round();
    }
}
