class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. Length check is the first line of defense
        if (s.length() != t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        // 2. Populate Map S (Use .toCharArray())
        for (char c : s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        // 3. Populate Map T
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        // 4. Direct comparison (The most efficient way with Maps)
        return mapS.equals(mapT);
    }
}