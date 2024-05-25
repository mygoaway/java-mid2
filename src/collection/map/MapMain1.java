package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 학생 성적 데이터 추가
        map.put("studentA", 90);
        map.put("studentB", 80);
        map.put("studentC", 80);
        map.put("studentD", 100);
        System.out.println("map = " + map);

        System.out.println("특정 학생의 값 조회");
        Integer studentD = map.get("studentD");
        System.out.println("studentD = " + studentD);

        System.out.println("keySet 활용");
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("values 활용");
        Collection<Integer> values = map.values(); // 순서보장 하지 않기 때문에 List가 불가, 중복을 허용하기 때문에 Set 불가로 Collection 타입으로 반환
        for (Integer value : values) {
            System.out.println("value = " + value);
        }




    }
}
