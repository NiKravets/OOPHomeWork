package lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{
    User boss;

    public Company(User boss) {
        this.boss = boss;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {

            private List<User> employees = DeepTree(boss);
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < employees.size();
            }

            @Override
            public User next() {
                return employees.get(currentIndex++);
            }
        };
    }

    private List<User> DeepTree(User user) {
        List<User> answer = new ArrayList<>();
        answer.add(user);
        if (user.getSubordinates() == null || user.getSubordinates().size() == 0) {
            return answer;
        }

        for (User subordinate : user.getSubordinates()) {
            answer.addAll(DeepTree(subordinate));
        }

        return answer;
    }

/*    @Override
    public Iterator<lecture.User> iterator() {
        return boss.getSubordinates().iterator();
    }*/
}
