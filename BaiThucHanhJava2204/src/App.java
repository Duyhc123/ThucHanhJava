
import shape.offlinestudent;
import shape.onlinestudent;

public class App {
public static void main(String[] arg) throws Exception {
    onlinestudent std1 = new onlinestudent();
    std1.nhapTruong();
    std1.nhapLop();
    std1.Noihoc();
    offlinestudent std2 = new offlinestudent();
    std2.nhapTruong();
    std2.nhapLop();
    std2.Noihoc();
}

}
