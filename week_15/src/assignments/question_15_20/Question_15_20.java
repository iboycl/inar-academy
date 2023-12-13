package assignments.question_15_20;

public class Question_15_20 {
    public static void main(String[] args) {
        Post post1 = new Post();

        post1.addTag("java");
        post1.addTag("coding");
        post1.addTag("programming");

        Post post2 = new Post();

        post2.addTag("java");
        post2.addTag("technology");
        post2.addTag("coding");

        System.out.println("Tags of Post1: " + post1.getTags());
        System.out.println("Tags of Post2: " + post2.getTags());
        System.out.println("Does post1 have the tag 'java'? " + post1.checkTag("java"));
        System.out.println("Does post1 have the tag 'java'? " + post1.checkTag("programming"));

        post1.removeTag("programming");
        System.out.println("Tags of Post1: " + post1.getTags());

        System.out.println("post1 ID: " + post1.getPostID());
        post1.addTag("java");
    }
}
