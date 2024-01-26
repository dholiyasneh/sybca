import javax.print.attribute.HashAttributeSet;
import java.util.HashSet;

public class pra2 {
    public static void main(String[] args) {
     int[] arr={1,2,3,3,3,4};
     int[] arr2={40};
     HashSet<Integer> sn=new HashSet<>();
     for(int i:arr)
     {
         sn.add(i);
     }
     for(int i:arr2)
     {
         if(!sn.contains(i))
         {
             System.out.println("is not subset");
             return;
         }
         System.out.println("is subset");
     }
    }

}
