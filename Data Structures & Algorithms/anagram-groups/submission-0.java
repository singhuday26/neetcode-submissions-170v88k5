class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> resList = new ArrayList<>();
        
        
        for(int i = 0; i < strs.length; i++){
            int x = -1;
            List<String> res = new ArrayList<>();

            String w1 = strs[i];

                for(List<String> innerList: resList)
                {
                    for(String w : innerList){
                        if(w == w1){x = 0; break;}
                    }
                    if(x == 0)
                    break;
                }

            if(x == 0)
            continue;



            res.add(w1);
            for(int j = i + 1; j < strs.length; j++){
                String w2 = strs[j];

                boolean result = isAnagram(w1, w2);
                if(result){


                if(x != 0)
                res.add(w2);
                }

            }
            resList.add(res);
        }

        return resList;
    }


    static boolean isAnagram(String s, String t){

    int m = s.length();
    int n = t.length();

    Map<Character, Integer> mapS = new HashMap<>();
    Map<Character, Integer> mapT = new HashMap<>();

    if(m != n)
        return false;

    for(int i = 0; i < m; i++){
        char c = s.charAt(i);
        mapS.put(c, mapS.getOrDefault(c,0)+ 1);
    }

        for(int i = 0; i < n; i++){
        char c = t.charAt(i);
        mapT.put(c, mapT.getOrDefault(c,0) + 1);
    }

    if(mapS.equals(mapT))
        return true;
    else 
        return false;
    }























}


    

