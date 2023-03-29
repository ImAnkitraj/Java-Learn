package com.tekion;

public class Node extends  ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.right;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.right = item;
        return this.right;
    }

    @Override
    ListItem previous() {
        return this.left;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.left = item;
        return this.right;
    }

    @Override
    int compareTo(ListItem item) {
        return 0;
    }
}
