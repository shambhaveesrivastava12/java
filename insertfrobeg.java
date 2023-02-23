public class linkedlist
  {
    ListNode head;
    private static class ListNode
      {
       private int data;
        private ListNode next;
      }
    public ListNode(int d)
    {
      this.data=d;
      this.next=null;
    }
    void insertatfront(int data)
    {
      ListNode newnode = new ListNode(data);
      newnode.next = head;
      head = newnode;
    
  }
    void display()
    {
      Node temp = head;
      while(temp!=null)
        {
          System.out.println(temp.data + " ");
          temp = temp.next;
        }
    }
    public static void main(String args[])
    {
      linkedlist obj = new linkedlist();
      obj.head = new ListNode(10);
      ListNode second = new ListNode(20);
      ListNode third = new ListNode(30);
      ListNode fourth = new ListNode(40);

      obj.head.next=second;
      second.next=third;
      third.next=fourth;
    }