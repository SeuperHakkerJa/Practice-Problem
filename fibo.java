public class fibo{

  private int last;
  private int next;

  public static void main(String[] args){
    fibo f = new fibo();
    int first = f.getFibo(1);
    int fifth = f.getFibo(5);
    int largeFib = f.getFibo(20);
    System.out.println(first);
    System.out.println(fifth);
    System.out.println(largeFib);
  }
  public fibo(){
    this.last = 1;
    this.next = 1;
  }

  int getNext(){
    int temp = this.next;
    this.next = this.next + this.last;
    this.last = temp;
    return this.next;
  }
  int getFibo(){
    return this.getNext();
  }
  int getFibo(int n){
    this.last = 1;
    this.next = 1 ;
    int fibo = 0;

    if (n <= 0) return 0;

    if (n == 1  || n == 2) { return this.next; }

    else{
      while (n >=3) {
        fibo = getNext();
        System.out.println(fibo);
        n--;
      }
      return fibo;
    }
  }

}

