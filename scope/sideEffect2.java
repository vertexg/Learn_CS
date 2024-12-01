package scope;

public class sideEffect2 {
  // 値渡し 値渡しは、変数の値をコピーして渡すことを指す 値渡しは、関数内で引数の値を変更しても、元の変数の値は変わらない
  // 参照渡し 参照渡しは、変数の値ではなく、変数のメモリアドレスを渡すことを指す 参照渡しは、関数内で引数の値を変更すると、元の変数の値も変わる
  // 副作用が発生するため注意

  // 値渡しの例

  public static String message(String inputMessage) {
    inputMessage = inputMessage + " - is the message.";
    return inputMessage;
  }

  public static void main(String[] args) {
    String subject = "It will rain tomorrow";
    System.out.println(subject);// "It will rain tomorrow"

    // subject を値として渡します
    // subject の中のデータは message の仮引数にコピーされます
    // 出力は newMessage に格納されます
    String newMessage = message(subject);

    System.out.println(subject); // "It will rain tomorrow"
    System.out.println(newMessage); // "It will rain tomorrow - is the message."

  }
  // 静的、スタック、ヒープメモリ
  // メモリ割り当て（memoryallocation）とは、変数、データ構造、クラスインスタンスなどの値を格納するために、メモリ上の特定の領域を確保するプロセス。
  // これにより、プログラムは必要に応じてこれらの値にアクセスし、操作することができるようになり、プログラムを実行する上で重要な役割を担っています。一般的にメモリ割り当てには、以下の
  // 3 つの方法

  // 静的メモリ割り当て（static memory allocation）
  // プログラムが実行される前であるコンパイル時に行われます。割り当てられるサイズは固定されており、静的に割り当てされた変数はプログラムの開始から終了まで存続

  // 静的メモリ割り当て（stack memory allocation）

  // class StaticMemoryClass{
  // public static final double PI = 3.14159265359;
  // }
  // class Main{
  // public static void main(String[] args){
  // System.out.println(StaticMemoryClass.PI);
  // }
  // }

  // スタックメモリ割り当て（stack memory allocation）は、コンピュータが関数を呼び出すたびに新しいメモリスペースを確保する方法
  // このメモリスペースは、コールスタックと呼ばれる場所に一時的に保存。このメモリスペースには、関数で使用する変数のデータが格納される。

  // スタックオーバーフロー
  // class Main{
  // public static double getPi(){
  // // ローカル変数
  // double pi = 3.14159265359;
  // // この関数がスタックからポップされると、変数 pi は存在しなくなります。
  // return pi;
  // }

  // public static void main(String[] args){
  // // 関数はプログラム中に呼び出されると、オペレーティングシステムによって関数自身に関する情報をコールスタックと呼ばれる領域に一時的に格納されます
  // System.out.println(getPi());
  // }
  // }

  // 関数の呼び出しの際、メモリが消費されるため、永遠に関数に呼び続けることは不可 スタックの保持上限を超えるとスタックオーバーフローという現象が発生

  // スタックメモリが自動的に割り当てられるメモリ領域であるのに対し、ヒープメモリはプログラマーが明示的に割り当てることのできるメモリ領域。ヒープ割り当ては動的に実行されるので、動的メモリ割り当て
  // （dynamic memory allocation） とも呼ばれる
}
