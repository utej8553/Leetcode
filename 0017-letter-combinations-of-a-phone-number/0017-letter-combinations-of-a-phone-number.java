class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        
        Map<Character, String> phoneMap = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
        );
        
        List<String> result = new ArrayList<>();
        backtrack(result, phoneMap, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, Map<Character, String> phoneMap, 
                           String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phoneMap.get(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, phoneMap, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
