package ljh.zijin.test;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            list.add(i);
        }
//        Set<Integer> set=new HashSet<Integer>();
//        Random r=new Random(1);
//        while (set.size()<20){
//            set.add(r.nextInt((list.size())));
//        }
//        System.out.println(set);
//        System.out.println("取到了"+set.size()+"个题目");
        List<Integer> ids=new ArrayList<Integer>();
        Random r=new Random();
        while(ids.size()<=20){
            int id=r.nextInt(list.size());
            if(ids.contains(id)){
                continue;
            }
            ids.add(id);
        }
        System.out.println(ids);
        System.out.println(list.size());
    }
}
