/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
import java.util.Scanner;

public class homework20_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        for (int i = 0; i < 5; i++) {
            int v = sc.nextInt();
            ListNode newNode = new ListNode(v);

            if (list.head == null) {
                list.head = newNode;
            } else {
                ListNode curr = list.head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = newNode;
            }
        }

        deleteDuplicates(list);
        System.out.println(list);
    }

    public static void deleteDuplicates(LinkedList llist)
    {
        if (llist.head == null) return;

        ListNode curr = llist.head;

        while (curr != null && curr.next != null) {
            if (curr.value == curr.next.value) {
                curr.next = curr.next.next; 
            } else {
                curr = curr.next;
            }
        }
    }
}
