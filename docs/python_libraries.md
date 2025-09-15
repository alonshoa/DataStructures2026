<!-- Highlight.js CSS (ערכת ברירת מחדל) -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/styles/stackoverflow-light.min.css">

<!-- Highlight.js core + שפות נדרשות -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/highlight.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/languages/python.min.js"></script>

<script>hljs.highlightAll();</script>

<style>
  table.code-compare { width:100%; border-collapse:collapse; table-layout:fixed; font-family:Arial, sans-serif; }
  table.code-compare th, table.code-compare td { border:1px solid #ccc; vertical-align:top; padding:8px; }
  table.code-compare th { background:#f0f0f0; text-align:center; }
  table.code-compare td { direction:rtl; text-align:right; background:#fafafa; }
</style>

<div dir="rtl">
<h1>📚 ספריות שימושיות בפייתון</h1>

<h2>NumPy</h2>
<p>ספריית <a href="https://numpy.org/doc/">NumPy</a> מספקת מבני נתונים וכלים לחישובים נומריים מהירים באמצעות מערכים רב-ממדיים.</p>
<table class="code-compare">
  <thead>
    <tr><th>פעולה</th><th>הסבר</th></tr>
  </thead>
  <tbody>
    <tr><td><code>np.array</code></td><td>יצירת מערך נומרי</td></tr>
    <tr><td><code>np.mean</code></td><td>חישוב ממוצע של איברי המערך</td></tr>
    <tr><td><code>np.zeros</code></td><td>יצירת מערך מלא באפסים</td></tr>
    <tr><td><code>np.ones</code></td><td>יצירת מערך מלא באחדים</td></tr>
    <tr><td><code>np.random.rand</code></td><td>יצירת מערך עם ערכים אקראיים</td></tr>
    <tr><td><code>np.linspace</code></td><td>יצירת סדרת ערכים בטווח שווה</td></tr>
  </tbody>
</table>
<pre><code class="language-python" dir="ltr">import numpy as np
A = np.ones((2, 2))
B = np.random.rand(2, 2)
print(A * B)    # כפל איבר-איבר
print(A @ B)    # כפל מטריצות
print(A + B)    # חיבור איבר-איבר
x = np.array([1, 2, 3])
print(x - 3)    # חיסור סקאלר מכל איבר
</code></pre>
<p>NumPy היא לב ליבן של ספריות המדע בפייתון ומאפשרת עבודה יעילה עם וקטורים ומטריצות, ביצוע חישובים מתקדמים ומניפולציה על כמויות גדולות של נתונים. רבות מהספריות הפופולריות בתחום הנתונים נשענות עליה כבסיס.</p>

<h2>Matplotlib</h2>
<p><a href="https://matplotlib.org/stable/">Matplotlib</a> היא ספרייה ליצירת גרפים ותרשימים דו-ממדיים.</p>
<table class="code-compare">
  <thead>
    <tr><th>פעולה</th><th>הסבר</th></tr>
  </thead>
  <tbody>
    <tr><td><code>plt.plot</code></td><td>שרטוט גרף קווי</td></tr>
    <tr><td><code>plt.scatter</code></td><td>תרשים נקודות</td></tr>
    <tr><td><code>plt.title</code></td><td>הוספת כותרת לגרף</td></tr>
    <tr><td><code>plt.xlabel</code></td><td>הגדרת שם לציר ה-X</td></tr>
    <tr><td><code>plt.ylabel</code></td><td>הגדרת שם לציר ה-Y</td></tr>
    <tr><td><code>plt.show</code></td><td>הצגת הגרף</td></tr>
  </tbody>
</table>
<pre><code class="language-python" dir="ltr">import matplotlib.pyplot as plt
plt.plot([1, 2, 3], [1, 4, 9])
plt.title("דוגמת גרף")
plt.xlabel("ציר X")
plt.ylabel("ציר Y")
plt.show()
</code></pre>
<p>Matplotlib ממפה רשימות של נקודות על מערכת צירים ומחברת ביניהן בקווים ישרים בעת שימוש ב-<code>plot</code>. היא מאפשרת להוסיף כותרות, שמות לצירים ושכבות מידע נוספות עבור סוגי תרשימים רבים.</p>

<h2>Pandas</h2>
<p>ספריית <a href="https://pandas.pydata.org/docs/">Pandas</a> מספקת מבני נתונים ופעולות לניתוח נתונים טבלאיים.</p>
<table class="code-compare">
  <thead>
    <tr><th>פעולה</th><th>הסבר</th></tr>
  </thead>
  <tbody>
    <tr><td><code>pd.Series</code></td><td>יצירת סדרה חד-ממדית</td></tr>
    <tr><td><code>pd.DataFrame</code></td><td>יצירת טבלה דו-ממדית</td></tr>
    <tr><td><code>df.head</code></td><td>הצגת השורות הראשונות</td></tr>
    <tr><td><code>df.describe</code></td><td>סטטיסטיקה בסיסית של הטבלה</td></tr>
  </tbody>
</table>
<pre><code class="language-python" dir="ltr">import pandas as pd
data = {"A": [1,2,3], "B": [4,5,6]}
df = pd.DataFrame(data)
print(df.head())
</code></pre>
<p>Pandas בנויה מעל NumPy ומציעה כלים לניקוי, סינון ומיזוג של נתונים, עבודה עם ערכים חסרים וייצוא לפורמטים שונים כמו CSV או Excel. ה-DataFrame שלה מאפשר לבצע ניתוחים מורכבים בצורה קריאה ונוחה.</p>

<h2>Weights & Biases (wandb)</h2>
<p><a href="https://docs.wandb.ai/">wandb</a> היא פלטפורמה לניטור ניסויים ולמעקב אחר תוצאות בלמידת מכונה.</p>
<table class="code-compare">
  <thead>
    <tr><th>פעולה</th><th>הסבר</th></tr>
  </thead>
  <tbody>
    <tr><td><code>wandb.init</code></td><td>אתחול ריצה חדשה</td></tr>
    <tr><td><code>wandb.log</code></td><td>רישום נתונים בזמן אמת</td></tr>
    <tr><td><code>wandb.finish</code></td><td>סיום הריצה ושמירתה</td></tr>
  </tbody>
</table>
<pre><code class="language-python" dir="ltr">import wandb
run = wandb.init(project="demo")
for i in range(3):
    wandb.log({"step": i})
run.finish()
</code></pre>
<p>בדוגמה זו אנחנו שולחים לוגים אחד אחר השני במהלך ריצה. בדף הפרויקט באתר של wandb ניתן לראות את ההודעות מצטברות לפי השם שנתנו להן, המספרים תואמים לערכים ששלחנו והם מסודרים בסדר כרונולוגי.</p>

<h2>PyTorch</h2>
<p><a href="https://pytorch.org/docs/stable/">PyTorch</a> היא ספרייה לבניית רשתות נוירונים ולחישובים מבוססי טנסורים.</p>
<table class="code-compare">
  <thead>
    <tr><th>פעולה</th><th>הסבר</th></tr>
  </thead>
  <tbody>
    <tr><td><code>torch.tensor</code></td><td>יצירת טנסור חדש</td></tr>
    <tr><td><code>tensor.cuda</code></td><td>העברת טנסור ל-GPU</td></tr>
    <tr><td><code>torch.nn.Linear</code></td><td>שכבה ליניארית לרשת נוירונים</td></tr>
    <tr><td><code>torch.nn.Module</code></td><td>מחלקת בסיס לבניית מודלים</td></tr>
    <tr><td><code>torch.optim.SGD</code></td><td>אופטימיזציה באמצעות ירידה תלולה</td></tr>
    <tr><td><code>torch.save</code></td><td>שמירת מודל או טנסור לקובץ</td></tr>
  </tbody>
</table>
<pre><code class="language-python" dir="ltr">import torch
import torch.nn as nn

A = torch.ones((2, 2))
B = torch.rand((2, 2))
print(A * B)
print(A @ B)

class Net(nn.Module):
    def __init__(self):
        super().__init__()
        self.fc = nn.Linear(2, 1)

    def forward(self, x):
        return self.fc(x)

model = Net()
x = torch.tensor([1.0, 2.0])
print(model(x))
</code></pre>
<p>PyTorch מציעה גרף חישוב דינמי המאפשר גמישות בבניית מודלים. מחלקת <code>nn.Module</code> משמשת בסיס לכל שכבה או רשת מותאמת אישית, ומנהלת את הפרמטרים והמעקב אחר הגרדיאנטים עבור תהליך האימון.</p>

</div>
