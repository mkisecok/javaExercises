package kisecok.testproject;

public class DemoLinkedList extends AbstractDemoList {

    Node first;
    Node last;


    private class Node {
        private Object obj;
        private Node next;

        private Node(Object obj) {
            this.obj = obj;
            this.next = null;
        }
    }


    @Override
    public void add(Object obj) {

        Node node = new Node(obj);

        if (first == null && last == null) {
            first = node;
            last = node;
            return;
        }

        last.next = node;
        last = node;
    }

    @Override
    public Object get(int index) {
        if ((first == null && last == null) || index < 0) {
            throw new ArrayIndexOutOfBoundsException("index is not correct");
        } else if (index == 0) {
            return first.obj;
        } else {
            int currentIndex = 0;

            Node currentNode = first;

            while (currentNode.next != null && currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            if (currentIndex == index) {
                return currentNode.obj;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        }
    }

    @Override
    public int size() {
        if (first == null && last == null) {
            return 0;
        } else {
            int size = 1;

            Node currentNode = first;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
                size++;
            }
            return size;
        }
    }
}
