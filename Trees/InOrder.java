public static void inOrder(Node root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

/* iterative

public static void inOrder(Node root) {
        if(root == null) return;
        Stack<Node> s = new Stack<>();
        List<Integer> result = new ArrayList<>();
        Node curr = root;
        while(!s.isEmpty() || curr != null){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            result.add(curr.data);
            curr = curr.right;
        }
        for(int i:result){
            System.out.print(i+" ");
        }
    }
 */
