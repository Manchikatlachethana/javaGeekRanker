/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
        class Queueobj{
            Node node;
            int data;
            Queueobj(Node node,int data){
                this.node = node;
                this.data = data;
            }
        }
        Queue<Queueobj> q = new LinkedList<Queueobj>();
        Map<Integer, Node> m = new TreeMap<Integer, Node>();
        if(root == null)
        return;
        else{
            q.add(new Queueobj(root,0));
        }
        while(!q.isEmpty()){
            Queueobj tmp = q.poll();
            if(!m.containsKey(tmp.data)){
                m.put(tmp.data, tmp.node);
            }
            if(tmp.node.left != null){
                q.add(new Queueobj(tmp.node.left, tmp.data-1));
            }
            if(tmp.node.right != null){
                q.add(new Queueobj(tmp.node.right, tmp.data+1));
            }
        }
        for(Map.Entry<Integer, Node> m1:m.entrySet()){
            System.out.print(m1.getValue().data+" ");
        }
      
    }
