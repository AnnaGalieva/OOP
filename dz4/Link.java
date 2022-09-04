package OOP.dz4;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Link {
    private List<Link> links = new ArrayList<>();
    public char[] toString;

    public Link() {}

    public void addLink(int id, Date date, String dedlain, String authorName, Priority priority) {
        Link l1 = new Link();
        links.add(l1);
    }
}
