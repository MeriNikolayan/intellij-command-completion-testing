public class Main {

  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }

  public void renamedMethod() {
    int a = 1;
    int b = 2;
    extracted1(a, b);
  }

  private void extracted1(int a, int b) {
    int c = a + b;
    int d = a + c;
  }

  public void processNumbers() {
    extracted();
  }

  private void extracted() {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

public class Country {
  private String capital;
  private int population;

  @Override
  public String toString() {
    return "Country{" +
            "capital='" + capital + '\'' +
            ", population=" + population +
            '}';
  }
}