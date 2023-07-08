import com.thinking.machines.util.*;
class KeyboardTestcase
{
public static void main(String gg[])
{
Keyboard k = new Keyboard();
String a;
System.out.print("enter a string :");
a = k.getString();

String b;
System.out.print("Enter the another String :");
b = k.getString();


char c;
c = k.getCharacter("Enter the Gender (M/F):");

long d;
d  = k.getLong("Enter the long type value :");


int e;
e = k.getInt("Enter the int type value :");


short f;
f = k.getShort("Enter the Short type value :");


byte g;
g = k.getByte(" Enter the Byte type value :");


double h;
h = k.getDouble(" Enter the Double type value :");


float i;
i = k.getFloat(" Enter the Float type value :");


boolean j;
j = k.getBoolean(" enter the boolean type value :");

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);
System.out.println(j);
}
}