public class fibo{

  private long last;
  private long next;

  public static void main(String[] args){
    fibo f = new fibo();
    long first = f.getFibo(1);
    long fifth = f.getFibo(5);
    long largeFib = f.getFibo(100);
    System.out.println(first);
    System.out.println(fifth);
    System.out.println(largeFib);
  }
  public fibo(){
    this.last = 1;
    this.next = 1;
  }

  long getNext(){
    long temp = this.next;
    this.next = this.next + this.last;
    this.last = temp;
    return this.next;
  }
  long getFibo(){
    return this.getNext();
  }
  long getFibo(int n){
    this.last = 1;
    this.next = 1 ;
    long fibo = 0;

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

