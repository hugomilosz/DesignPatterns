package Template;

public class TemplateMain {

  public static void main(String[] args) {
    ConcreteClass concreteClass = new ConcreteClass(4);
    int output = concreteClass.templateMethodSubtract(3, 5);
    System.out.println(output);
  }

}
