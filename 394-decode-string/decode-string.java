class Solution {
    public String decodeString(String s) {
        Stack<Integer> countstack = new Stack<>();
        Stack<String> Stringstack = new Stack<>();
        String current = "";
        int number = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '[') {
                countstack.push(number);
                Stringstack.push(current);
                current = "";
                number = 0;

            } else if (ch == ']') {
                int count = countstack.pop();
                String previous = Stringstack.pop();
                StringBuilder temp = new StringBuilder(previous);
                for (int i = 0; i < count; i++) {
                    temp.append(current);

                }
                current = temp.toString();

            } else {
                current += ch;

            }

        }
        return current;

    }
}