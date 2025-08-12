---
layout: default
title: "Complexity Exercises"
---

# 🧠 תרגילי סיבוכיות

להלן מספר שאלות לבדיקת הבנה של סיבוכיות חישובית. לכל שאלה בחר את התשובה המתאימה מבין: `O(1)`, `O(n)`, `O(n*m)`, `O(n^2)`, `O(log n)`.

## 1) לולאה בודדת
**קוד:**
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
<details markdown="1"><summary>פתרון</summary>
**סיבוכיות:** `O(n)`
</details>

---

## 2) גישה יחידה למערך
**קוד:**
```java
int x = arr[0];
System.out.println(x);
```
<details markdown="1"><summary>פתרון</summary>
**סיבוכיות:** `O(1)`
</details>

---

## 3) לולאה כפולה
**קוד:**
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);
    }
}
```
<details markdown="1"><summary>פתרון</summary>
**סיבוכיות:** `O(n^2)`
</details>

---

## 4) לולאה עם שני פרמטרים
**קוד:**
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        System.out.println(i + j);
    }
}
```
<details markdown="1"><summary>פתרון</summary>
**סיבוכיות:** `O(n*m)`
</details>

---

## 5) חלוקה בחצי בכל צעד
**קוד:**
```java
int i = n;
while (i > 1) {
    i = i / 2;
}
```
<details markdown="1"><summary>פתרון</summary>
**סיבוכיות:** `O(log n)`
</details>

