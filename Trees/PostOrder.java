public static void postOrder(Node root) {
        if(root == null){
            return;
        }
        Stack<Node> s = new Stack();
        List<Integer> l = new ArrayList<>();
        s.push(root);
        while(!s.isEmpty()){
            Node curr = s.pop();
            l.add(curr.data);
            if(curr.left != null){
                s.push(curr.left);
            }
            if(curr.right != null){
                s.push(curr.right);
            }          
        }
        Collections.reverse(l);
        for(int i:l){
            System.out.print(i+" ");
        }
   }

/*
public static void postOrder(Node root) {
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
*/
