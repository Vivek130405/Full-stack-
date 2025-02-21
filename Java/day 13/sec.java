import java.util.Scanner;

class Innersec {
  private int size;
  private int[] arr;

  public void setarr(int[] arr) {
    this.arr = arr;
  }

  public int[] getarr() {
    return this.arr;
  }

  public void setsize(int size) {
    this.size = size;
  }

  public int getsize() {
    return this.size;
  }

  public void init(int size) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    setarr(arr);
  }

  public void display() {
    for (int i = 0; i < arr.length; i++) {
      System.out.print("|" + arr[i] + "|");
    }
  }

}

public class sec {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Innersec s = new Innersec();
    s.setsize(sc.nextInt());
    s.init(s.getsize());
    s.display();
  }
}
