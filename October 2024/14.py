class Solution:
    def getCount(self, head):
        if head is None:
            return 0
        return 1 + self.getCount(head.next)
