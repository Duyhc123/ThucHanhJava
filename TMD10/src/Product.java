import java.util.Scanner;
public class Product {
    
    private String ProductID = null;
    private String ProductName = null;
    private String UnitPrice = null;
    public void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham: "); 
        System.out.println("Nhap ten san pham: "); 
        System.out.println("Nhap don gia: ");
        sc.close();
    }
    
    public void Inthongtin() {
        System.out.println("Thong tin san pham: "); 
        System.out.print(" Ma san pham "+ProductID+"Ten san pham "+ProductName+"Don gia"+UnitPrice); } 
        public static void main(String[] args) throws Exception { 
            Product pr = new Product();
            pr.Nhapthongtin(); pr.Inthongtin();
        }
    }

