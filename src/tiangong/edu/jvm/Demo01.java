package tjpu.edu.jvm;

/**
 * Created by Lwq on 2021/12/25 16:29
 */
public class Demo01 {

    
    public String test(String str) {
        int i = 0;
        StringBuffer sb = new StringBuffer();
        while (i < 100) {
            sb.append(str);
            i++;
        }
        return sb.toString();
    }
    
    
    public static void main(String[] args) {
        
    }
    
    
}
