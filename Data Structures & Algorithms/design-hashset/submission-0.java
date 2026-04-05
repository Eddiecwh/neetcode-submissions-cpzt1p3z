class MyHashSet {
    List<Integer> mySet = new ArrayList<>();

    public MyHashSet() {
    }

    public void add(int key) {
        boolean isDuplicate = false;

        // if the list is empty, add the element
        if (mySet.isEmpty()) {
        mySet.add(key);
        } else {
        // if the list is not empty, iterate through the list to see if we have the
        // element
        for (Integer num : mySet) {
            // hash sets cant have duplicated
            if (num == key) {
            isDuplicate = true;
            break;
            }
        }

        if (!isDuplicate)
            mySet.add(key);

        }
    }

    public void remove(int key) {
        // cant remove on empty list so check list
        if (!mySet.isEmpty()) {
        // iterate through the list and remove the element
        if (mySet.contains(key)) {
            mySet.remove(mySet.indexOf(key));
        }
        }
    }

    public boolean contains(int key) {
        // as long as set is not empty
        if (!mySet.isEmpty()) {
        for (Integer item : mySet) {
            if (item == key)
            return true;
        }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */