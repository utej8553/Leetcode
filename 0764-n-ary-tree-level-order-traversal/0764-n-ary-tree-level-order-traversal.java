/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> l1 = new ArrayList<>();
            while(size>0){
                Node node = queue.poll();
                l1.add(node.val);
                for(Node child: node.children){
                    if(child!=null){
                        queue.offer(child);
                    }
                }
            size--;
            }
            l.add(l1);
        }
        return l;
    }
}