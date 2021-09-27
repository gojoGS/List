package exercises;

import exercises.implementations.ArrayList;

public class ArrayListTest extends AbstractListTest{

    @Override
    protected List getNewList() {
        return new ArrayList();
    }
}
