import java.util.*;

class MyStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> sm = new Stack<>();
    public void push(int node) {
        s.push(node);
        if(!sm.isEmpty()) {
            int tmp = sm.peek();
            if(node < tmp) {
                sm.push(node);
            }
        } else {
            sm.push(node);
        }
    }

    public void pop() {
        s.pop();
        sm.pop();
    }

    public int top() {
        return s.peek();
    }

    public int min() {
        return sm.peek();
    }
}
public class Main3 {
    class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    //反转链表
//    public ListNode ReverseList(ListNode head) {
//        if(head == null) return null;
//        if(head.next == null) return head;
//        ListNode cur = head;
//        ListNode prev = null;
//        while(cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        head = prev;
//        return head;
//    }

    //输出倒数第K个节点
//    public int size(ListNode pHead) {
//        ListNode cur = pHead;
//        int count = 0;
//        while(cur != null) {
//            count++;
//            cur = cur.next;
//        }
//        return count;
//    }
//    public ListNode FindKthToTail (ListNode pHead, int k) {
//        // write code here
//        if(pHead == null) return null;
//        int n = size(pHead);
//        if(k < 0 || k > n) return null;
//        int ret = n - k;
//        ListNode cur = pHead;
//        while(ret != 0) {
//            cur = cur.next;
//            ret--;
//
//        }
//        return cur;
//    }

    //合并链表
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        ListNode head = new ListNode(0);
//        ListNode cur = head;
//        if(list1 == null) return list2;
//        if(list2 == null) return list1;
//        ListNode p1 = list1;
//        ListNode p2 = list2;
//        while(p1 != null && p2 != null) {
//            if(p1.val < p2.val) {
//                cur.next = p1;
//                p1 = p1.next;
//            } else {
//                cur.next = p2;
//                p2 = p2.next;
//            }
//            cur = cur.next;
//        }
//        if(p1 != null) {
//            cur.next = p1;
//        }
//        if(p2 != null) {
//            cur.next = p2;
//        }
//        return head.next;
//    }

    //牛客判断树的子结构
//    public boolean isSameTree(TreeNode p,TreeNode q) {
//        if(q == null) return true;
//        if(p == null) return false;
//        if(p == null && q == null) return true;
//        if(p.val != q.val) return false;
//        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//    }
//    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
//        if(root1 == null || root2 == null) return false;
//        if(isSameTree(root1,root2)) return true;
//        if(HasSubtree(root1.left,root2)) return true;
//        if(HasSubtree(root1.right,root2)) return true;
//        return false;
//    }

    //镜像二叉树
//    public TreeNode Mirror (TreeNode pRoot) {
//        // write code here
//        if(pRoot == null) return null;
//        if(pRoot.left == null && pRoot.right == null) return pRoot;
//
//        TreeNode tmp = pRoot.left;
//        pRoot.left = pRoot.right;
//        pRoot.right = tmp;
//
//        Mirror(pRoot.left);
//        Mirror(pRoot.right);
//
//        return pRoot;
//    }

    //从上往下打印出二叉树的每个节点，同层节点从左至右打印。
//    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Queue<TreeNode> qu = new LinkedList<>();
//        if(root == null) return list;
//        qu.offer(root);
//        while(!qu.isEmpty()) {
//            TreeNode cur = qu.poll();
//            list.add(cur.val);
//            if(cur.left != null) {
//                qu.offer(cur.left);
//            }
//            if(cur.right != null) {
//                qu.offer(cur.right);
//            }
//        }
//        return list;
//    }
    
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
//        MyStack ms = new MyStack();
////        ms.push(1);
////        ms.push(2);
//        ms.push(4);
//        ms.push(6);
//        ms.push(3);
//        System.out.println(ms.min());
//        System.out.println(ms.top());
//        ms.pop();
//        System.out.println(ms.top());
//        Stack<Integer> s = new Stack<>();
//        s.push(0);
//        s.peek();
//
//        int[] arr = new int[10];
//        int[] newArr = Arrays.copyOf(arr,arr.length*2);
//        System.out.println(newArr.length);
    }
}
