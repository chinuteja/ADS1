
public class LinearProbingHashST<Key, Value> {
    private int m = 100;
    private Value[] values = new Value[m];
    private Key[] keys = new Key[m];
    public void put(Key key, Value value) {
        int i;
        for (i = hash(key);keys[i] !=null;i = (i+1)%m ) {
            if (keys[i].equals(key)) {
                break;
            }
           keys[i] = key;
           values[i] = value;
        }
    }
}
