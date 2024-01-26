import java.util.HashSet;

public class pra1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,4};
        HashSet<Integer>hs=new HashSet<>();
        for(int i:arr)
        {
            hs.add(i);
        }
        System.out.println(hs);
    }
}
