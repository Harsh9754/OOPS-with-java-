interface test {

    int square();
}


class arithmetic implements test{
    int b;
    arithmetic (int x){
        b=x;
    }
    public int square(){
        return(b*b);
    }
}
class ToTestInt{
    public int return_ans(int x){
        arithmetic a = new arithmetic(x);
        return a.square();
    }
}
public class Arithmetic{
    public static void main(String[] args) {
        int n=16;
        ToTestInt x = new ToTestInt();
        System.out.println("square of "+n+"is"+x.return_ans(n)); 
    }
}