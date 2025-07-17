# 🧭 הרפתקת הרקורסיה עם אינדיאנה ג'ונס – מבוא לרקורסיה מונחית עצמים

בפרויקט הזה נלמד על סוגים שונים של רקורסיה, דרך סיפור על אינדיאנה ג'ונס.  
כל סוג רקורסיה מיוצג דרך מחלקות פשוטות ב־Java – ללא צורך בהיכרות מוקדמת עם רשימות או תורים.

---

## 🎯 מטרות הלמידה
- להבין את רעיון הרקורסיה דרך סיפור.
- להכיר 3 סוגים של רקורסיה:
  - רקורסיה רגילה (Top-Down)
  - רקורסיה עם פעולה בדרך חזרה (Bottom-Up)
  - רקורסיה זנבית (Tail Recursion)
- לכתוב ולהריץ קוד מונחה עצמים עם קריאות רקורסיביות.

---

## 🏛️ חלק 1 – אינדיאנה ג'ונס במקדש החדרים (Top-Down Recursion)

### הסיפור:
> אינדיאנה נכנס למקדש. בכל חדר יש דלת אחת לחדר הבא.  
> הוא הולך עד שמגיע לחדר האחרון, ואז **חוזר אחורה** ופותח חידות.

### הקוד:

```java
public class Room {
    private Room nextRoom;

    public Room(Room nextRoom) {
        this.nextRoom = nextRoom;
    }

    public void explore() {
        if (nextRoom != null) {
            nextRoom.explore(); // ממשיך לחדר הבא
        }
        System.out.println("📜 פתר חידה בחדר");
    }
}

תרגול:
צור מקדש עם 5 חדרים, וכתוב פונקציה שמריצה את explore() מהחדר הראשון.

שים System.out.println("נכנס לחדר") בתחילת explore() – מה יוצא?

## 🧗‍♂️ חלק 2 – המגדל עם הרמזים (Bottom-Up Recursion)
הסיפור:
אינדיאנה עולה במגדל. בכל קומה יש רמז, אבל הוא מתכנן לקרוא אותם רק בירידה חזרה.

הקוד:
```java
public class TowerLevel {
    private TowerLevel nextLevel;
    private String clue;

    public TowerLevel(TowerLevel nextLevel, String clue) {
        this.nextLevel = nextLevel;
        this.clue = clue;
    }

    public void collectClues() {
        if (nextLevel != null) {
            nextLevel.collectClues();
        }
        System.out.println("🪧 רמז: " + clue);
    }
}
```

תרגול:
צור 3 קומות עם רמזים: "זהב", "פסל עתיק", "מפתח".

מה יקרה אם תחליף את סדר ההדפסה (System.out.println) לפני הקריאה הרקורסיבית?


## 🔥 חלק 3 – אינדיאנה מעביר את הלפיד (Tail Recursion)
הסיפור:
אינדיאנה מקבל לפיד. בכל שלב הוא משנה מעט את המסר ומעביר לחוקר הבא.
החוקר האחרון מקבל את המסר המלא.

הקוד: