
// Definition for a QuadTree node.
/*class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};*/

/**
 * 如果4个节点一样，需要合并
 */
/*
public class Solution558 {
    public Node intersect(Node quadTree1, Node quadTree2) {
        if (quadTree1.isLeaf){
            return quadTree1.val?quadTree1:quadTree2;
        }
        if(quadTree2.isLeaf){
            return quadTree2.val?quadTree2:quadTree1;
        }
        Node topLeft=intersect(quadTree1.topLeft,quadTree2.topLeft);
        Node topRight=intersect(quadTree1.topRight,quadTree2.topRight);
        Node bottomRight=intersect(quadTree1.bottomRight,quadTree2.bottomRight);
        Node bottomLeft=intersect(quadTree1.bottomLeft,quadTree2.bottomLeft);
        if(topLeft.isLeaf&&topRight.isLeaf&&bottomLeft.isLeaf&&bottomRight.isLeaf
                &&topLeft.val==topRight.val
        &&topRight.val==bottomLeft.val&&bottomLeft.val==bottomRight.val){
            return new Node(topLeft.val,true,null,null,null,null);
        }
        return new Node(quadTree1.val|quadTree2.val,false,topLeft,topRight,bottomLeft,bottomRight);
    }
}*/
