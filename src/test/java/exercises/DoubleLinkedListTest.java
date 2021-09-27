package exercises;

import exercises.implementations.DoubleLinkedList;

public class DoubleLinkedListTest extends AbstractListTest{
    @Override
    protected List getNewList() {
        return new DoubleLinkedList();
    }
}
