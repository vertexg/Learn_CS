package object;

class RGB {
  public String hexStr = "0123456789abcdef";
  public int red;
  public int green;
  public int blue;

  public RGB(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public String getHexCode() {
    String res = "";
    res += hexStr.charAt(this.red / 16);
    res += hexStr.charAt(this.red % 16);

    res += hexStr.charAt(this.green / 16);
    res += hexStr.charAt(this.green % 16);

    res += hexStr.charAt(this.blue / 16);
    res += hexStr.charAt(this.blue % 16);

    return "#" + res;
  }

  public int hexToDecimal() {
    String hex = getHexCode().substring(1);
    int decimal = Integer.parseInt(hex, 16); // 16進数を10進数に変換
    return decimal; // 10進数を返す
  }

  public String getBits() {
    return Integer.toBinaryString(hexToDecimal());
  }

  String getColorShade() {
    if (this.red == this.green && this.red == this.blue) {
      return "grayscale";
    } else if (this.red >= this.green && this.red >= this.blue) {
      return "red";
    } else if (this.green >= this.red && this.green >= this.blue) {
      return "green";
    } else {
      return "blue";
    }
  }

  public static void main(String[] args) {
    RGB color1 = new RGB(0, 153, 255);
    System.out.println(color1.getHexCode()); // #0099ff
    System.out.println(color1.getBits()); // 1001100111111111
    System.out.println(color1.getColorShade()); // blue

    RGB color2 = new RGB(255, 255, 204);
    System.out.println(color2.getHexCode()); // #ffffcc
    System.out.println(color2.getBits()); // 111111111111111111001100
    System.out.println(color2.getColorShade()); // red

    RGB color3 = new RGB(0, 87, 0);
    System.out.println(color3.getHexCode()); // #005700
    System.out.println(color3.getBits()); // 101011100000000
    System.out.println(color3.getColorShade()); // green

    RGB gray = new RGB(123, 123, 123);
    System.out.println(gray.getHexCode()); // #7b7b7b
    System.out.println(gray.getBits()); // 11110110111101101111011
    System.out.println(gray.getColorShade()); // grayscale
  }

}
