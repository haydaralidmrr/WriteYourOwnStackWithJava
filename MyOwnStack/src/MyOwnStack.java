import java.util.ArrayList;

public class MyOwnStack {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        Kisi k1=new Kisi("Ali",48372683,21);
        Kisi k2=new Kisi("Haydar",483234683,22);
        Kisi k3=new Kisi("Demir",48366483,24);
        Kisi k4=new Kisi("Hasan",484532683,20);
        myStack.push(k1);
        myStack.push(k2);
        myStack.push(k3);
        myStack.push(k4);
        myStack.yazdir();
        System.out.println("Kac eleman var stackte =" +myStack.kacElemanVar());
        System.out.println("Stack bos mu?" +myStack.bosMu());
        System.out.println("Sonuncu elemani goster " +myStack.elemanGoster());
        myStack.pop();
        myStack.yazdir();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.yazdir();
        myStack.pop();


    }
}
class MyStack{

    private ArrayList<Object> liste=new ArrayList<>();
    public int kacElemanVar() {
        return liste.size();
    }
    public boolean bosMu() {
        return liste.isEmpty();
    }
    public Object elemanGoster() {
        return liste.get(kacElemanVar()-1);
    }
    public Object pop() {
        if (kacElemanVar()>0) {
            Object silinecekElaman= liste.get(kacElemanVar()-1);
            liste.remove(kacElemanVar()-1);
            return silinecekElaman;
        }else {
            System.out.println("Yigin bos cıkarma yapılmaz");
            return null;
        }

    }
    public void push(Object eklenecekEleman) {
        liste.add(eklenecekEleman);
    }
    public void yazdir() {
        System.out.println("*****Yigin İcerigi*****");
        for (int i=0;i<liste.size();i++) {
            System.out.println(i+".index =" +liste.get(i));

        }
    }

}
