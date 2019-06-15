/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery.calculator;

/**
 *
 * @author Jeremy
 */
public class Queue {

    Node head; // head of list
    int count;

    class Node {

        Grocery item;
        Node next;

        Node(Grocery g) {
            item = g;
            count = count + 1;
        }
    }

    public Queue add(Grocery g) {
        Node new_node = new Node(g);
        new_node.next = null;
        if (this.head == null) {
            this.head = new_node;
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return this;
    }

    public int size() {
        return count;
    }

    public Grocery get() {
        Grocery g = head.item;
        head = head.next;
        count = count - 1;
        return g;
    }

}
