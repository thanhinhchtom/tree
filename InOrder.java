import java.util.Stack;

public class InOrder {
    public static class node{
        int data;
        node left;
        node right;

        public node(int item){
            data = item;
            left = null;
            right = null;
        }
    }
    public static class InOrderTree{
        node root;
        public void inorder(){
            if(root == null){
                return;
            }
            Stack<node> stack = new Stack<node>();
            node current = root;
            while (current != null || stack.size() > 0){
                while (current != null){
                    stack.push (current);
                    current = current.left;
                }
                current = stack.pop();
                System.out.print(current.data + " ");   //print to the screen
                current = current.right;
            }
        }
    }
}
