class NumberContainers {
    private Map<Integer, Integer> indextonum; 
    private Map<Integer, TreeSet<Integer>> numtoindices;

    public NumberContainers() {
        indextonum = new HashMap<>();
        numtoindices = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(indextonum.containsKey(index)){
            int old = indextonum.get(index);
            if(old != number){
                numtoindices.get(old).remove(index);
                if(numtoindices.get(old).isEmpty()){
                    numtoindices.remove(old);
                }
            }
        }
        indextonum.put(index,number);
        numtoindices.putIfAbsent(number, new TreeSet<>());
        numtoindices.get(number).add(index);
    }
    
    public int find(int number) {
         return numtoindices.containsKey(number) ? numtoindices.get(number).first() : -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
