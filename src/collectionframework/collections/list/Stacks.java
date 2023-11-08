package collectionframework.collections.list;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stacks = new Stack<>();
        stacks.push("sagheer");
        stacks.push("wajid");
        stacks.push("bashar");
        stacks.push("shahab");
        stacks.push("abc"); // peek element
        System.out.println(stacks);
        System.out.println("peek element or ready to remove from memory: " + stacks.peek());
        stacks.pop();
        System.out.println(stacks);
        System.out.println("peek element or ready to remove from memory: " + stacks.peek());
     }
}
