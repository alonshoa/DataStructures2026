/**
 * מחלקה המייצגת צומת ברשימה מקושרת.
 * @param <T> סוג המידע
 */
public class Node<T> {
    private T info;
    private Node<T> next;

    /**
     * מחזיר את המידע המאוחסן בצומת.
     * @return המידע בצומת
     */
    public T getInfo() {
        return info;
    }

    /**
     * משנה את המידע המאוחסן בצומת לערך חדש.
     * @param v הערך החדש להצבה
     */
    public void setInfo(T v) {
        this.info = v;
    }

    /**
     * מחזיר את הצומת הבא ברשימה.
     * @return הצומת הבא או null אם אין
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * מציב צומת הבא ברשימה.
     * @param n הצומת שיש להציב כאחריו
     */
    public void setNext(Node<T> n) {
        this.next = n;
    }

    /**
     * בודק אם קיים צומת נוסף אחריו.
     * @return אמת אם יש צומת הבא, אחרת שקר
     */
    public boolean hasNext() {
        return next != null;
    }
}
