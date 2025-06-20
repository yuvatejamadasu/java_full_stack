class Memory
{
int a=10;
int b=20;
static int c=30;
static int d=40;
static{
System.out.println("this is static block 1");
}
static{
System.out.println("this is static block 1");
}
{
System.out.println("this is inestance block 1");

}

{
System.out.println("this is inestance block 2");

}

public void main1()
{
System.out.println("this is inestance method 1");

}


public void main2()
{
System.out.println("this is inestance method 2");

}

static void main3()
{
System.out.println("this is static method 3");

}

static void main4()
{
System.out.println("this is static method 4");

}




public static void main(String[] uv)
{

Memory m=new Memory();
System.out.println(m.a);
System.out.println(m.b);
System.out.println(m.c);
System.out.println(m.d);

main3();
main4();
m.main1();
m.main2();



}
}