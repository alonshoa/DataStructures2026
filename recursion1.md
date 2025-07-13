---
layout: default
title: "Recursion 1"
---

# מבוא לרקורסיה ובדיקת הבנת יסודות – תרגול פתיחה

מטרת התרגול: לבדוק שליטה ביסודות התכנות (if, for, while, משתנים, קריאות לפונקציות, פעולות סטטיות) תוך כדי כניסה לרקורסיה.

---

## שאלה 1 – רקורסיה בסיסית

```java
public static void recur(int x) {
    if (x <= 0)
        return;
    System.out.println(x);
    recur(x - 1);
}
```
