import connect.ConnectFourModel;
import connect.ConnectFourModelImpl;
import connect.DefensiveGameStrategy;

/**
 * Driver class for the Connect 4 game. The game can switch between different strategies for the
 * Yellow player.
 */
public class Main {
  /**
   * Run an example of a Connect 4 game. Usual board size is Rows = 6, Columns = 7.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    ConnectFourModel model = new ConnectFourModelImpl(6, 7);

    // The Default strategy is RandomGameStrategy.
    // We check that the game is working as expected.
    // TODO: Test the game with the RandomGameStrategy.

    // We now switch strategy to DefensiveGameStrategy.
    // We check that the game is working as expected.
    // TODO: Switch the strategy to DefensiveGameStrategy.
    // TODO: Test the game with the DefensiveGameStrategy.

  }

}
