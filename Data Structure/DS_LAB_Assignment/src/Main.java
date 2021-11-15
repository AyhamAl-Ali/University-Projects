/**
 * 
 * Name: Ayham Al-Ali
 * UID: 201910486
 * Date: 26th May 2021
 * 
 */

public class Main {

    public static void main(String args[]) {
        
        DLList list = new DLList();
        
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");

        for (int i = 0; i < list.getLength(); i++)
            list.getNodeAt(i).printNode();
        
        
        
    }
}
