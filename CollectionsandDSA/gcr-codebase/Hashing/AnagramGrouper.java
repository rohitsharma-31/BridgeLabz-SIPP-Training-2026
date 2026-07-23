package CollectionsandDSA.gcr_codebase.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGrouper {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> emptyResult = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return emptyResult;
        }

        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }
}