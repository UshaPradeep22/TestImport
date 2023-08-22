class You
{
public int an;
private int pw;
You(){
an =111;
pw= 222;
}
}
class Friend extends You
{
void change_Data()
{
an =8888;
//pw=9999;
}
void disp()
{
System.out.println(an);
//System.out.println(pw);
}
}
class Launch
{
public static void main(String args[])
{
Friend f = new Friend();
f.change_Data();
f.disp();
f.You();
}
}