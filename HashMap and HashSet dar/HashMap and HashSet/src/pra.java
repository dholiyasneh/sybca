import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class pra {
    public static void main(String[] args) {
        int[] arr={12,3,4,5};
//        HashSet<Integer> hs=new HashSet<>();
//        for(int i:arr)
//        {
//            hs.add(i);
//        }
//    // hs.clear();
//      //  hs.remove(12);
//       for(int i:hs)
//       {
//           System.out.println(i);
//       }
//        System.out.println(hs.contains(1));
//        System.out.println(hs.isEmpty());
//        System.out.println(hs.size());
//        HashSet<Integer> js2=new HashSet<>();
//        js2=hs;
//        System.out.println(js2);

    //working of hashmap
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(12,"sh");
        hm.put(2,"df");

        hm.put(1,"d");
        hm.put(12,"sh");

        hm.put(1,"null");
        System.out.println(hm.isEmpty());
        for(Map.Entry e: hm.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }


}
