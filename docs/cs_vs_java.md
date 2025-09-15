<!-- Highlight.js CSS (ערכת ברירת מחדל, ניתן להחליף לפי הצורך) -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/styles/stackoverflow-light.min.css">

<!-- Highlight.js core + שפות נדרשות -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/highlight.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/languages/python.min.js"></script>

<script>hljs.highlightAll();</script>

<style>
  :root{
    --bg:#ffffff; --ink:#222; --muted:#666; --soft:#f7f7f9; --line:#e6e6e6;
    --brand:#3b82f6; --ok:#16a34a; --warn:#ca8a04;
  }
  body{background:var(--bg); color:var(--ink); font-family:Arial, Helvetica, sans-serif;}
  .page{max-width:1000px; margin:0 auto; padding:24px;}
  h1,h2{margin:0 0 8px;}
  h1{font-size:2rem}
  h2{font-size:1.35rem; border-bottom:2px solid var(--line); padding-bottom:6px; margin-top:28px}
  p{line-height:1.65}
  .section-intro{display:grid; gap:8px; margin:10px 0 18px}
  .tag{display:inline-block; font-size:.85rem; background:#eef4ff; color:#1e3a8a; padding:2px 8px; border-radius:999px; margin-inline-start:6px}
  .info, .tip{border:1px solid var(--line); background:var(--soft); border-radius:12px; padding:12px 14px; margin:12px 0}
  .tip{border-color:#dbeafe}
  .bullets{margin:8px 0 0 0; padding:0 18px}
  .bullets li{margin:6px 0}
  code{font-family: ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas, "Liberation Mono", monospace}
  pre{border:1px solid var(--line); background: #fcfcfe; border-radius:12px; padding:12px; overflow:auto}
  table.code-compare{width:100%; border-collapse:collapse; table-layout:fixed; margin:10px 0 16px}
  table.code-compare th, table.code-compare td {border:1px solid #ccc; vertical-align:top; padding:8px}
  table.code-compare th {background:#f0f0f0; text-align:center}
  table.code-compare td {direction:rtl; text-align:right; background:#fafafa}
  .grid-2{display:grid; grid-template-columns:1fr; gap:12px}
  @media (min-width:860px){ .grid-2{grid-template-columns:1fr 1fr} }
  .pill{display:inline-block; padding:2px 8px; border-radius:8px; font-size:.8rem; background:#f1f5f9; color:#0f172a; margin-inline-end:6px}
  .kbd{font-family: ui-monospace, Menlo, monospace; border:1px solid var(--line); padding:0 6px; border-radius:6px; background:#fff}
</style>

<div class="page" dir="rtl">
  <h1>📚 ספריות שימושיות בפייתון (למבוא לבינה מלאכותית)</h1>
  <p class="section-intro">
    המטרה כאן היא להבין <b>למה</b> צריך כל ספרייה, <b>מה</b> היא נותנת לנו, ולקבל
    דוגמה קצרה שממחישה שימוש אמיתי — בלי להיכנס למתמטיקה כבדה. הספריות:
    <span class="tag">NumPy</span>
    <span class="tag">Pandas</span>
    <span class="tag">Matplotlib</span>
    <span class="tag">PyTorch</span>
    <span class="tag">Weights &amp; Biases (wandb)</span>
    <span class="tag">PyTorch Lightning</span>
  </p>

  <!-- NumPy -->
  <h2>🧮 NumPy — חישובים מהירים על הרבה מספרים</h2>
  <div class="info">
    <b>למה צריך אותה?</b>
    <ul class="bullets">
      <li>כשעובדים עם הרבה מספרים, לולאות רגילות בפייתון איטיות ומסורבלות.</li>
      <li>NumPy נותנת <b>מערכים חכמים</b> שעליהם עושים חישוב שלם בפקודה אחת — מהר ויעיל.</li>
    </ul>
    <b>מה מקבלים?</b>
    <ul class="bullets">
      <li>מערכים (arrays) ופעולות כמו חיבור/כפל לכל האיברים בבת אחת.</li>
      <li>כלים מובנים: ממוצע, סכום, מקסימום/מינימום, יצירת נתונים אקראיים ועוד.</li>
    </ul>
  </div>

  <table class="code-compare">
    <thead><tr><th>פעולה</th><th>הסבר</th></tr></thead>
    <tbody>
      <tr><td><code>np.array</code></td><td>יצירת מערך מספרים יעיל ומהיר לחישוב</td></tr>
      <tr><td><code>np.mean / np.sum</code></td><td>חישובי ממוצע/סכום לכל האיברים</td></tr>
      <tr><td><code>np.ones / np.zeros</code></td><td>יצירת מערך מלא באחדים/אפסים</td></tr>
      <tr><td><code>np.random.rand</code></td><td>מספרים אקראיים לניסויים</td></tr>
      <tr><td><code>np.linspace</code></td><td>סדרה בטווח שווה צעדים (לגרפים/בדיקות)</td></tr>
    </tbody>
  </table>

  <pre><code class="language-python" dir="ltr">import numpy as np

# יצירת נתונים
x = np.array([1, 2, 3, 4])
A = np.ones((2, 2))
B = np.random.rand(2, 2)

# חישובים "בבת אחת"
print(x * 10)     # [10 20 30 40]
print(A * B)      # כפל איבר-איבר
print(A @ B)      # כפל מטריצות
print(np.mean(x)) # ממוצע</code></pre>

  <!-- Pandas -->
  <h2>🗃️ Pandas — טבלאות שעובדות בשבילנו</h2>
  <div class="info">
    <b>למה צריך אותה?</b>
    <ul class="bullets">
      <li>רוב הנתונים בעולם מגיעים כטבלאות (ציונים, מכירות, מדידות...).</li>
      <li>Pandas הופכת טבלה ל<strong>אובייקט חכם</strong> שקל לסנן, למיין ולהסיק ממנו מסקנות.</li>
    </ul>
    <b>מה מקבלים?</b>
    <ul class="bullets">
      <li>קריאה/כתיבה של CSV/Excel, מבט מהיר על נתונים, סטטיסטיקות בסיסיות.</li>
      <li>סינון לפי תנאים, חישובים על עמודות, קיבוצים לפי קטגוריה.</li>
    </ul>
  </div>

  <table class="code-compare">
    <thead><tr><th>פעולה</th><th>הסבר</th></tr></thead>
    <tbody>
      <tr><td><code>pd.DataFrame</code></td><td>יצירת טבלה דו־ממדית</td></tr>
      <tr><td><code>df.head()</code></td><td>הצצה מהירה לשורות הראשונות</td></tr>
      <tr><td><code>df["col"].mean()</code></td><td>ממוצע לעמודה</td></tr>
      <tr><td><code>df[df["col"] &gt; v]</code></td><td>סינון לפי תנאי</td></tr>
      <tr><td><code>df.groupby(...).mean()</code></td><td>קיבוץ לפי עמודה וחשב ממוצע</td></tr>
    </tbody>
  </table>

  <pre><code class="language-python" dir="ltr">import pandas as pd

df = pd.DataFrame({
    "name": ["Dana", "Roni", "Gil", "Noa"],
    "score": [90, 85, 100, 72]
})

print(df.head())                 # הצצה
print("avg:", df["score"].mean())# ממוצע
passed = df[df["score"] >= 85]   # סינון
print(passed)</code></pre>

  <!-- Matplotlib -->
  <h2>📊 Matplotlib — לראות מספרים בעיניים</h2>
  <div class="info">
    <b>למה צריך אותה?</b>
    <ul class="bullets">
      <li>קל יותר להבין נתונים כשמציירים אותם.</li>
      <li>Matplotlib מאפשרת ליצור גרפים במהירות מכל רשימה/טבלה.</li>
    </ul>
    <b>מה מקבלים?</b>
    <ul class="bullets">
      <li>תרשימי קו, עמודות, פיזור ועוד.</li>
      <li>כותרות, שמות לצירים ושמירה לקובץ תמונה.</li>
    </ul>
  </div>

  <table class="code-compare">
    <thead><tr><th>פעולה</th><th>הסבר</th></tr></thead>
    <tbody>
      <tr><td><code>plt.plot</code></td><td>קו לאורך נקודות (מגמה)</td></tr>
      <tr><td><code>plt.bar</code></td><td>עמודות (השוואת כמויות)</td></tr>
      <tr><td><code>plt.scatter</code></td><td>פיזור (קשר בין שני משתנים)</td></tr>
      <tr><td><code>plt.title / xlabel / ylabel</code></td><td>כותרת ושמות לצירים</td></tr>
      <tr><td><code>plt.show()</code></td><td>הצגה למסך</td></tr>
    </tbody>
  </table>

  <div class="grid-2">
    <pre><code class="language-python" dir="ltr">import matplotlib.pyplot as plt

names  = ["Dana","Roni","Gil","Noa"]
scores = [90,85,100,72]

plt.bar(names, scores)
plt.title("Student Scores")
plt.xlabel("Name")
plt.ylabel("Score")
plt.show()</code></pre>

    <pre><code class="language-python" dir="ltr"># גרף קווי פשוט
import matplotlib.pyplot as plt

x = [0,1,2,3,4]
y = [0,1,4,9,16]

plt.plot(x, y)
plt.title("y = x^2 (דוגמה)")
plt.xlabel("x")
plt.ylabel("y")
plt.show()</code></pre>
  </div>

  <!-- PyTorch -->
  <h2>🔥 PyTorch — מכאן מתחילה הלמידה של מחשבים</h2>
  <div class="info">
    <b>למה צריך אותה?</b>
    <ul class="bullets">
      <li>PyTorch מאפשרת לבנות <b>רשתות עצביות</b> שלומדות מדוגמאות — תמונות, טקסט, מספרים.</li>
      <li>היא מנהלת בשבילנו את החישובים המסובכים מאחורי הקלעים, וגם רצה מהר על GPU.</li>
    </ul>
    <b>מה מקבלים?</b>
    <ul class="bullets">
      <li>טנסורים (מבני נתונים מהירים כמו ב-NumPy, עם מעקב “לימוד”).</li>
      <li>שכבות מוכנות, פונקציות הפסד (loss), אופטימייזרים לאימון.</li>
    </ul>
  </div>

  <table class="code-compare">
    <thead><tr><th>פעולה</th><th>הסבר</th></tr></thead>
    <tbody>
      <tr><td><code>torch.tensor</code></td><td>יצירת טנסור (נתונים ללמידה)</td></tr>
      <tr><td><code>nn.Linear</code></td><td>שכבה שממירה קלט לפלט בקו ישר (עם משקולות)</td></tr>
      <tr><td><code>nn.Module</code></td><td>מחלקת בסיס למודל משלכם</td></tr>
      <tr><td><code>torch.optim.SGD</code></td><td>שיטה פשוטה לשיפור המודל צעד-אחרי-צעד</td></tr>
      <tr><td><code>tensor.to("cuda")</code></td><td>העברת נתונים/מודל ל-GPU (אם קיים)</td></tr>
    </tbody>
  </table>

  <pre><code class="language-python" dir="ltr">import torch
import torch.nn as nn
import torch.nn.functional as F

# מודל קטן: מקבל 10 מספרים ומחזיר מספר אחד
class TinyNet(nn.Module):
    def __init__(self):
        super().__init__()
        self.fc1 = nn.Linear(10, 5)
        self.fc2 = nn.Linear(5, 1)

    def forward(self, x):
        x = F.relu(self.fc1(x))  # הפעלה לא-ליניארית פשוטה
        return self.fc2(x)

model = TinyNet()

# "דוגמאות" אקראיות
x = torch.randn(3, 10)   # 3 דוגמאות, כל דוגמה עם 10 מספרים
y = model(x)
print(y.shape)           # torch.Size([3, 1])</code></pre>

  <!-- wandb -->
  <h2>📈 Weights &amp; Biases (wandb) — לעקוב אחרי ניסויים</h2>
  <div class="info">
    <b>למה צריך אותה?</b>
    <ul class="bullets">
      <li>באימון מודלים מנסים הרבה אפשרויות. חשוב לדעת מה עבד טוב — ועל מה כדאי לוותר.</li>
      <li>wandb שומרת גרפים ותוצאות מכל ריצה ומציגה אותם באתר בצורה נוחה.</li>
    </ul>
    <b>מה מקבלים?</b>
    <ul class="bullets">
      <li>גרפים אוטומטיים של הפסד/דיוק ועוד.</li>
      <li>השוואה בין ריצות שונות באותו פרויקט.</li>
    </ul>
  </div>

  <table class="code-compare">
    <thead><tr><th>פעולה</th><th>הסבר</th></tr></thead>
    <tbody>
      <tr><td><code>wandb.init(project=...)</code></td><td>פתיחת ריצה חדשה בפרויקט</td></tr>
      <tr><td><code>wandb.log({...})</code></td><td>שליחת נתונים לגרפים בזמן אמת</td></tr>
      <tr><td><code>wandb.finish()</code></td><td>סגירת הריצה (שמירה והעלאה סופית)</td></tr>
    </tbody>
  </table>

  <pre><code class="language-python" dir="ltr">import wandb, time

run = wandb.init(project="ai-intro-demo", name="quick-test")
for epoch in range(1, 6):
    loss = 1.0 / epoch
    wandb.log({"epoch": epoch, "loss": loss})
    time.sleep(0.2)
run.finish()</code></pre>

  <!-- PyTorch Lightning -->
  <h2>⚡ PyTorch Lightning — אותו רעיון, פחות בלגן</h2>
  <div class="info">
    <b>למה צריך אותה?</b>
    <ul class="bullets">
      <li>כשפרויקט גדל, לולאות האימון וניהול המכשירים (CPU/GPU) “מלכלכים” את הקוד.</li>
      <li>Lightning מסדרת את המבנה כך שתתמקדו <b>ברעיון של המודל</b>, לא בחוטים הטכניים.</li>
    </ul>
    <b>מה מקבלים?</b>
    <ul class="bullets">
      <li>מחלקה אחידה למודל, פונקציות <code>training_step</code>/<code>validation_step</code>.</li>
      <li>טריינר (Trainer) שמריץ הכול, כולל GPU, לוגים, שמירות — כמעט בלי קוד נוסף.</li>
    </ul>
  </div>

  <table class="code-compare">
    <thead><tr><th>פעולה</th><th>הסבר</th></tr></thead>
    <tbody>
      <tr><td><code>pl.LightningModule</code></td><td>עטיפה נקייה למודל + צעדי אימון</td></tr>
      <tr><td><code>Trainer(...).fit(model)</code></td><td>הרצה בפועל של תהליך האימון</td></tr>
    </tbody>
  </table>

  <pre><code class="language-python" dir="ltr">import torch
import torch.nn as nn
import torch.nn.functional as F
import pytorch_lightning as pl

class SimpleRegressor(pl.LightningModule):
    def __init__(self):
        super().__init__()
        self.fc1 = nn.Linear(10, 16)
        self.fc2 = nn.Linear(16, 1)

    def forward(self, x):
        return self.fc2(F.relu(self.fc1(x)))

    def training_step(self, batch, batch_idx):
        x, y = batch
        y_hat = self(x)
        loss = F.mse_loss(y_hat, y)
        self.log("train_loss", loss)
        return loss

    def configure_optimizers(self):
        return torch.optim.SGD(self.parameters(), lr=0.01)

# הערה: בדוגמה אמיתית נגדיר DataLoader שמחזיר (x, y),
# ואז נריץ:
# from pytorch_lightning import Trainer
# Trainer(max_epochs=5).fit(model, train_dataloaders=loader)</code></pre>

  <!-- סיכום -->
  <div class="tip">
    <b>איך זה מתחבר בפרויקט אמיתי?</b>
    <ul class="bullets">
      <li><span class="pill">NumPy</span> חישובים מהירים ויצירת נתוני בסיס.</li>
      <li><span class="pill">Pandas</span> טעינה וסידור של טבלאות.</li>
      <li><span class="pill">Matplotlib</span> בדיקה חזותית מהירה של הנתונים והתוצאות.</li>
      <li><span class="pill">PyTorch</span> בניית המודל ואימון בפועל.</li>
      <li><span class="pill">wandb</span> מעקב אחרי הפסד/דיוק והשוואת ריצות.</li>
      <li><span class="pill">Lightning</span> שומרת על קוד נקי כשזה גדל.</li>
    </ul>
  </div>
</div>
