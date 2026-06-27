class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        ArrayList<ListNode> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            list.get(left).next = list.get(right);
            left++;

            if (left == right)
                break;

            list.get(right).next = list.get(left);
            right--;
        }

        list.get(left).next = null;
    }
}