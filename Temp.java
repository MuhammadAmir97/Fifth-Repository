class Temp
{
void show()
{
System.out.println("show");

}

Temp(int x)
{
System.out.println(x);
}

public static void main(String args[])
{
Temp d1=new Temp();
d1.show();
}

Temp()
{
System.out.println("default");
}
}
