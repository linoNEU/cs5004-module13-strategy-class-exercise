package connect;

import java.util.Random;

/**
 * Represents a defensive strategy for playing Connect Four.
 */
public class DefensiveGameStrategy implements GameStrategy {

  private final Random random = new Random();

  @Override public int getNextMove(Player[][] board, Player player) {
    for (int column = 0; column < board[0].length; column++) {
      if (board[0][column] == null && isThreat(board, column)) {
        return column;
      }
    }

    // If no immediate threat is found, make a random move
    int column;
    do {
      column = random.nextInt(board[0].length);
    } while (board[0][column] != null);
    return column;
  }

  /**
   * Checks if there is a threat of the opponent getting four in a row in the specified column.
   *
   * @param board  the current state of the board
   * @param column the column to check
   * @return true if there is a threat, false otherwise
   */
  private boolean isThreat(Player[][] board, int column) {
    // Start at the bottom and, once an empty cell is found, check if the opponent
    // could get four in a row by placing a disc in that column. If so, return true.
    for (int row = board.length - 1; row >= 0; row--) {
      if (board[row][column] == null) {
        board[row][column] = Player.RED;
        if (checkWin(board, row, column)) {
          return true;
        }
        board[row][column] = null;
        break;
      }
    }
    return false;
  }

  /**
   * Checks if there is a win in the current board state.
   *
   * @param board  the current state of the board
   * @param row    the row of the last move
   * @param column the column of the last move
   */
  private boolean checkWin(Player[][] board, int row, int column) {
    Player player = board[row][column];
    return checkDirection(board, row, column, player, 0, 1) // horizontal
        || checkDirection(board, row, column, player, 1, 0) // vertical
        || checkDirection(board, row, column, player, 1, 1) // diagonal up-left to down-right
        || checkDirection(board, row, column, player, -1, 1);  // diagonal down-left to up-right
  }

  /**
   * Checks if there are four in a row in the specified direction.
   *
   * @param board           the current state of the board
   * @param row             the row of the last move
   * @param column          the column of the last move
   * @param player          the player to check for
   * @param rowDirection    the change in row for each step
   * @param columnDirection the change in column for each step
   */
  private boolean checkDirection(Player[][] board, int row, int column, Player player,
      int rowDirection, int columnDirection) {
    int count = 0;
    for (int i = -3; i <= 3; i++) {
      int r = row + i * rowDirection;
      int c = column + i * columnDirection;
      if (r >= 0 && r < board.length && c >= 0 && c < board[0].length) {
        if (board[r][c] == player) {
          count++;
          if (count == 4) {
            return true;
          }
        } else {
          count = 0;
        }
      }
    }
    return false;
  }
}