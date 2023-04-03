import java.io.*;
import java.util.*;

class match
{
void match()
{
System.out.println("Match");
}
}

class bat extends match
{
void bat()
{
System.out.println("I am Batsman ");
}
}

class ball extends bat
{
void ball()
{
System.out.println("I am Bowler");
}
}

class all extends ball
{
void allrounder()
{
System.out.println("I am Batsman and Bowler");
}
}

class batball
{
public static void main(String args[])
{
all d=new all();
d.bat();
d.ball();
d.allrounder();
}
}