/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {    
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node,Node> mp = new HashMap<>();
        return clone(node,mp);
    }
    public Node clone(Node node,HashMap<Node,Node> mp){
        Node newnode  = new Node(node.val);
        mp.put(node,newnode);
        for(Node ni : node.neighbors){
            if(!mp.containsKey(ni)){
                newnode.neighbors.add(clone(ni,mp));
            }
            else{
                newnode.neighbors.add(mp.get(ni));
            }
        }
        return newnode;
    }
}