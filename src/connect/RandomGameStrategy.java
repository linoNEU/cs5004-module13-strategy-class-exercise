package connect;

import java.util.Random;

/**
 * Represents a random strategy for playing Connect Four.
 */
public class RandomGameStrategy implements GameStrategy {

    private final Random random = new Random();

    @Override
    public int getNextMove(Player[][] board, Player player) {
        int column;
        do {
            column = random.nextInt(board[0].length);
        } while (board[0][column] != null); // Keep generating random numbers until we find an empty column
        return column;
    }
}