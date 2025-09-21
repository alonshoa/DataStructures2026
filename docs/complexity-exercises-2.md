
### 1) כפול מלא

```java
for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
    // work O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** n·n איטרציות ⇒ Θ(n²) ⇒ **O(n²)**.

</details>
---

### 2) משולש עליון

```java
for (int i = 0; i < n; i++) {
  for (int j = i; j < n; j++) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>
**פתרון:** סכום n + (n−1) + … + 1 = n(n+1)/2 ⇒ Θ(n²) ⇒ **O(n²)**.
</details>
---

### 3) חיצוני גיאומטרי, פנימי לינארי

```java
for (int i = 1; i < n; i *= 2) {
  for (int j = 0; j < n; j++) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** לולאה חיצונית ≈ ⌊log₂ n⌋ פעמים ⇒ n·log n ⇒ **O(n log n)**.

</details>

---

### 4) חיצוני לינארי, פנימי לוגריתמי

```java
for (int i = 0; i < n; i++) {
  for (int j = 1; j < n; j *= 2) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** כל איטרציית i עושה ≈ log n ⇒ n·log n ⇒ **O(n log n)**.
</details>
---

### 5) שלוש לולאות מלאות

```java
for (int i = 0; i < n; i++)
  for (int j = 0; j < n; j++)
    for (int k = 0; k < n; k++) {
      // O(1)
    }
```
<details markdown="1"><summary>פתרון</summary>
**פתרון:** n³ ⇒ Θ(n³) ⇒ **O(n³)**.
</details>
---

### 6) משולש תחתון (0..i)

```java
for (int i = 0; i < n; i++) {
  for (int j = 0; j <= i; j++) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** סכום 1+2+…+n = n(n+1)/2 ⇒ Θ(n²) ⇒ **O(n²)**.

</details>
---

### 7) חיצוני מתחלק ב-2, פנימי תלוי i

```java
for (int i = n; i > 0; i /= 2) {
  for (int j = 0; j < i; j++) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>
**פתרון:** סכום n + n/2 + n/4 + … < 2n ⇒ Θ(n) ⇒ **O(n)**.
</details>
---

### 8) פנימי n/i (הרמוני)

```java
for (int i = 1; i <= n; i++) {
  for (int j = 1; j <= n / i; j++) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** סכום\_{i=1..n} (n/i) = n·Hₙ ≈ n·log n ⇒ **O(n log n)**.
</details>
---

### 9) לוגריתמי כפול

```java
for (int i = 1; i <= n; i *= 2) {
  for (int j = 1; j <= i; j *= 2) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** עבור i=2^t, הפנימי ≈ t+1; סכום t מ-0..log n ⇒ ≈ (log n)(log n)/2 ⇒ **O((log n)²)**.
</details>
---

### 10) break שמייצר משולש

```java
for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
    if (j > i) break;
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** כל שורה רצה עד j=i ⇒ סכום 1+2+…+n ⇒ Θ(n²) ⇒ **O(n²)**.
</details>
---

### 11) פנימי מכפיל עד חציית n (סכום לוגים מתבטל)

```java
for (int i = 1; i <= n; i++) {
  int j = i;
  while (j < n) {
    j *= 2;
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** לכל i יש ≈ log(n/i) צעדים; סכום log(n)−log(i) מתלכד ל-Θ(n) ⇒ **O(n)**.
</details>
---

### 12) continue שלא משנה סדר גודל

```java
for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
    if (j % 2 == 0) continue; // מדלג על חצי מהמקרים
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** \~n·(n/2) ⇒ Θ(n²) ⇒ **O(n²)**.
</details>
---

### 13) while פנימי לוגריתמי מתאפס כל פעם

```java
for (int i = 0; i < n; i++) {
  int j = n;
  while (j > 0) {
    j /= 2;
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** פנימי ≈ log n; חיצוני n פעמים ⇒ **O(n log n)**.
</details>
---

### 14) קפיצות בגודל i+1

```java
for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j += (i + 1)) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** לכל i יש ≈ n/(i+1) צעדים; סכום הרמוני ⇒ n·Hₙ ⇒ **O(n log n)**.
</details>
---

### 15) פירמידה תלת-שלבית

```java
for (int i = 0; i < n; i++) {
  for (int j = 0; j <= i; j++) {
    for (int k = 0; k <= j; k++) {
      // O(1)
    }
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** סכום\_{i} (i(i+1)/2) ≈ n³/6 ⇒ Θ(n³) ⇒ **O(n³)**.
</details>
---

### 16) חיצוני בחזקות של 3, פנימי עד i

```java
for (int i = 1; i <= n; i *= 3) {
  for (int j = 0; j < i; j++) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** סכום 1+3+9+… ≤ 2n ⇒ Θ(n) ⇒ **O(n)**.
</details>
---

### 17) פנימי עד √i

```java
for (int i = 1; i <= n; i++) {
  for (int j = 1; j * j <= i; j++) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** סכום\_{i=1..n} ⌊√i⌋ ≈ (2/3)n^{3/2} ⇒ **O(n^{3/2})**.
</details>
---

### 18) דילוגים לפי מחלקים (קלאסי של סכום הרמוני)

```java
for (int i = 1; i <= n; i++) {
  for (int j = i; j <= n; j += i) {
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** לכל i יש ≈ n/i צעדים ⇒ n·Hₙ ⇒ **O(n log n)**.
</details>
---

### 19) פנימי מחצה את j שמתחיל מ-i

```java
for (int i = 1; i <= n; i++) {
  int j = i;
  while (j > 0) {
    j /= 2;
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** לכל i ≈ log i; סכום לוגים = Θ(n log n) ⇒ **O(n log n)**.
</details>
---

### 20) פנימי נעצר מוקדם בתנאי תלוי i

```java
for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
    if (j * j > i) break;
    // O(1)
  }
}
```
<details markdown="1"><summary>פתרון</summary>

**פתרון:** לכל i פנימי רץ עד j ≈ √i ⇒ סכום √i מ-0..n-1 ≈ (2/3)n^{3/2} ⇒ **O(n^{3/2})**.
</details>
