
public class Rook extends Piece {
  // public char[] SYMBOL;
  private int location;
  private boolean whiteOrBlack;

  public Rook(char[] SYMBOL, int location, boolean whiteOrBlack, int x,int y) {
    super(SYMBOL, location, whiteOrBlack, x ,y);
    this.SYMBOL[0] = '♖';
    this.SYMBOL[1] = '♜';
    this.location = location;
    this.whiteOrBlack = whiteOrBlack;
  }

  public int getLocation() {
    return location;
  }

  public boolean getWhiteOrBlack() {
    return whiteOrBlack;
  }

  public char getSymbol() {
    if (whiteOrBlack)
      return SYMBOL[0];
    else
      return SYMBOL[1];
  }

  public void setLocation(int location) {
    this.location = location;
  }

  public void setWhiteOrBlack(boolean whiteOrBlack) {
    this.whiteOrBlack = whiteOrBlack;
  }

}