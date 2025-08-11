/**
 * תור גנרי המבוסס על רשימה מקושרת.
 * @param <T> סוג האיברים
 */
public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    /**
     * מכניס ערך לסוף התור.
     * @param v הערך להוספה
     */
    public void insert(T v) {
        Node<T> n = new Node<>();
        n.setInfo(v);
        if (isEmpty()) {
            head = tail = n;
        } else {
            tail.setNext(n);
            tail = n;
        }
    }

    /**
     * מוציא ומחזיר את הערך מראש התור.
     * @return הערך בראש או null אם התור ריק
     */
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T value = head.getInfo();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        return value;
    }

    /**
     * מחזיר את הערך בראש התור ללא הוצאה.
     * @return הערך בראש או null אם התור ריק
     */
    public T head() {
        return isEmpty() ? null : head.getInfo();
    }

    /**
     * בודק אם התור ריק.
     * @return אמת אם התור ריק, אחרת שקר
     */
    public boolean isEmpty() {
        return head == null;
    }
}
