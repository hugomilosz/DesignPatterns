package Template;

public abstract class AbstractClass {

  public int templateMethodSubtract(int first, int second) {
    int newNum = changeInt(first);
    if (newNum > second) {
      return newNum - second;
    }
    return second - newNum;
  }

  public abstract int changeInt(int num);

}
