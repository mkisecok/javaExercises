package kisecok.testproject;

public class ListService {
    public static void main(String[] args) {

        DemoLinkedList demoLinkedList = new DemoLinkedList();

        demoLinkedList.add(new Color(0,0,0).toString());
        demoLinkedList.add(new Color(1,0,0).toString());
        demoLinkedList.add(new Color(1,0,2).toString());
        demoLinkedList.add(new Color(1,0,5).toString());

        System.out.println("demoLinkedList Size: " + demoLinkedList.size());
        System.out.println("first element of linkedList: " + demoLinkedList.get(3));
    }
}
