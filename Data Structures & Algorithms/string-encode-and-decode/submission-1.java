

class Solution {

    // Encode: length-prefixed scheme: "len#string" for each string
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            int len = str.length();
            sb.append(len).append('#').append(str);
        }
        return sb.toString();
    }

    // Decode the above format
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            // read length until '#'
            int j = i;
            while (j < s.length() && s.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(s.substring(i, j));
            // skip '#'
            int start = j + 1;
            int end = start + len;
            res.add(s.substring(start, end));
            i = end;
        }
        return res;
    }
}