import java.util.*;

public class Driver {

        public static void main(String[] args) {
                Solusion s = new Solusion();
                String[]words = {"a","a","b","c","b","a"};
                List<String> result = s.topKFrequent(words, 2);
                System.out.println(result);

        }

        static class Solusion {
                public List<String> topKFrequent(String[] words, int k) {
                        List<String> result = new LinkedList<>();
                        if (words == null) return result;
                        Map<String, Integer> map = new HashMap<>();
                        for (int i = 0; i < words.length; i++) {
                                if (map.containsKey(words[i]))
                                        map.put(words[i], map.get(words[i]) + 1);
                                else
                                        map.put(words[i], 1);
                        }

                        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(
                                (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
                        );

                        for (Map.Entry<String, Integer> entry: map.entrySet()) {
                                heap.offer(entry);
                                if (heap.size() > k)
                                        heap.poll();
                        }

                        while(!heap.isEmpty()) {
                                result.add(0, heap.poll().getKey());
                        }
                        return result;
                }
        }

}

// list String TopK   "a, ,b, c, a, b, a"   k = 2   //input -> String[]  output-> a b























/**
 打印字符串中最长的连续增长子串

 规则说明：
 1）连续增长子串： ASCII码值依次+1， 如 abc（长度为3）, hijkl（长度为4）
 2）最大长度的连续增长子串个数大于1，则打印第一个子串
 */

        /**
public solution {
    // "abcef"
        public static void theLongString(String str) {
            int start = 0;
            int end = 0;
            int len = 0;

            for (int i = 0; str.length(); i++) {
                int flag = 0;
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) - str.charAt(j -1) == 1) {
                        flag += 1;
                        if (flag > len) {
                            start = i;
                            end = j;
                            len = flag;
                        }
                    }
                    else break;
                }
            }
        }
        for (int i = st; i<= ed; i++){
        System.out.println(str.charAt(i));
        }
}

         **/