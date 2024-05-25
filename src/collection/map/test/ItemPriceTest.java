package collection.map.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("사과", 500, "바나나", 500, "망고", 1000, "딸기", 1000);

        List<String> result = new ArrayList<>();
        for (String key : map.keySet()) {
            if(map.get(key) == 1000) {
                result.add(key);
            }
        }

        System.out.println(result);
    }
}
