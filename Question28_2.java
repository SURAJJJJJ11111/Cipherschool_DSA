import java.lang.classfile.components.ClassPrinter.ListNode;

import java.util.List;
import java.util.*;
public class Question28_2 {
     public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null)
      return head;

    ListNode newHead = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
  }
    
}
