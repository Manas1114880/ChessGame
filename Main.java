
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
    int whitePawnPlacment = 0;
    int blackPawnPlacment = 0;

    Piece pawnWhite = new Pawn(symbolList, 1, true, whitePawnPlacment, 1);
    for (int i = 0; i < 8; i++) {
      whitePawnPlacment++;
      pieceGroup.add(pawnWhite);
    }

    System.out.println();

    Piece pawnBlack = new Pawn(symbolList, 8, false, blackPawnPlacment, 7);
    for (int i = 0; i < 8; i++) {
      blackPawnPlacment++;
      pieceGroup.add(pawnBlack);
    }
    System.out.println();

    Board board = new Board(8, pieceGroup);
    for (int i = 0; i <= board.getBoard().length - 1; i++) {
      for (int j = 0; j < board.getBoard()[i].length; j++) {
          //board.getBoard()[i][j] = pieceGroup.get(i);
//What I am doing; 2d array to draw the board
      }
    } 
  }
}
