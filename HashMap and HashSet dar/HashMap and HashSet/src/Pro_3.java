import java.util.*;
public class Pro_3 {
    public static void main(String[] args){
        int[] arr={1,2,1,3,4,2,5,4,6};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        System.out.println(hm);
    }
}
