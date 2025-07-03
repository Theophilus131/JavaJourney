import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List<String> theoList= new ArrayList<>();

    public boolean isEmpty() {
    return theoList.isEmpty();
    }

    public boolean contains(String item) {
        return theoList.contains(item);
    }

    public boolean add(String item) {
        theoList.add(item);
        return true;
    }
}
