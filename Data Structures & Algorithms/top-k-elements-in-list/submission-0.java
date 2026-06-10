class Pair implements Comparable<Pair>{
    int key;
    int value;

    Pair(int key,int value){
        this.key = key;
        this.value=value;
    }

    @Override
    public int compareTo(Pair that){
        return this.value-that.value;
    }

}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> m1 = new HashMap<>();
        for(int n : nums){
            m1.put(n,m1.getOrDefault(n,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(Map.Entry<Integer,Integer> p : m1.entrySet() ){

            pq.offer(new Pair(p.getKey(),p.getValue()));
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        int res[] = new int[k];
        for(int i = 0;i<k;i++){
            Pair p = pq.poll();

            res[i]=p.key;
        }

        return res;
    }
}