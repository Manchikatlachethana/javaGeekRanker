public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    Map<Integer,Integer> m = new HashMap<>();
    for(int i:a){
        if(!m.containsKey(i)){
            m.put(i,1);
        }else{
            m.put(i,m.get(i)+1);
        }
    }
    for(Map.Entry<Integer,Integer> hm : m.entrySet()){
        if(hm.getValue() == 1){
            return hm.getKey();
        }
    }
    
    return -1;
    }
