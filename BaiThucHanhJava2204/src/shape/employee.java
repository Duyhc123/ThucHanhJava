package shape;
import java.util.Scanner;
public class employee extends person {
    public float Chucvu;
    public float Luong;
    public void nhapCongViec() {
        Scanner sc = new Scanner(System.in); {
            sc.close();
            {
                System.out.println("Nhap chuc vu: ");
                Chucvu = sc.nextFloat();
                System.out.println("Nhap luong: ");
                Luong = sc.nextFloat();
            }
        }
    }
    public void inCongViec() {
        System.out.println("Chuc vu: "+ Chucvu);
        System.out.println("Luong: "+ Luong);
    }
    
}
