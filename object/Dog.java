package object;

class Dog {
  public String name;
  public int size;
  public int age;

  public Dog(String name, int size, int age) {
    this.name = name;
    this.size = size;
    this.age = age;
  }

  public String bark() {
    if (this.size >= 50) {
      return "Wooof! Woof!";
    } else if (this.size >= 20) {
      return "Ruff! Ruff!";
    } else {
      return "Yip! Yip!";
    }
  }

  public int calcHumanAge() {
    return 12 + (this.age - 1) * 7;
  }

  public static void main(String[] args) {
    Dog goldenRetriever = new Dog("Golden Retriever", 60, 10);
    System.out.println(goldenRetriever.bark());
    System.out.println(goldenRetriever.calcHumanAge());

    Dog siberianHusky = new Dog("Siberian Husky", 55, 6);
    System.out.println(siberianHusky.bark());
    System.out.println(siberianHusky.calcHumanAge());

    Dog poodle = new Dog("Poodle", 10, 1);
    System.out.println(poodle.bark());
    System.out.println(poodle.calcHumanAge());

    Dog shibaInu = new Dog("Shiba Inu", 35, 4);
    System.out.println(shibaInu.bark());
    System.out.println(shibaInu.calcHumanAge());
  }
}
