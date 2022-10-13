
class Piece {
  /////////////////
  // ATRRIBUTES

  public final char[] SYMBOL;
  private int location;
  private boolean whiteOrBlack;
  private int x;
  private int y;

  // Constructor
  Piece(char[] SYMBOL, int location, boolean whiteOrBlack, int x , int y) {
    this.SYMBOL = SYMBOL;
    this.location = location;
    this.whiteOrBlack = whiteOrBlack;
    this.x = x;
    this.y = y;
    
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

  public int getLocation() {
    return location;
  }

  public void setWhiteOrBlack(boolean whiteOrBlack) {
    this.whiteOrBlack = whiteOrBlack;
  }

  public boolean getWhiteOrBlack() {
    return whiteOrBlack;
  }

  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }

}