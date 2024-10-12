class Solution {
    public void deleteAlt(Node head) {
        // Initialize current node as head
        Node current = head;
        
        // Traverse the list
        while (current != null && current.next != null) {
            // Get the next node (alternate node to be deleted)
            Node next_node = current.next;
            
            // Skip the alternate node by linking current to next of next_node
            current.next = next_node.next;
            
            // Move current to the next node
            current = current.next;
        }
    }
}
