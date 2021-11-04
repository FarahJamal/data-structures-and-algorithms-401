package data;

public class HashNode <F,J>{
    public F getKey() {
        return key;
    }

    public void setKey(F key) {
        this.key = key;
    }

    public J getValue() {
        return value;
    }

    public void setValue(J value) {
        this.value = value;
    }

    public int getHashCode() {
        return hashCode;
    }

    public HashNode<F, J> getNext() {
        return next;
    }

    public void setNext(HashNode<F, J> next) {
        this.next = next;
    }

    F key;
    public J value;
    final int hashCode;
public HashNode<F,J> next;

    public HashNode(F key, J value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}
