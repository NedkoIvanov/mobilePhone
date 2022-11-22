import java.util.Comparator;

public class dateCompare implements Comparator<call> {
    @Override
    public int compare(call o1, call o2) {
        return o2.getDate().compareTo(o1.getDate());
    }
}
