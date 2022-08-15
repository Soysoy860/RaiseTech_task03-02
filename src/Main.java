import java.util.HashMap;
import java.util.Map;

/**
 * RaiseTech課題03 HashMap/例外処理
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> subjectScoreMap = new HashMap<>();
        subjectScoreMap.put("国語", 70);
        subjectScoreMap.put("数学", 65);
        subjectScoreMap.put("英語", 80);

      String subject = "社会";

        try {
            if (subjectScoreMap.get(subject) == null) {
                throw new IllegalArgumentException("指定した科目はありません");
            }
            System.out.println(subjectScoreMap.get(subject));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println( "以下の科目から選択してください");
            for(String key : subjectScoreMap.keySet()){
                System.out.println(key);
            }

        }
    }
}
