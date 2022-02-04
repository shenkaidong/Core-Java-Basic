package LMSAssignment.Assignment3;

import org.checkerframework.checker.units.qual.C;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      //  doS(new Car());


//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,10));
//        Map<String,String> map = new HashMap<>()
//        {
//            {
//                put("a","1");
//                put("b","2");
//                put("c","10");
//            }
//        };
//        System.out.println(doS(list,map));


        Circle cir = new Circle((float) 5.7);
        Rectangle rec = new Rectangle(5,6);

        System.out.println(cir.compareTo(rec));
        System.out.println(rec.compareTo(cir));


        try {
            TreeSet<Shape> tr = new TreeSet<>();
            tr.add(rec);
            tr.add(cir);
            for (Shape s : tr)
            {
                System.out.println(s.getArea());
            }
        }
        finally {
            System.out.println("finally");
        }


    }
    public static  List<Integer> doS(List<Integer> list, Map<String,String> map)
    {
        List<Integer> rst = new ArrayList<>();
        for(Integer i : list)
        {
            if(!map.containsValue(String.valueOf(i)))
            {
                rst.add(i);
            }
        }
        return rst;
    }
    public static void doS(final Car aCar)
    {


        System.out.println(aCar.getColor());
        aCar.setColor(new Color());
        System.out.println(aCar.getColor());
    }
}
