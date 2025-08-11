/**
 * צומת בעץ בינארי.
 * @param <T> סוג הערך
 */
public class BinNode<T> {
    private T value;
    private BinNode<T> left;
    private BinNode<T> right;

    /**
     * מחזיר את הערך המאוחסן בצומת.
     * @return הערך בצומת
     */
    public T getValue() {
        return value;
    }

    /**
     * מציב ערך חדש בצומת.
     * @param v הערך להצבה
     */
    public void setValue(T v) {
        this.value = v;
    }

    /**
     * מחזיר את הבן השמאלי.
     * @return הבן השמאלי או null אם אין
     */
    public BinNode<T> getLeft() {
        return left;
    }

    /**
     * מציב בן שמאלי לצומת.
     * @param n הצומת להצבה כבן שמאלי
     */
    public void setLeft(BinNode<T> n) {
        this.left = n;
    }

    /**
     * מחזיר את הבן הימני.
     * @return הבן הימני או null אם אין
     */
    public BinNode<T> getRight() {
        return right;
    }

    /**
     * מציב בן ימני לצומת.
     * @param n הצומת להצבה כבן ימני
     */
    public void setRight(BinNode<T> n) {
        this.right = n;
    }

    /**
     * בודק אם יש בן שמאלי.
     * @return אמת אם יש בן שמאלי, אחרת שקר
     */
    public boolean hasLeft() {
        return left != null;
    }

    /**
     * בודק אם יש בן ימני.
     * @return אמת אם יש בן ימני, אחרת שקר
     */
    public boolean hasRight() {
        return right != null;
    }
}
