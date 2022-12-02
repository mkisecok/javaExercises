package kisecok.testproject;

import java.util.Arrays;

public class DemoArrayList extends AbstractDemoList {

    private Object[] values = new Object[10];

    private int nextElementIndex = 0;

    @Override
    public void add(Object obj) {

        values[nextElementIndex] = obj;
        nextElementIndex++;

        if (nextElementIndex == values.length) {
            values = Arrays.copyOf(values, (int) (values.length * 1.2));

            /*
            Object[] newValues = new Object[(int) (values.length * 1.2)];
            for (int i = 0; i < values.length; i++) {
                newValues[i] = values[i];
            }
            values = newValues;
             */
        }
    }

    @Override
    public Object get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        System.out.println("Array length: " + values.length);
        return nextElementIndex;
    }


}
