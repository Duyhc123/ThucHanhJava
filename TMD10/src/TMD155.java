import java.io.PrintStream;
import java.util.ArrayList; 
public class TMD155 extends Product {
 private String TMD155ID; 
private float TMD155Score;
 @Override 
public void Nhapthongtin(){ 
super.Nhapthongtin(); 
System.out.print("ID: ");
System.out.print("Name: "); 
System.out.print("Price: "); 
Object sc;
Object sc; 
Object sc;
TMD155ID = sc.nextLine(); 
System.out.print("Score: "); 
TMD155Score = sc.nextFloat(); 
} 
@Override 
public void Inthongtin(){ 
super.Inthongtin(); 
System.out.print("ID: " + TMD155ID); 
System.out.print("Score: " + TMD155Score); } 
public void ThemN(ArrayList<TMD155> tmd155_ArrayList) { 
System.out.print("Nhập số Product cần thêm vào ArrayList: "); 
PrintStream sc;
int n = ((Object) sc).nextInt(); 
for(int i=0;i<n;i++){ 
System.out.print("People: " + (i+1)); 
TMD155 tmd155 = new TMD155(); 
tmd155.Nhapthongtin(); 
tmd155_ArrayList.add(tmd155); 

} 
} 
public static void main(String []args){ 
new ArrayList<>(); 
} 
}

