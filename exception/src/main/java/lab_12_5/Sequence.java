package lab_12_5;

public class Sequence {
    private Object[] items;
    int next = 0;
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object el){
        if(next < items.length){
            items[next++] = el;
        } else  {
            throw new IndexOutOfBoundsException();
        }
    }

    public class SequenceSelector implements Selector {
        private int i = 0;
        public Object current() { return items[i]; }
        public boolean end() { return items.length == i; }
        public void next() { if (i < items.length) i++; }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 15; i++) {
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}