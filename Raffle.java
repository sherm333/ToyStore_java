import java.util.PriorityQueue;

public class Raffle {
    PriorityQueue<ItemForRaffle> items = new PriorityQueue<ItemForRaffle>();
    
    public void add(Toy toy, Integer count) {
        for(int i = 0; i < count; i++) {
            this.items.add(new ItemForRaffle(toy, count));
        }
    }

    public ItemForRaffle get(){
        return this.items.poll();
    }
}