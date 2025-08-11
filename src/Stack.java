/**
 * מחסנית גנרית המבוססת על רשימה מקושרת.
 * @param <T> סוג האיברים
 */
public class Stack<T> {
    private Node<T> top;
    private int gsize;

    /**
     * דוחף ערך חדש לראש המחסנית.
     * @param v הערך להוספה
     */
    public void push(T v) {
        Node<T> n = new Node<>();
        n.setInfo(v);
        n.setNext(top);
        top = n;
        gsize++;
    }

    /**
     * מוציא ומחזיר את הערך בראש המחסנית.
     * @return הערך בראש או null אם ריקה
     */
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T value = top.getInfo();
        top = top.getNext();
        gsize--;
        return value;
    }

    /**
     * מחזיר את הערך בראש המחסנית ללא הוצאה.
     * @return הערך בראש או null אם ריקה
     */
    public T peek() {
        return isEmpty() ? null : top.getInfo();
    }

    /**
     * בודק אם המחסנית ריקה.
     * @return אמת אם ריקה, אחרת שקר
     */
    public boolean isEmpty() {
        return gsize == 0;
    }
}
