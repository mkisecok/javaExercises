package kisecok.testproject;

import java.util.ArrayList;
import java.util.Optional;

interface  DemoList {


    public void add(Object obj);

    public Object get(int index);

    public int size();

    public Optional<Object> get(Object obj);

}
