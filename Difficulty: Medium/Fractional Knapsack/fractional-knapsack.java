class Solution {
    static class Item{
        int val;
        int wt;
        
        Item(int val,int wt){
            this.val=val;
            this.wt=wt;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n=val.length;
        Item[]items=new Item[n];
        for(int i=0;i<n;i++){
            items[i]=new Item(val[i],wt[i]);
        }
        Arrays.sort(items,(a,b)->
            Double.compare(
                (double)b.val/b.wt,
                (double)a.val/a.wt
            )
        );
        double total=0.0;
        for(int i=0;i<n;i++){
            if(capacity>=items[i].wt){
                total+=items[i].val;
                capacity-=items[i].wt;
            }
            else{
                total+=((double)items[i].val/items[i].wt)*capacity;
                break;
            }
        }
        return total;
    }
}