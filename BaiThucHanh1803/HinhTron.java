import java.util.Scanner;
public class HinhTron {
    public static void main(String[] args) throws Exception {
        
    }
class Hinhtron{
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    void nhapBankinh()
    {
        System.out.println("Hay nhap ban kinh hinh tron: ");
        Scanner scan = new Scanner (System.in);
        r= scan.nextFloat();

    }
    void tinhChuvi()
    {
        cv = 2 *PI * r;

    }
    void tinhDientich()
    {
        dt = PI * r * r ;

    }
    void inChuvi ()   
    {
        System.out.println("Chu vi hinh tron la: " +cv);
    }
    void inDientich()
    {
        System.out.println("Dien tich hinh tron la: " +dt);
    }
}