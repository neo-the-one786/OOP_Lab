//Sabhi programming languages mein kisi operation/process ko karne ke liye ham functions ka prayog karte hain
//Java hamein ek added feature deta hai, jisse ham processes ke andar jo sub-processes hain, unhe bhi handle kar sakte hain
//Java mein in sub-processes ko threads kahte hain
//Java ek program ko ek saath poora ka poora execute nahi karta, balki usey kayi saare chhote chhote hisso mein baat kar simulateously execute karta hai
//Isey hi multi-threading kahte hain

//Ye class Thread superclass ko inherit karti hai, ab is class ka pratyek object ek thread hoga
class RangeThread extends Thread {
    int lower, upper;

    RangeThread(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    //Thread class ke run function ka prayog karke ham ek thread ko chala sakte hain
    @Override
    public void run() {
        //is loop se ek line par ek number print karenge
        for (int i = this.lower; i <= this.upper; i++) {
            System.out.println(i);
            try {
                //Sleep function hamaari maujooda thread ko given milliseconds ke liye sula deta hai
                sleep(50);
            } catch (InterruptedException e) {
                //Kyonki sleep method program runtime/execution mein interruption kar raha hai isiliye InterruptedException generate hota hai
                System.out.println(e.getMessage());
            }
        }
    }
}

//Ye class Thread superclass ko inherit karti hai, ab is class ka pratyek object ek thread hoga
class NameThread extends Thread {
    String name;

    NameThread(String name) {
        this.name = name;
    }

    //Thread class ke run function ka prayog karke ham ek thread ko chala sakte hain
    @Override
    public void run() {
        //is loop se ek line par ek character print karenge
        for (int i = 0; i < this.name.length(); i++) {
            System.out.println(this.name.charAt(i));
            try {
                //Sleep function hamaari maujooda thread ko ko given milliseconds ke liye sula deta hai
                sleep(50);
            } catch (InterruptedException e) {
                //Kyonki sleep method program runtime/execution mein interruption kar raha hai isiliye InterruptedException generate hota hai
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Threads {

    public static void main(String[] args) {
        //Hamnein 2 threads banaayi
        RangeThread thread1 = new RangeThread(1, 10);
        NameThread thread2 = new NameThread("LaaluYadav");
        //start function ka prayog karke hamn dono threads ke run functions ko chala sakte hain
        thread1.start();
        thread2.start();
    }
}
