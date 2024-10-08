class Solution {
    static Node construct(int[][] mat) {
        if (mat.length == 0 || mat[0].length == 0) return null;

        int n = mat.length; // Number of rows
        int m = mat[0].length; // Number of columns
        
        // Create a 2D array to hold the linked list nodes
        Node[][] nodes = new Node[n][m];

        // Create nodes for each element in the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nodes[i][j] = new Node(mat[i][j]);
            }
        }

        // Link nodes right and down
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Link the right node
                if (j + 1 < m) {
                    nodes[i][j].right = nodes[i][j + 1];
                }
                // Link the down node
                if (i + 1 < n) {
                    nodes[i][j].down = nodes[i + 1][j];
                }
            }
        }

        // Return the head of the linked list which is the top-left element
        return nodes[0][0];
    }
}
