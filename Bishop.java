
public class Bishop extends Piece {
  // public char[] SYMBOL;
  private int location;
  private boolean whiteOrBlack;

  public Bishop(char[] SYMBOL, int location, boolean whiteOrBlack) {
    super(SYMBOL, location, whiteOrBlack);
    this.SYMBOL[0] = '♗';
    this.SYMBOL[1] = '♝';
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
}