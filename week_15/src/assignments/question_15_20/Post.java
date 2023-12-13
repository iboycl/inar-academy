package assignments.question_15_20;

import java.util.HashSet;
import java.util.Set;

public class Post {
    private Set<String> tags;
    private int postID;

    private static int count = 0;
    public Post () {
        count++;
        postID = count;
        tags = new HashSet<>();
    }

    public void addTag (String tag) {
        if (tags.contains(tag)) {
            System.out.println("This tag was already added!");
        } else {
            tags.add(tag);
        }
    }

    public void removeTag (String tag) {
        if (tags.contains(tag)) {
            tags.remove(tag);
        } else {
            System.out.println("This tag was never added!");
        }
    }

    public boolean checkTag (String tag) {
        return tags.contains(tag);
    }

    public Set<String> getTags() {
        return tags;
    }

    public int getPostID() {
        return postID;
    }
}
