
class Piece {
  /////////////////
  // ATRRIBUTES

  public final char[]   SYMBOL;
  private      int      location;
  private      boolean  whiteOrBlack;

  //Constructor
  Piece(char[] SYMBOL, int location, boolean whiteOrBlack){
    this.SYMBOL = SYMBOL;
    this.location = location;
    this.whiteOrBlack = whiteOrBlack;
  }

  public char getSymbol(){
    if(whiteOrBlack)
      return SYMBOL[0];
    else
      return SYMBOL[1];
  }

  public void setLocation(int location){
    this.location = location;
  }
  public int getLocation(){
    return location;
  }

  public void setWhiteOrBlack(boolean whiteOrBlack){
    this.whiteOrBlack = whiteOrBlack;
  }
  public boolean getWhiteOrBlack(){
    return whiteOrBlack;
  }
  
}