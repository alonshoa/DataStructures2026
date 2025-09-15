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
<p>ספריית NumPy מספקת מבני נתונים וכלים לחישובים נומריים מהירים באמצעות מערכים רב-ממדיים.</p>
<table class="code-compare">
  <thead>
    <tr><th>פעולה</th><th>הסבר</th></tr>
  </thead>
  <tbody>
    <tr><td><code>np.array</code></td><td>יצירת מערך נומרי</td></tr>
    <tr><td><code>np.mean</code></td><td>חישוב ממוצע של איברי המערך</td></tr>
    <tr><td><code>np.zeros</code></td><td>יצירת מערך מלא באפסים</td></tr>
    <tr><td><code>np.linspace</code></td><td>יצירת סדרת ערכים בטווח שווה</td></tr>
  </tbody>
</table>
<pre><code class="language-python" dir="ltr">import numpy as np
arr = np.array([1, 2, 3])
print(arr.mean())
</code></pre>

<h2>Matplotlib</h2>
<p>Matplotlib היא ספרייה ליצירת גרפים ותרשימים דו-ממדיים.</p>
<table class="code-compare">
  <thead>
    <tr><th>פעולה</th><th>הסבר</th></tr>
  </thead>
  <tbody>
    <tr><td><code>plt.plot</code></td><td>שרטוט גרף קווי</td></tr>
    <tr><td><code>plt.scatter</code></td><td>תרשים נקודות</td></tr>
    <tr><td><code>plt.title</code></td><td>הוספת כותרת לגרף</td></tr>
    <tr><td><code>plt.show</code></td><td>הצגת הגרף</td></tr>
  </tbody>
</table>
<pre><code class="language-python" dir="ltr">import matplotlib.pyplot as plt
plt.plot([1,2,3],[1,4,9])
plt.title("דוגמת גרף")
plt.show()
</code></pre>

<h2>Pandas</h2>
<p>Pandas מספקת מבני נתונים ופעולות לניתוח נתונים טבלאיים.</p>
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

<h2>Weights & Biases (wandb)</h2>
<p>wandb היא פלטפורמה לניטור ניסויים ולמעקב אחר תוצאות בלמידת מכונה.</p>
<table class="code-compare">
  <thead>
    <tr><th>פעולה</th><th>הסבר</th></tr>
  </thead>
  <tbody>
    <tr><td><code>wandb.init</code></td><td>אתחול ריצה חדשה</td></tr>
    <tr><td><code>wandb.log</code></td><td>רישום נתונים בזמן אמת</td></tr>
    <tr><td><code>wandb.finish</code></td><td>סיום הריצה ושמירתה</td></tr>
    <tr><td><code>wandb.sweep</code></td><td>הפעלת ניסוי סריקה (Hyperparameter Tuning)</td></tr>
  </tbody>
</table>
<pre><code class="language-python" dir="ltr">import wandb
wandb.init(project="demo")
for i in range(3):
    wandb.log({"step": i})
wandb.finish()
</code></pre>

<h2>PyTorch</h2>
<p>PyTorch היא ספרייה לבניית רשתות נוירונים ולחישובים מבוססי טנסורים.</p>
<table class="code-compare">
  <thead>
    <tr><th>פעולה</th><th>הסבר</th></tr>
  </thead>
  <tbody>
    <tr><td><code>torch.tensor</code></td><td>יצירת טנסור חדש</td></tr>
    <tr><td><code>tensor.cuda</code></td><td>העברת טנסור ל-GPU</td></tr>
    <tr><td><code>torch.nn.Linear</code></td><td>שכבה ליניארית לרשת נוירונים</td></tr>
    <tr><td><code>torch.save</code></td><td>שמירת מודל או טנסור לקובץ</td></tr>
  </tbody>
</table>
<pre><code class="language-python" dir="ltr">import torch
x = torch.tensor([1.0, 2.0, 3.0])
linear = torch.nn.Linear(3, 1)
print(linear(x))
</code></pre>

</div>
