package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private SortedIntList list;
    private int counter;

    public DelegationSortedIntList() {
        this.list = new SortedIntList();
    }

    public boolean add(int num) {
        counter += 1;
        return list.add(num);
    }

    public boolean addAll(IntegerList mylist) {
        counter += mylist.size();
        return list.addAll(mylist);
    }

    public int get(int index) {
        return list.get(index);
    }

    public boolean remove(int num) {
        return list.remove(num);
    }

    public boolean removeAll(IntegerList list) {
        return list.removeAll(list);
    }

    public int size() {
        return list.size();
    }

    public int getTotalAdded() {
        return counter;
    }

}