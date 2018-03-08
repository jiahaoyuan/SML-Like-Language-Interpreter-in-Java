# SML-Like-Language-Interpreter-in-Java

This is a project I did for my Graduate Course: "CSC 8510: Linguistics of Programming Language", Fall 2017.

In this project:
<ul>
  <li>SML-syntax like language designed</li>
  <li>Wrote parser in ANTLER, interpreter and evaluator in JAVA</li>
</ul>

<b>Presentation</b>:
http://www.csc.villanova.edu/~jiyuan/documents/SML-Syntax-Language%20Interpreter%20In%20Java.pdf

<b>Instruction</b>:
<ul>
  <li> Open the "output" folder in "proj2-jyuan3" </li>
  <li> Open the Java file "Interpretmain.java", where you can enter your SML language and evaluate it in Java</li>
</ul>

Some SML examples are like:

Input:

if 1=1 then 2 else 99;

Output:

2


Input:

let val x = 1 in x+2 end;

Output:

3


Input:

let fun f(x) = x+3 in f(4) end;

Output:

7


Input:

let val x=0 in x:=3 x end;

Output:

3
