public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int a = 15;
        int b = 2;
        int c = soma(a, b);
        int d = subtracao(a,b);
        int e = multiplicacao(a,b);
        float f = divisao(a,b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        
    }
    public static int soma(int a, int b){
            return a+b;
        }
    
    public static int subtracao(int a, int b){
            return a-b;
        }
    
    public static int multiplicacao(int a, int b){
            return a*b;
        }
    
    public static float divisao(int a, int b){
            return a/b;
        }
}
