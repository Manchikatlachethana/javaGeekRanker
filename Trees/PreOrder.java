public static void preOrder(Node root) {
        if(root == null){
            return;
        }
        Stack<Node> s = new Stack();
        List<Integer> l = new ArrayList<>();
        s.push(root);
        while(!s.isEmpty()){
            Node curr = s.pop();
            l.add(curr.data);           
            if(curr.right != null){
                s.push(curr.right);
            }
            if(curr.left != null){
                s.push(curr.left);
            }            
        }
        for(int i:l){
            System.out.print(i+" ");
        }      
    }


/* Recursion
public static void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
*/
