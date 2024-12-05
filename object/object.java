package object;

//実世界のものには、状態（state）と振る舞い（behavior）という 2 つの特徴があり。例えば、ゴーカートを例にとると、
//ゴーカートは、カート、タイヤ、グライダーのような状態を持ち、アイテムを使う、クラクションを鳴らす、ブレーキをかけるなどの振る舞いを示すことができる。
//オブジェクトが持つデータを「状態」と呼び、オブジェクトの状態は、クラス内で定義されるメンバ変数という変数に保存される。メンバ変数は、クラス内で定義され、メソッドからアクセスできる変数。
//これらの状態は変数に格納され、振る舞いはメソッド（関数）によって定義される。
//1 つ 1 つの車体はオブジェクト指向プログラミングの用語でインスタンスと呼ばれます。また、各インスタンスを作成するために必要な情報をまとめたものをクラス（class）と呼ぶ
//メンバ変数の中でも、クラス内の全てのオブジェクトに対して共通する値を持つ変数はクラス変数（class variable）と呼ばれます。例えば、ゴーカートで言えば、全ての車体に共通するものとしてエンジンが挙げられます。エンジンの種類が異なれば、車体のスピードが変わってしまうので、クラス変数として扱うことになります。
//一方、タイヤやグライダーのように各オブジェクトのインスタンスごとに値が変わるメンバ変数をインスタンス変数（instance variable）と呼びます。

public class object {
  // Java では、メンバ変数
  public static String engine = "Standard Engine";
  public String kart;
  public String tire;
  public String glider;

  // コンストラクタ
  // オブジェクトの初期値のデータ、および状態を作成
  public object(String kart, String tire, String glider) {
    // this キーワードは現在のオブジェクトを取得
    // 状態 = コンストラクタ関数が受け取った値
    this.kart = kart;
    this.tire = tire;
    this.glider = glider;
  }
}

class Main {
  public static void main(String[] args) {
    // new 演算子を用いて、インスタンス化
    object car1 = new object("Standard Kart", "Leaf Tires", "Toy Glider");
    // オブジェクト.変数 でアクセス可能
    System.out.println(car1.kart);
    // クラス変数にアクセスする場合は、クラス名.変数
    System.out.println(object.engine);

    object car2 = new object("Banana Kart", "Wood Tires", "Ghost Wing");
    System.out.println(car2.tire);

    object car3 = new object("Yellow Falcon", "Touring Tires", "Hang Glider");
    System.out.println(car3.glider);
  }
}
