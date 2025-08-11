---
layout: default
title: "Recursion Exercises"
---

# 🧠 תרגילי רקורסיה

להלן 15 תרגילים קלאסיים ברקורסיה. בכל תרגיל מופיעים שם השאלה, נושא, דרישות למימוש, מימוש ובדיקות.

## 1) הדפסת מספרים מ־1 עד n

**נושא:** תנאי עצירה ועלייה מרקורסיה  
**דרישות למימוש:** פונקציה רקורסיבית שמדפיסה 1..n בסדר עולה. תנאי עצירה כש־n=0.

<details markdown="1"><summary>פתרון</summary>

**מימוש:**

```java
public class RecPrintUp {
    public static void printUp(int n) {
        if (n <= 0) return;        // תנאי עצירה
        printUp(n - 1);            // קודם פותרים לתת-בעיה
        System.out.print(n + " "); // הדפסה בעלייה חזרה
    }
}
```

**בדיקות:**

- `printUp(5)` → `1 2 3 4 5 `
- `printUp(1)` → `1 `
- `printUp(0)` → `` (כלום)

</details>

---

## 2) הדפסת מספרים מ־n עד 1

**נושא:** סדר קריאה לפני/אחרי הרקורסיה  
**דרישות למימוש:** הדפסה יורדת n..1.

<details markdown="1"><summary>פתרון</summary>

**מימוש:**

```java
public class RecPrintDown {
    public static void printDown(int n) {
        if (n <= 0) return;
        System.out.print(n + " "); // הדפסה בירידה
        printDown(n - 1);
    }
}
```

**בדיקות:**

- `printDown(5)` → `5 4 3 2 1 `

</details>

---

## 3) סכום 1..n

**נושא:** החזרת ערך מרקורסיה  
**דרישות למימוש:** להחזיר סכום שלם.

<details markdown="1"><summary>פתרון</summary>

**מימוש:**

```java
public class RecSum {
    public static int sumToN(int n) {
        if (n <= 0) return 0;
        return n + sumToN(n - 1);
    }
}
```

**בדיקות:**

- `sumToN(5)` → `15`
- `sumToN(1)` → `1`
- `sumToN(0)` → `0`

</details>

---

## 4) חזקה a^b

**נושא:** פירוק בעיה תלוית פרמטר  
**דרישות למימוש:** לחשב a בחזקת b (b≥0).

<details markdown="1"><summary>פתרון</summary>

**מימוש (פשוט):**

```java
public class RecPow {
    public static long pow(long a, int b) {
        if (b == 0) return 1;
        return a * pow(a, b - 1);
    }
}
```

**בדיקות:**

- `pow(2,10)` → `1024`
- `pow(5,0)` → `1`

</details>

---

## 5) היפוך מחרוזת

**נושא:** רקורסיה על תת־מחרוזת  
**דרישות למימוש:** לקבל מחרוזת ולהחזיר הפוכה.

<details markdown="1"><summary>פתרון</summary>


**מימוש:**

```java
public class RecReverseString {
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
```

**בדיקות:**

- `reverse("abcd")` → `"dcba"`
- `reverse("a")` → `"a"`
- `reverse("")` → `""`

</details>

---

## 6) בדיקת פלינדרום

**נושא:** שתי הצבעות מהקצוות  
**דרישות למימוש:** להחזיר true אם מחרוזת נקראת אותו דבר משני הצדדים.

<details markdown="1"><summary>פתרון</summary>


**מימוש:**

```java
public class RecPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        return helper(s, 0, s.length() - 1);
    }

    private static boolean helper(String s, int l, int r) {
        if (l >= r) return true;                 // עברנו את האמצע
        if (s.charAt(l) != s.charAt(r)) return false;
        return helper(s, l + 1, r - 1);
    }
}
```

**בדיקות:**

- `isPalindrome("abba")` → `true`
- `isPalindrome("abc")` → `false`
- `isPalindrome("")` → `true`

</details>

---

## 7) סכום איברי מערך

**נושא:** עבודה עם אינדקס רץ  
**דרישות למימוש:** סכום כל איברי int[].

<details markdown="1"><summary>פתרון</summary>


**מימוש:**

```java
public class RecArraySum {
    public static int sum(int[] a) {
        return sum(a, 0);
    }

    private static int sum(int[] a, int i) {
        if (a == null || i >= a.length) return 0;
        return a[i] + sum(a, i + 1);
    }
}
```

**בדיקות:**

- `sum(new int[]{1,2,3})` → `6`
- `sum(new int[]{})` → `0`

</details>

---

## 8) חיפוש איבר במערך

**נושא:** בסיסי: האם קיים  
**דרישות למימוש:** להחזיר true אם מספר קיים במערך.


<details markdown="1"><summary>פתרון</summary>

**מימוש:**

```java
public class RecContains {
    public static boolean contains(int[] a, int target) {
        return contains(a, target, 0);
    }

    private static boolean contains(int[] a, int target, int i) {
        if (a == null || i >= a.length) return false;
        if (a[i] == target) return true;
        return contains(a, target, i + 1);
    }
}
```

**בדיקות:**

- `contains([1,4,7], 4)` → `true`
- `contains([1,4,7], 3)` → `false`

</details>

---

## 9) פיבונאצ׳י (רקורסיה כפולה)

**נושא:** רקורסיה שאינה זנבית, עלות גבוהה  
**דרישות למימוש:** להחזיר F(n) עם F(0)=0, F(1)=1.

<details markdown="1"><summary>פתרון</summary>

**מימוש:**

```java
public class RecFibo {
    public static long fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
```

> הערה: איטי ל־n גדול. בכיתה אפשר להזכיר מזכר (memoization).

**בדיקות:**

- `fib(0)` → `0`
- `fib(1)` → `1`
- `fib(6)` → `8`

</details>

---

## 10) עצרת (n!)

**נושא:** תנאי עצירה ברור  
**דרישות למימוש:** n! עבור n≥0.

<details markdown="1"><summary>פתרון</summary>


**מימוש:**

```java
public class RecFactorial {
    public static long fact(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }
}
```

**בדיקות:**

- `fact(0)` → `1`
- `fact(5)` → `120`

</details>

---

## 11) סכום ספרות במספר

**נושא:** פירוק בעזרת חילוק/מודולו  
**דרישות למימוש:** סכום הספרות ב־n לא שלילי.

<details markdown="1"><summary>פתרון</summary>

**מימוש:**

```java
public class RecDigitSum {
    public static int digitSum(int n) {
        n = Math.abs(n);
        if (n < 10) return n;
        return (n % 10) + digitSum(n / 10);
    }
}
```

**בדיקות:**

- `digitSum(1234)` → `10`
- `digitSum(0)` → `0`

</details>

---

## 12) יצירת כל המחרוזות הבינאריות באורך n

**נושא:** בניית עץ החלטות (0/1)  
**דרישות למימוש:** להדפיס את כל המחרוזות באורך n.

<details markdown="1"><summary>פתרון</summary>

**מימוש:**

```java
import java.util.*;

public class RecBinaryStrings {
    public static List<String> allBinary(int n) {
        List<String> res = new ArrayList<>();
        build(n, new StringBuilder(), res);
        return res;
    }

    private static void build(int n, StringBuilder sb, List<String> res) {
        if (sb.length() == n) {
            res.add(sb.toString());
            return;
        }
        sb.append('0');
        build(n, sb, res);
        sb.setLength(sb.length() - 1);

        sb.append('1');
        build(n, sb, res);
        sb.setLength(sb.length() - 1);
    }
}
```

**בדיקות:**

- `allBinary(2)` → `["00","01","10","11"]`
- `allBinary(0)` → `[""]` (מחרוזת ריקה אחת)

</details>

---

## 13) מבוך (Maze) – מציאת מסלול

**נושא:** Backtracking עם סימון ביקור  
**דרישות למימוש:** קלט מטריצה (`0` דרך, `1` קיר); התחלה `(sr,sc)` ויציאה `(tr,tc)`. להחזיר רשימת צעדים או מסלול אפשרי.

<details markdown="1"><summary>פתרון</summary>

**מימוש:**

```java
import java.util.*;

public class RecMaze {
    static class Cell { int r,c; Cell(int r,int c){this.r=r;this.c=c;} }

    public static List<Cell> findPath(int[][] grid, int sr, int sc, int tr, int tc) {
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        List<Cell> path = new ArrayList<>();
        if (dfs(grid, sr, sc, tr, tc, vis, path)) return path;
        return Collections.emptyList();
    }

    private static boolean dfs(int[][] g, int r, int c, int tr, int tc,
                               boolean[][] vis, List<Cell> path) {
        int n = g.length, m = g[0].length;
        if (r < 0 || r >= n || c < 0 || c >= m) return false;
        if (g[r][c] == 1 || vis[r][c]) return false;

        path.add(new Cell(r,c));
        vis[r][c] = true;

        if (r == tr && c == tc) return true;

        // ארבעה כיוונים: למטה, למעלה, ימינה, שמאלה
        if (dfs(g, r+1, c, tr, tc, vis, path)) return true;
        if (dfs(g, r-1, c, tr, tc, vis, path)) return true;
        if (dfs(g, r, c+1, tr, tc, vis, path)) return true;
        if (dfs(g, r, c-1, tr, tc, vis, path)) return true;

        // חזרה אחורה
        path.remove(path.size()-1);
        return false;
    }
}
```

**בדיקות:**

- עבור
  ```
  0 0 1
  1 0 0
  0 0 0
  ```
  `findPath(grid, 0,0, 2,2)` → רשימת תאים מהתחלה ליציאה (לא ריקה).
- אם היציאה חסומה בקירות → רשימה ריקה.

</details>

---

## 14) כל תתי־הקבוצות (Power Set)

**נושא:** בחירה/אי־בחירה לכל איבר  
**דרישות למימוש:** לקלוט מערך/רשימה ולהחזיר כל תתי־הקבוצות.

<details markdown="1"><summary>פתרון</summary>

**מימוש:**

```java
import java.util.*;

public class RecSubsets {
    public static <T> List<List<T>> subsets(List<T> arr) {
        List<List<T>> res = new ArrayList<>();
        backtrack(arr, 0, new ArrayList<>(), res);
        return res;
    }

    private static <T> void backtrack(List<T> arr, int i, List<T> cur, List<List<T>> res) {
        if (i == arr.size()) {
            res.add(new ArrayList<>(cur));
            return;
        }
        // בלי האיבר
        backtrack(arr, i + 1, cur, res);
        // עם האיבר
        cur.add(arr.get(i));
        backtrack(arr, i + 1, cur, res);
        cur.remove(cur.size() - 1);
    }
}
```

**בדיקות:**

- `[1,2]` → `[], [1], [2], [1,2]` (סדר יכול להשתנות)

</details>

---

## 15) היפוך רשימה מקושרת

**נושא:** מצביעים וקריאה חוזרת  
**דרישות למימוש:** מחלקת `Node<T>` בסיסית, פונקציה שמחזירה ראש חדש הפוך.

<details markdown="1"><summary>פתרון</summary>

**מימוש:**

```java
public class RecReverseList {
    public static class Node<T> {
        public T info;
        public Node<T> next;
        public Node(T info) { this.info = info; }
    }

    public static <T> Node<T> reverse(Node<T> head) {
        if (head == null || head.next == null) return head;
        Node<T> newHead = reverse(head.next); // הופך את השאר
        head.next.next = head;                // מצביע לאחור
        head.next = null;                     // מסיים קשר קדימה
        return newHead;
    }
}
```

**בדיקות:**

- רשימה `1→2→3→null` → אחרי `reverse` מקבלים `3→2→1→null`
- רשימה ריקה/איבר יחיד → זהה לקלט

</details>

---

