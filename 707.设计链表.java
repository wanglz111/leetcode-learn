/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start
class MyLinkedList {
    int size;

    ListNode head;

    public MyLinkedList() {
       size = 0;
       head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index > size) {
            return -1;
        }
        ListNode currentNode = head;

        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }

        size++;

        ListNode currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        ListNode nextNode = new ListNode(val);
        nextNode.next = currentNode.next;
        currentNode.next = nextNode;

    }

    public void deleteAtIndex(int index) {
        if (index > size || index < 0) {
            return;
        }
        size --;
        ListNode preNode = head;
        for (int i = 0; i < index; i++) {
            preNode = preNode.next;
        }
        ListNode deleteNode = preNode.next;
        preNode.next = deleteNode.next;

    }
}

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

