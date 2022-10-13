
public class King extends Piece {

  private int location;
  private boolean whiteOrBlack;
  private int x;
  private int y;

  public King(char[] SYMBOL, int location, boolean whiteOrBlack, int x, int y) {
    super(SYMBOL, location, whiteOrBlack, x, y);
    this.SYMBOL[0] = '♔';
    this.SYMBOL[1] = '♚';
    this.location = location;
    this.whiteOrBlack = whiteOrBlack;
    this.x = x;
    this.y = y;
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

  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }

}