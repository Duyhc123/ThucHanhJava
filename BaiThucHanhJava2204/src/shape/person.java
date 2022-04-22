package shape;

import java.util.Scanner;

public class person {
    public float Ten;
    public float Tuoi;

    public void nhapTen() {
        System.out.println("Nhap vao ho va ten: ");
        Scanner sc = new Scanner(System.in); {
            sc.close();
            Ten = sc.nextFloat();
        }
    }

    public void inTen() {
        System.out.println("Ho va ten: " + Ten);
    }

    public void inTuoi() {
        System.out.println("Tuoi: " + Tuoi);
    }
}
