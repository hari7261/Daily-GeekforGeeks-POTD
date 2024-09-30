class Solution {
    private void pushLeft(Node root, Stack<Node> stack) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        pushLeft(root1, s1);
        pushLeft(root2, s2);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (s2.isEmpty() || (!s1.isEmpty() && s1.peek().data <= s2.peek().data)) {
                Node node = s1.pop();
                result.add(node.data);
                pushLeft(node.right, s1);
            } else {
                Node node = s2.pop();
                result.add(node.data);
                pushLeft(node.right, s2);
            }
        }

        return result;
    }
}
