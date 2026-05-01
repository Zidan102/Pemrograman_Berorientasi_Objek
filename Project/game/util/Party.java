package game.util;
import java.util.ArrayList;
import java.util.List;

public class Party<T> {
    private List<T> members = new ArrayList<>();

    public void addMember(T member) {
        members.add(member);
    }

    public List<T> getMembers() {
        return members;
    }
}