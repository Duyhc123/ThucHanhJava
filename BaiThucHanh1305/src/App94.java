import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class App94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(100,"Mo");
        hm.put(101, "Dia");
        hm.put(102,"Chat");
        for(Map.Entry<Integer,String> m:hm.entrySet());
        Entry<Integer, String> m;
        System.out.println(getKey()+" "+getValue());
        System.out.println("Before invoking remove method: " +hm);
        System.out.println("After invoking remove method: " +hm);
    }

    private static String getValue() {
        return null;
    }

    private static String getKey() {
        return null;
    }

}
