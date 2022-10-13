
import java.util.*;

public class Board {
  // This is where the properties go
  private Piece[][] board;
  private int num;
  private ArrayList<Piece> pieceGroup;

  // Constructor
  public Board(int num, ArrayList<Piece> pieceGroup) {
    this.num = num;
    this.pieceGroup = pieceGroup;
    board = new Piece[num][num];
    draw();// Draws board
  }

  // Getters and Setters should go here

  public void draw() {
    System.out.print(pieceGroup);
    for (int i = 0; i <= board.length - 1; i++) {
      System.out.println();
      for (int j = 0; j <= board[i].length ; j++) {
        // Iterating the piecesGroup
        checkPiecePos(i, j);
        // Prints white or black pawn according to which row it is
      }
    }
  }

  public void checkPiecePos(int i, int j) {
    for (int k = 0; k < pieceGroup.size(); k++) {
      Piece piece = pieceGroup.get(k);
      if (i == piece.getX() && j == piece.getY()) {
        System.out.print("[" + piece.getSymbol() + "]");
      } else {
        System.out.print("[-]");
      }
    }
  }

  Piece[][] getBoard() {
    return this.board;
  }
}