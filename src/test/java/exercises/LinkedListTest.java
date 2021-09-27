package exercises;

import exercises.implementations.LinkedList;

public class LinkedListTest extends AbstractListTest{

    @Override
    protected List getNewList() {
        return new LinkedList();
    }
}
