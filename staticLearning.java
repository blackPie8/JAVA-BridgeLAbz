class Static{
static int var = 23;
static int n = 4;
static int staticBlock(int n){
    return n*n;
}

}

public class staticLearning {
    public static void main(String[] args) {
        int result  = Static.staticBlock(8);
        System.out.println(Static.var);
        System.out.println(result);
        
    }
}
