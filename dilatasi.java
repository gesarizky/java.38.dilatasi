
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class dilatasi {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ********************************* ");

        System.out.println(" *Masukkan Nilai X ");
        System.out.println(" ********************************* ");

        double x = sc.nextInt();

        System.out.println(" ******************************* ");
        System.out.println(" *Masukkan Nilai Y ");
        System.out.println(" ******************************* ");

        double y = sc.nextInt();

        System.out.println(" ***************Dilatasi********** ");
        System.out.println(" *Masukkan Nilai Skala (k) : ");
        System.out.println(" ********************************* ");

        double k = sc.nextInt();

        double x1 = x * k;
        double y1 = y * k;

        System.out.println(" ******************************* ");
        System.out.println(" *Maka Hasil Pencerminan A'(X'Y')** ");
        System.out.println(" *Nilai X' = " + x1);
        System.out.println(" *Nilai Y' = " + y1);
        System.out.println(" ******************************* ");
    }
}
