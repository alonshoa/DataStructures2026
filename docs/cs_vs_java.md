<!-- Highlight.js CSS (ערכת ברירת מחדל) -->
<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/styles/default.min.css"> -->


<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/styles/stackoverflow-light.min.css">


<!-- Highlight.js core + שפות נדרשות -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/highlight.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/languages/java.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/languages/csharp.min.js"></script>

<script>hljs.highlightAll();</script>

<style>
table.code-compare { width:100%; border-collapse:collapse; table-layout:fixed; font-family:Arial, sans-serif; }
table.code-compare th, table.code-compare td { border:1px solid #ccc; vertical-align:top; padding:8px; }
table.code-compare th { background:#f0f0f0; text-align:center; }
table.code-compare pre { margin:0; border-radius:6px; overflow-x:auto; font-size:0.9em; line-height:1.45; }
table.code-compare td.topic { width:30%; direction:rtl; text-align:right; background:#fafafa; }
.lang { font-weight:600; margin-bottom:4px; display:inline-block; }
</style>


<style>
  .code-compare { width: 100%; border-collapse: collapse; table-layout: fixed; font-family: Arial, sans-serif; }
  .code-compare th, .code-compare td { border: 1px solid #ccc; vertical-align: top; padding: 8px; }
  .code-compare th { background: #f0f0f0; text-align: center; }
  .code-compare pre { background: #e0e0e0ff; color: #f8f8f2; padding: 8px; border-radius: 6px; overflow-x: auto; font-size: 0.9em; line-height: 1.45; margin: 0; }
  .topic { width: 30%; direction: rtl; text-align: right; background: #fafafa; }
  .lang { font-weight: bold; margin-bottom: 4px; display: inline-block; }
</style>

<div dir="rtl">
<h1>
 📝 השוואת קוד בסיסי בין C# ל-Java
</h1>
<table class="code-compare">
  <thead>
    <tr>
      <th>Java (שמאל)</th>
      <th>C# (ימין)</th>
      <th>נושא</th>
    </tr>
  </thead>
  <tbody>

    <tr>
      <td>
        <span class="lang">Java</span>
        <pre><code class="language-java" dir="ltr"> System.out.println("Hello");
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
int x = sc.nextInt();
float f = sc.nextFloat();
Boolean b = sc.nextBoolean();</code></pre>
      </td>
      <td>
        <span class="lang">C#</span>
        <pre><code class="language-csharp" dir="ltr">Console.WriteLine("Hello");
string name = Console.ReadLine();</code></pre>
      </td>
      <td class="topic">
        <b>1️⃣ קריאה וכתיבה למסך</b><br>
        ב-Java משתמשים ב-<code>System.out</code> ו-<code>Scanner</code>. ב-C# משתמשים ב-<code>Console</code>.
      </td>
    </tr>

    <tr>
      <td>
        <span class="lang">Java</span>
        <pre><code class="language-java" dir="ltr">import java.util.Scanner;</code></pre>
      </td>
      <td>
        <span class="lang">C#</span>
        <pre><code class="language-csharp" dir="ltr">using System;
using System.Collections.Generic;</code></pre>
      </td>
      <td class="topic">
        <b>2️⃣ יבוא ספריות</b><br>
        Java: <code>import</code> · C#: <code>using</code>
      </td>
    </tr>

    <tr>
      <td>
        <span class="lang">Java</span>
        <pre><code class="language-java" dir="ltr">public void doSomething() {}
int myNumber = 5;</code></pre>
      </td>
      <td>
        <span class="lang">C#</span>
        <pre><code class="language-csharp" dir="ltr">public void DoSomething() {}
int MyNumber = 5;</code></pre>
      </td>
      <td class="topic">
        <b>3️⃣ מוסכמות כתיבה</b><br>
        Java: מתודות ב-<code>camelCase</code><br>
        C#: מתודות ב-<code>PascalCase</code>
      </td>
    </tr>

    <tr>
      <td>
        <span class="lang">Java</span>
        <pre><code class="language-java" dir="ltr">String s = "Hello";
int n = s.length();
int index = 1;
char c = s.charAt(index); // 'e'
String up = s.toUpperCase();</code></pre>
      </td>
      <td>
        <span class="lang">C#</span>
        <pre><code class="language-csharp" dir="ltr">string s = "Hello";
int n = s.Length;
int index = 1;
char c = s[index];
string up = s.ToUpper();</code></pre>
      </td>
      <td class="topic">
        <b>4️⃣ String ופעולות</b><br>
        Java: <code>length()</code>, <code>toUpperCase()</code><br>
        C#: <code>Length</code>, <code>ToUpper()</code>
      </td>
    </tr>

    <tr>
      <td>
        <span class="lang">Java</span>
        <pre><code class="language-java" dir="ltr">public class Person {
  private int age;
  public int getAge() { return age; }
  public void setAge(int a) { this.age = a; }
}</code></pre>
      </td>
      <td>
        <span class="lang">C#</span>
        <pre><code class="language-csharp" dir="ltr">public class Person {
  public int Age { get; set; }
}</code></pre>
      </td>
      <td class="topic">
        <b>5️⃣ Get ו-Set</b><br>
        Java: גטר/סטר מפורשים · C#: Properties
      </td>
    </tr>

  </tbody>
</table>

</div>
