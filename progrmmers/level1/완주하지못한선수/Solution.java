import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] qwe ={"leo", "kiki", "eden"};
        String[] asd ={"eden", "kiki"};
        Solution solution = new Solution();
        String result = solution.solution(qwe, asd);
        System.out.println(result);
    }

    // https://coding-grandpa.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98-%ED%95%B4%EC%8B%9C-Lv-1
    // https://coding-factory.tistory.com/556
    //https://developer-yeony.tistory.com/84 
}