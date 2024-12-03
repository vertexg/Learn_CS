package controlFlow;

// 関数、式がどのような順序で評価されるかには一定のルールが存在。これらのルールは制御フロー（control flow）と呼ばれる
public class controlFlow {
  public static String monsterAttack(String monster) {
    int attack = 1000;
    String message = "'s attack is:";

    if (monster == "Cyclops") {
      attack *= 1.8;
      message = "Cyclops" + message + attack;
    } else if (monster == "Ogre") {
      attack *= 2.5;
      message = "Ogre" + message + attack;
    } else if (monster == "Zombie") {
      attack *= 1.2;
      message = "Zombie" + message + attack;
    } else {
      message = "Monster does not exist.";
    }

    return message;
  }

  public static void main(String[] args) {
    System.out.println(monsterAttack("Ogre"));
    System.out.println(monsterAttack("Ghost"));
  }
}
