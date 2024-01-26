import java.util.HashMap;

public class pra3 {
    public static void main(String[] args) {
        int arr[]={1,3,3,4,5,6,4};
        HashMap<Integer, Integer> s=new HashMap<>();
        for(int i:arr)
        {
            if(s.containsKey(i))
            {
                s.put(i,s.get(i)+1);
            }else {
                s.put(i,1);
            }
        }
        System.out.println(s);
    }
}
