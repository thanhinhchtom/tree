public class PrintTree {
    public class node{
        int parent;
        node left;
        node right;
        public node(int item){
            parent = item;
            left = null;
            right = null;
        }
    }
    public class print {
        node root;

        void InOrderprint(node current) {
            if (current == null) {
                return;
            }
            InOrderprint(current.left);
            System.out.print(" " + current.parent);
            InOrderprint(current.right);
        }

        void PostOrderprint(node current) {
            if (current == null) {
                return;
            }
            PostOrderprint(current.left);
            PostOrderprint(current.right);
            System.out.print(" " + current.parent);
        }

        void PreOrderprint(node current) {
            if (current == null) {
                return;
            }
            System.out.print(" " + current.parent);
            PreOrderprint(current.left);
            PreOrderprint(current.right);
        }

        void PostOrderprint() {
            PostOrderprint(root);
        }

        void PreOrderprint() {
            PreOrderprint(root);
        }

        void InOrderprint() {
            InOrderprint(root);
        }
    }
}
