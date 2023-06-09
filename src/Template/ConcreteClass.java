package Template;

public class ConcreteClass extends AbstractClass {

  private final int initNum;

  public ConcreteClass(int initNum) {
    this.initNum = initNum;
  }

  // concrete class overrides the hook method
  @Override
  public int changeInt(int num) {
    return num + 100 - initNum;
  }
}
