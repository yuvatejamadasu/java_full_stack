/* different ways to create a string */
/*class TestSting
{
public static void main(String[] uv)
{
String s1=" yuva";

String sc=new String("yuva");

System.out.println(s1);
System.out.println(sc);


}
}*/

/* concatinating two strings usint '+' operator */
/*class TestSting
{
public static void main(String[] uv)
{
String s1="viratkohili";
String s2="virarkohili";
System.out.println(s1+s2);
System.out.println(s1.concat(s2));
}
}*/


/* finding the length of the string */

/*class TestSting
{
public static void main(String[] uv)
{

String s1="viratkohili";

System.out.println(s1.length());

}
}*/

/* searcing a string using indexOf() */

/*class TestSting
{
public static void main(String[] uv)
{

String s1="viratkohili";
System.out.println(s1.indexOf('k'));



}
}*/

/* matchin a strings against a regular expression with matches() */

/*class TestSting
{
public static void main(String[] uv)
{
 
String str="virat kohili";

boolean result=str.matches("[a-z A-Z]+");
System.out.println(result);
}
}*/

/* comparing strings using the methods equals(==)  */


/*
class TestSting
{
public static void main(String[] uv)
{
String s1="viratkohili";
String s2="viratkohili";
System.out.println(s1==s2);
System.out.println(s1.compareTo(s2));

}
}
*/

/* equalIsIgnoreCase(), startsWith(),endsWith() and compareTo()*/

/*class TestSting
{
public static void main(String[] uv)
{

String s1="viratkohili";
String s2="viratkohili";
System.out.println(s1.compareTo(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s2.startsWith("virat"));
System.out.println(s2.endsWith("kohili"));

}
}*/

/* trimming strings with trim() */

/*class TestSting
{
public static void main(String[] uv)
{
String s1="viratkohili";
System.out.println(s1.trim());
}
}
*/

/* Replacing chartacters  in string with replace()  */

/*class TestSting
{
public static void main(String[] uv)
{

String s1="yuva";
System.out.println(s1.replace('y','v'));
}
}*/
/* splitting strings with split() */

/*class TestSting
{
public static void main(String[] uv)
{

String s1=" yuva teja madasu";

String s2[]=s1.split(" ");
  
for(String s3:s2)
{
System.out.print(s3);
}



}
}*/

/* converting number to string with valueof() */


/*class TestSting
{
public static void main(String[] uv)
{
int num=1;
String s=String.valueOf(num);
System.out.println(s+112);

}
}
*/

/* converting integer objects to strings */

/*class TestSting
{
public static void main(String[] uv)
{
 int num=1;
String s=String.valueOf(num);
System.out.println(s+112);

}
}*/
/* converting uppercase to lowercsee */

/*class TestSting
{
public static void main(String[] uv)
{

String s=" YUVA TEJA MADASU";
 System.out.println(s.toLowerCase());
}
}
*/


















