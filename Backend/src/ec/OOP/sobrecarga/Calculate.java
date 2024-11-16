package ec.OOP.sobrecarga;

public class Calculate {
    private Calculate() {
    }
    //!Sobrecarga de metdos , distintos metodos con el mismo nombre con una implemetacion diferente y metods diferentes
    public static   int add (int a, int b){
        return a+b;
    }
    public static float add (float a, float b){
        return a+b;
    }
    public static float  add (float a , int b){
        return a+b;
    }
    public static float add (int a , float b){
        return a+b;
    }
    public static double add (double a, double b){
        return a+b;
    }
    public static int add (String a, String b){
        int result = 0;
        try {
            result = Integer.parseInt(a) + Integer.parseInt(b);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        return  result;
    }
    public static  int add ( int a , int b , int c ){
        return a+b+c;
    }
    public static long add (long a, long b){
        return a+b;
    }
    //Varargs siempre tiene que ser del mismo tipo y  es un n cantidad de argumentos , es un arreglo
    public static int add(int... arguments){
        int total=0;
        int maxLength = arguments.length;
        for (int i=0; i<maxLength; i++){
            total+=arguments[i];
        }
        return total;
    }
    public static float add (float... arguments){
        float total=0;
        int maxLength = arguments.length;
        for (int i=0; i<maxLength; i++){
            total+=arguments[i];
        }
        return total;
    }
    public static float add (int a , int ... arguments){
        float total=0;
        for(float arg : arguments){
            total+=arg;
        }
        return total;
    }
    public static   double add ( double ... varargs){
        double total=0;
        for ( double arg : varargs ){
            total += arg;
        }
        return total;
    }

    public static int subtract (int a, int b){
        return a-b;
    }

}
