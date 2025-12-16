package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class IterableDFS {

    static void main() {
        Deque<Integer> stack = new ArrayDeque<>();

        int rootNode = 10;

        stack.push(rootNode);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println(node);
        }


    }
}
