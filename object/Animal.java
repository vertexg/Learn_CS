package object;

class Animal {
  public String name;
  public double weightKg;
  public double heightM;
  public boolean isPredator;
  public double speedKph;
  public double activityMultiplier = 1.2;

  public Animal(String name, double weightKg, double heightM, boolean isPredator, double speedKph) {
    this.name = name;
    this.weightKg = weightKg;
    this.heightM = heightM;
    this.isPredator = isPredator;
    this.speedKph = speedKph;
  }

  public double getBmi() {
    return Math.floor(this.weightKg / Math.pow(this.heightM, 2) * 100) / 100;
  }

  public double getDailyCalories() {
    return Math.floor(70 * Math.pow(this.weightKg, 0.75) * activityMultiplier * 100) / 100;
  }

  public boolean isDangerous() {
    if (isPredator || this.heightM >= 170 || this.speedKph >= 35) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Animal lion = new Animal("Lion", 190, 1.2, true, 80);
    System.out.println(lion.getBmi());
    System.out.println(lion.getDailyCalories());
    System.out.println(lion.isDangerous());

    Animal elephant = new Animal("Elephant", 5000, 3.2, false, 40);
    System.out.println(elephant.getBmi());
    System.out.println(elephant.getDailyCalories());
    System.out.println(elephant.isDangerous());

  }

}
