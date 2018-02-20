package p09_collection_hierarchy;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyList {
    private Deque<String> list = new ArrayDeque<>();
    private StringBuilder sbAdd = new StringBuilder();
    private StringBuilder sbRemove = new StringBuilder();

    private int Used;

    public void Add(String string){
        this.list.addFirst(string);
        this.sbAdd.append("0 ");
    }

    public void Remove(){
        this.sbRemove.append(this.list.peekFirst());
        this.sbRemove.append(" ");
        this.list.removeFirst();
    }

    public int Used() {
        return this.list.size();
    }

    public String PrintAdd(){
        return String.format("%s", this.sbAdd.toString().trim());
    }

    public String PrintRemove(){
        return String.format("%s", this.sbRemove.toString().trim());
    }
}
