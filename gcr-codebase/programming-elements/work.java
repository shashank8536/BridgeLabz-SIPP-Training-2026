
class work {
    static int p;
    int q;
    static void a1(){
        System.out.println("a1");
        System.out.println(p);
    }
    void a2(){
        int q=60;
        System.out.println("a2");
        System.out.println(q);
        System.out.println(this.q);
    }
    public static void main(String[] args) {
        int p =10;
        int f = 20;
        System.out.println(p);
        System.out.println(f);
        System.out.println(work.p);
       
        work obj = new work();
        System.out.println(obj.q);
        a1();
        obj.q=50;
        obj.a2();
    }
}
