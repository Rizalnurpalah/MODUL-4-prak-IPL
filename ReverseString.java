/**
 * @(#)ReverseString.java
 *
 *
 * @author m Rizal Nurpalah_DSE B_3411191048
 * @version 1.00 2021/11/8
 */


import java.util.*;
public class ReverseString {
  public static void main(String args[]) {
    String huruf, hasil = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan sebuah string: ");
    huruf = scanner.nextLine();
    int jumlah = huruf.length();
    int jumlahHuruf = jumlah - 1;
    for (int i = 0; i < jumlah; i++) {
      hasil = hasil + huruf.charAt(jumlahHuruf);
      jumlahHuruf--;
    }
    System.out.println("Hasil reverse string: " + hasil);
  }
}