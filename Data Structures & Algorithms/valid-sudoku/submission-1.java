class Solution {
    public boolean isValidSudoku(char[][] board) {
        // each row must contain the digits 1-9 w/o dupes
        // each column must contain the digits 1-9 w/o dupes
        // each of cubes (3x3) must have 1-9 without dupes

        // loop through each row of the array look for dupes
        for (int row = 0; row < 9; row++) {
            Set<Character> dupeSet = new HashSet<>();

            for (int col = 0; col < 9; col++) {
                char currentItem = board[row][col];

                if (currentItem == '.') continue;

                if (dupeSet.contains(currentItem)) {
                    return false;
                } else {
                    dupeSet.add(currentItem);
                }
            }
        }

        // loop through each row of the array look for dupes
        for (int col = 0; col < 9; col++) {
            Set<Character> dupeSet = new HashSet<>();

            for (int row = 0; row < 9; row++) {
                char currentItem = board[row][col];
                
                if (currentItem == '.') continue;

                if (dupeSet.contains(currentItem)) {
                    return false;
                } else {
                    dupeSet.add(currentItem);
                }
            }
        }

        List<HashSet<Character>> setList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            setList.add(new HashSet<>());
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char currentElement = board[row][col];

                if (currentElement == '.') continue;
    
                int boxNo = (row/3)*3 + (col/3);

                if (setList.get(boxNo).contains(currentElement)) {
                    return false;
                } else {
                    setList.get(boxNo).add(currentElement);
                }
            }
        }

        return true;
    }
}
