 class One extends Thread {

    public void run() {
        for(int i=0;i<10;i++){
        System.out.println("1");}
        }
}

 class Two extends Thread {

    public void run() {
        for(int j=0;j<10;j++){
        System.out.println("2");}
        }
  
}
class a8q8
{
public static void main(String args[])
{
One thr1=new One();
Two thr2=new Two();
thr1.start();
thr2.start();
}
}

