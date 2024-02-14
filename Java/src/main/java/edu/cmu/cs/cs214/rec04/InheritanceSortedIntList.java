package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation
    private int counter;

    @Override
    public boolean add(int num) {
        counter += 1;
        return super.add(num);
    }

    /*
     * In AbstractIntList, the addAll() use add() repeatedly,
     * so I don't need to increase the counter here, because I have already increase
     * it in this.add()
     */
    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }

    public int getTotalAdded() {
        return counter;
    }
}