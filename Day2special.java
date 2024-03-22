import java.util.*;
class Day2special
{
public static void main(String arg[])
{
int scc=0,;
String str="Modi Birthday @ September 17, #&$% is the wishes code for him";
char ch;
int i;

String sc="";
str=str.toLowerCase();
int n=str.length();
for(i=0;i<n;i++)
{
ch=str.charAt(i);
if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='^'||ch=='&'||ch=='*'||ch==','||ch==';')
{
sc+=ch+" ";
scc++;
}

}
System.out.println("NO OF SPECIAL CHARACHTERS ARE "+scc);
}
}


