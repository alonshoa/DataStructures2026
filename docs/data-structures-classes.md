# המחלקות ופעולות במבנה נתונים

## Node<T>
```java
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

```

## Stack<T>
```java
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

```

## Queue<T>
```java
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

```

## BinNode<T>
```java
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

```
