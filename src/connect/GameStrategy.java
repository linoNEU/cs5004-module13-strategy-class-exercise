package connect;

/**
 * Represents a strategy for playing Connect Four.
 */
public interface GameStrategy {

    /**
    * Get the next move for the given player.
    *
    * @param board the current state of the board
    * @param player the player whose turn it is
    * @return the column where the player wants to drop a disc
    */
    int getNextMove(Player[][] board, Player player);
}
