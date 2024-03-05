package multithreading;

class Ex2_2 extends Thread{
    public void run(){
        for(int i=0; i<=1000; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Ex2_2 myTread1 = new Ex2_2();
        myTread1.start();

        for(int i=1000; i>=0; i--){
            System.out.println(i);
        }
    }
}
