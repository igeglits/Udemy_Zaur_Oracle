package multithreading;

public class Ex3_3 implements Runnable{
    public void run(){
        for(int i=0; i<=1000; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ex3_3());
        thread1.start();
        for(int i=1000; i>=0; i--){
            System.out.println(i);
        }

    }
}
