package lab6;

record recordA(int a,int b, int c) {
    
}

public class RecordTest{
    public static void main(String[] args) {
        var a = new recordA(2, 4, 1);
        System.out.println(a.a() + " " + a.b() + " " + a.c());
        System.out.println(a);
    }
}
