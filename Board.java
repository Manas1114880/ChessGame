
import java.util.*;

public class Board {

  private String[][] board;
  private int num;
  private ArrayList<Piece> pieceGroup;

  public Board(int num, ArrayList<Piece> pieceGroup) {
    this.num = num;
    this.pieceGroup = pieceGroup;
    board = new String[num][num];
    draw();
  }

  public void draw() {

    for (int i = 0; i <= board.length - 1; i++) {
      System.out.println();
      for (int j = 0; j < board[i].length; j++) {
        System.out.print("[]");
      }
    }
  }

  String[][] getBoard() {
    return this.board;
  }
}