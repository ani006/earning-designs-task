import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        String str="virat sachin virat dhoni Virat dHoni"; // input variable
        String[] list=str.split(" ");
        HashMap<String, Integer> map=new HashMap<>();
        for(String word:list)
        {
            String lWord=word.toLowerCase();
            map.put(lWord, map.getOrDefault(lWord, 0)+1);
        }
        System.out.println(map);
    }
}
