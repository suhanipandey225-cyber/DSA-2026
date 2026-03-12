// class LRUCache {
//     class Pair{
//         int first;
//         int second;
//         Pair(int first, int second){
//             this.first=first;
//             this.second=second;

//         }
//     }
//     public static ArrayList<Pair> cache;
//     public static int n;
//     public LRUCache(int capacity) {
        
//         n = capacity;
//         cache = new ArrayList();

//     }
    
//     public int get(int key) {
//         if (cache.size==0) return -1;

//         for(int i=0;i<cache.size();i++){
//             if(cache.get(i).first==key){
//                 int tempVal = cache.get(i).second;
//                 cache.remove(i);
//                 cache.add( 0 , new Pair(key,tempVal));
//                 return tempVal;
//             }
            
            
//         }
//         return tempVal;
//     }
    
//     public void put(int key, int value) {
//         if(cache.size()==n){
//             cache.remove(n-1);
//             cache.add(0, new Pair(key, value));
            
//         }
//         boolean check=false;
//         for(int i=0;i<cache.size();i++){
//             if(cache.get(i).first ==key ){
//                 cache.remove(i);
//                 cache.add(0, new Pair(key,value));
//             }
//         }
//             if(!check){
//                 if(cache.size()==n){
//                      cache.remove(n-1);
//                      cache.add(0,new Pair(key,value));
//                 }
//                 else{
//                     cache.add(0,new )
//                 }

//             }
//     }
// }







import java.util.*;

class LRUCache {

    int capacity;
    LinkedHashMap<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }

    public int get(int key) {

        if(!map.containsKey(key)){
            return -1;
        }

        int value = map.get(key);

        map.remove(key);
        map.put(key,value);

        return value;
    }

    public void put(int key, int value) {

        if(map.containsKey(key)){
            map.remove(key);
        }

        else if(map.size() == capacity){
            int firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }

        map.put(key,value);
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */