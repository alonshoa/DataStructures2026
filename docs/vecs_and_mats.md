    <script type="text/javascript" async
      src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js">
    </script>

    <script type="text/x-mathjax-config">
      MathJax.Hub.Config({
        tex2jax: {
          inlineMath: [['$','$'], ['\\(','\\)']],
          displayMath: [['$$','$$'], ['\\[','\\]']],
          processEscapes: true
        }
      });
    </script>
    

# 📘 מבוא לוקטורים ומטריצות

## 🎯 מטרות הלמידה
- להבין מה זה **וקטור** ומה זה **מטריצה**.  
- לראות איך מערכת משוואות לינאריות ניתנת לכתיבה בשפת מטריצות ווקטורים.  
- ללמוד לפתור מערכת כזו בשתי דרכים:  
  1. פתרון "רגיל" עם אלגברה.  
  2. פתרון באמצעות מטריצות.  

---

## חלק א – מערכת משוואות פשוטה

נתחיל עם מערכת בת שני נעלמים:

\[
2x + 3y = 8 \\
x - y = 2
\]

המטרה שלנו: למצוא את הערכים של $x$ ו-$y$ שמתאימים לשתי המשוואות.

---

## חלק ב – פתרון אלגברי רגיל

### שלב 1 – בידוד משתנה
מהמשוואה השנייה:

$$
x - y = 2 \quad \Rightarrow \quad x = y + 2
$$

### שלב 2 – הצבה
נכניס את $x = y+2$ למשוואה הראשונה:

$$
2(y+2) + 3y = 8
$$

### שלב 3 – פישוט
$$
2y + 4 + 3y = 8
$$

$$
5y + 4 = 8
$$

### שלב 4 – פתרון ל־$y$
$$
5y = 4 \quad \Rightarrow \quad y = \tfrac{4}{5}
$$

### שלב 5 – מציאת $x$
$$
x = y + 2 = \tfrac{4}{5} + 2 = \tfrac{14}{5}
$$

✅ **תוצאה:**  
$$
(x, y) = \left(\tfrac{14}{5}, \tfrac{4}{5}\right)
$$

---

## חלק ג – מעבר לשפת מטריצות ווקטורים

במקום לכתוב מערכת משוואות ארוכה, אפשר לארוז הכל **בצורה קומפקטית**:

$$
\underbrace{\begin{bmatrix}
2 & 3 \\
1 & -1
\end{bmatrix}}_{\text{מקדמים}}
\cdot
\underbrace{\begin{bmatrix}
x \\ y
\end{bmatrix}}_{\text{משתנים}}
=
\underbrace{\begin{bmatrix}
8 \\ 2
\end{bmatrix}}_{\text{תוצאות}}
$$

או בקיצור:

$$
A \cdot \vec{x} = \vec{b}
$$

---

## חלק ד – פתרון בעזרת מטריצות

### שלב 1 – הגדרה
$$
A = \begin{bmatrix} 2 & 3 \\ 1 & -1 \end{bmatrix}, 
\quad
\vec{x} = \begin{bmatrix} x \\ y \end{bmatrix},
\quad
\vec{b} = \begin{bmatrix} 8 \\ 2 \end{bmatrix}
$$

### שלב 2 – הרעיון
כדי לפתור עבור $\vec{x}$, נכפיל ב־$A^{-1}$ (המטריצה ההפוכה של $A$):

$$
A \vec{x} = \vec{b}
\quad \Rightarrow \quad
\vec{x} = A^{-1}\vec{b}
$$

### שלב 3 – חישוב $A^{-1}$

למטריצה בגודל $2 \times 2$:

$$
A^{-1} = \frac{1}{ad-bc}\begin{bmatrix} d & -b \\ -c & a \end{bmatrix}
$$

במקרה שלנו:

$$
A = \begin{bmatrix} 2 & 3 \\ 1 & -1 \end{bmatrix}
$$

- $a=2, b=3, c=1, d=-1$  
- הדטרמיננטה:  
$$
\det(A) = ad - bc = (2 \cdot -1) - (3 \cdot 1) = -2 - 3 = -5
$$

אז:

$$
A^{-1} = \frac{1}{-5}\begin{bmatrix} -1 & -3 \\ -1 & 2 \end{bmatrix}
= 
\begin{bmatrix}
\tfrac{1}{5} & \tfrac{3}{5} \\
\tfrac{1}{5} & -\tfrac{2}{5}
\end{bmatrix}
$$

### שלב 4 – חישוב $\vec{x} = A^{-1}\vec{b}$

$$
\vec{x} =
\begin{bmatrix}
\tfrac{1}{5} & \tfrac{3}{5} \\
\tfrac{1}{5} & -\tfrac{2}{5}
\end{bmatrix}
\cdot
\begin{bmatrix}
8 \\ 2
\end{bmatrix}
$$

חישוב רכיבים:

- $x = \tfrac{1}{5}\cdot 8 + \tfrac{3}{5}\cdot 2 = \tfrac{8}{5} + \tfrac{6}{5} = \tfrac{14}{5}$  
- $y = \tfrac{1}{5}\cdot 8 + (-\tfrac{2}{5})\cdot 2 = \tfrac{8}{5} - \tfrac{4}{5} = \tfrac{4}{5}$

### שלב 5 – תוצאה
$$
\vec{x} =
\begin{bmatrix}
\tfrac{14}{5} \\
 \tfrac{4}{5}
\end{bmatrix}
$$

זו בדיוק אותה תוצאה שקיבלנו בשיטה הרגילה.

---

## חלק ה – סיכום

- **וקטור** = רשימה מסודרת של מספרים (או חץ במרחב).  
- **מטריצה** = טבלה של מספרים (או אוסף וקטורים/פעולה על וקטורים).  
- **מערכת משוואות לינאריות** אפשר לכתוב בצורה קומפקטית:  
  $$
  A \vec{x} = \vec{b}
  $$
- **פתרון** מתקבל על ידי חישוב ההפוכה של $A$ (כאשר היא קיימת):  
  $$
  \vec{x} = A^{-1}\vec{b}
  $$

---

✍️ **תרגול לתלמידים**  
1. פתרו את המערכת:  
   $$
   3x + 2y = 7 \\
   2x - y = 4
   $$  
   גם בדרך הרגילה וגם בשפת מטריצות.  

2. מצאו את הדטרמיננטה של המטריצה:  
   $$
   \begin{bmatrix} 4 & 1 \\ 2 & 3 \end{bmatrix}
   $$  
   והחליטו האם יש לה הפוכה.
