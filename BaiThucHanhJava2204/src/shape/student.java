package shape;

import java.util.Scanner;

public class student extends person {
    public float Truong;
    public float Lop;

    public void nhapTruong() {
        System.out.println("Nhap truong: ");
        Scanner sc = new Scanner(System.in); {
            sc.close();
            Truong = sc.nextFloat();
        }
    }

    public void nhapLop() {
        System.out.println("Nhap lop: ");
        Scanner sc = new Scanner(System.in); {
            sc.close();
            Lop = sc.nextFloat();
        }
    }

    public void inThongTin() {
        System.out.println("Truong: " + Truong);
        System.out.println("Lop: " + Lop);

    }

}
 