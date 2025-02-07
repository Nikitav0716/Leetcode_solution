class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> list = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
    
            for(int[] query :queries){
                int ball = query[0];
                int color = query[1];

                if(list.containsKey(ball)){
                   int col = list.get(ball);
                   map.put(col,map.get(col)-1);
                    if(map.get(col) == 0){
                        map.remove(col);
                    }
                }
            list.put(ball,color);
            map.put(color,map.getOrDefault(color,0)+1);
            result.add(map.size());
            }
            return result.stream().mapToInt( i -> i).toArray();
    }
}
