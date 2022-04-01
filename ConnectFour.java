import java.util.Scanner;
public class ConnectFour
{
public static String[][] createPattern()
{
String[][] f = new String[6][7];
for (int i =0;i<f.length;i++)
{
for (int j =0;j<f[i].length;j++)
{
if (j% 2 == 0){
f[i][j] ="|";
}
else{
f[i][j] = " ";
}
if (i==6) {
f[i][j]= "-";
}
}

}
return f;
}

public static void printPattern(String[][] f)
{
for (int i =0;i<f.length;i++)
{
for (int j=0;j<f[i].length;j++)
{
System.out.print(f[i][j]);
}
System.out.println();
}
}

public static void RedPattern(String[][] f)
{
System.out.println("What column do you want to put your piece?");
Scanner scan = new Scanner (System.in);
int c = 2*scan.nextInt()+1;
for (int i =5;i>=0;i--)
{
if (f[i][c] == " ")
{
f[i][c] = "R";
break;
}

}
}

public static void YellowPattern(String[][] f)
{
System.out.println("What column do you want to put your piece?");
Scanner scan = new Scanner (System.in);
int c = 2*scan.nextInt()+1;
for (int i =5;i>=0;i--)
{
if (f[i][c] == " ")
{
f[i][c] = "Y";
break;
}

}
}

public static void main (String[] args)
{

String[][] f = createPattern();

boolean loop = true;
int count = 0;
printPattern(f);
while(loop)
{

if (count % 2 == 0) 
{
RedPattern(f);
}
else 
{
    YellowPattern(f);
}
count++;
printPattern(f);
}
}
}

