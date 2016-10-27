import java.io.*;
import java.util.*;

public class Main {
    static String electionWinner(String[] votes) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int max = 0;
        LinkedList<String> list = new LinkedList();
        for (String s : votes) {
            if (!map.containsKey(s)) {
                map.put(s,1);
                max = 1;
            }
            else {
                map.put(s, (map.get(s)+1));
                max = Math.max(max, (map.get(s)+1));
            }
        }
        Set keys = map.keySet();
        for (Iterator i = keys.iterator(); i.hasNext();) {
            String key = (String)i.next();
            Integer value = (Integer)map.get(key);
            if (value == max) {
                list.add(key);
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);

    }


	public static void main(String[] args) {
		String[] s = {"aa","bvv","aa","bvv","s"};
		String ss = "asd";
		System.out.println(ss.substring(1,2));
//		electionWinner(s);
	}
}