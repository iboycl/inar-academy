package assignments.question_13_08;

public class Question_13_08 {
    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        System.out.println("Pushing the numbers 4, 5, and 6 to 1st stack...");
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        System.out.println("Cloning 1st stack...");

        MyStack stack2 = (MyStack)stack1.clone();

        System.out.println("Popping object from 1st stack...");

        stack1.pop();

        System.out.println("1st stack: " + stack1);
        System.out.println("2nd stack: " + stack2);

        System.out.println("Does the 1st stack equal to the 2nd stack? --> " + (stack1 == stack2));

    }

}
