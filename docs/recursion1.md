---
layout: default
title: "Recursion 1"
---

# 🧠 רקורסיה: חשיבה מחדש על קריאות לפונקציה
### שיעור פתיחה – חלק 1 מתוך 2

---

# מבוא לרקורסיה ובדיקת הבנת יסודות – תרגול פתיחה

מטרת התרגול: לבדוק שליטה ביסודות התכנות (if, for, while, משתנים, קריאות לפונקציות, פעולות סטטיות) תוך כדי כניסה לרקורסיה.

---

<div style="width:100px;height:100px;background:red;animation:spin 2s linear infinite;"></div>
<style>
@keyframes spin {
  from { transform: rotate(0deg); }
  to { transform: rotate(360deg); }
}
</style>

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
