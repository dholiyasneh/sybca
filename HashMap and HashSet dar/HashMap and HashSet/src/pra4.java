import java.util.HashMap;
import java.util.HashSet;

public class pra4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3};
        int sum=443;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr)
        {
            if(hs.contains(sum-i))
            {
                System.out.println("sum pair is present");
                return;
            }
            else {
                hs.add(i);
            }
        }
        System.out.println("sum pair is not present");

    }
}
