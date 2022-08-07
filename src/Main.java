import java.util.HashMap;
import java.util.Map;

/**
 * RaiseTech課題03 HashMap/例外処理
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> score = new HashMap<>();
        score.put("国語", 70);
        score.put("数学", 65);
        score.put("英語", 80);

      String subject = "社会";

        try {
            if (score.get(subject) == null) {
                throw new Exception("指定した科目のスコアはありません");
            }
            System.out.println(score.get(subject));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println( "以下の科目から選択してください");
            for(String key : score.keySet()){
                System.out.println(key);
            }

        }
    }
}
