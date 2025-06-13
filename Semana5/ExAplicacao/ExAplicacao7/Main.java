package Semana5.ExAplicacao.ExAplicacao7;

class Foo {
    public void a() {
        System.out.println("a");
    }

    public void b() {
        System.out.println("b");
    }

    void print() {
        a();
        b();
    }
}

class Bar extends Foo {
    public void a() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        Foo f = new Bar();
        f.print();
    }
}