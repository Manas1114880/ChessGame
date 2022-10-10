
import java.util.*;

//Manas Kumar
//Chess
//Advanced Topics
//9/6/2022
/* Links: 

https://unicode-table.com/en/sets/chess-symbols/ 
https://www.youtube.com/watch?v=wZoY2Mg557s



https://www.youtube.com/watch?v=0zjC6Axn9Ww
*/

class Main {
  public static void main(String[] args) {

    char[] symbolList = new char[2];
    ArrayList<Piece> pieceGroup = new ArrayList();
    Scanner scan = new Scanner(System.in);

    Piece pawnWhite = new Pawn(symbolList, 1, true);
    for (int i = 0; i < 8; i++) {
      System.out.print(pawnWhite.getSymbol());
      pieceGroup.add(pawnWhite);
    }

    System.out.println();
    Piece pawnBlack = new Pawn(symbolList, 8, false);
    for (int i = 0; i < 8; i++) {
      System.out.print(pawnBlack.getSymbol());
      pieceGroup.add(pawnBlack);
    }
    System.out.println();
    System.out.print(pieceGroup);

    Board board = new Board(8, pieceGroup);
    for (int i = 0; i <= board.getBoard().length - 1; i++) {
      for (int j = 0; j < board.getBoard()[i].length; j++) {
          System.out.print(pieceGroup.get(i));
      }
    }
  }
}
