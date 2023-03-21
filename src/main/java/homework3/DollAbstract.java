package main.java.homework3;

public abstract class DollAbstract {
  protected String type;
  private boolean isLimited = false;
  private boolean isExpensive = false;

  public abstract void madeToMove();
  public abstract void justStay();

  protected boolean isExpensive() {
     return isExpensive;
  }

  protected void setIsExpensive(boolean isExpensive) {
    this.isExpensive = isExpensive;
  }

  protected boolean isLimited() {
    return isLimited;
  }

  public void setIsLimited(boolean isLimited) {
    this.isLimited = isLimited;
  }
}
