package ec.TypeStrings;

public class StringConcatTest {
    public static void main(String[] args) {
        String a = "a1";
        String b = "b1";
        String c = "c1 -> ";
        StringBuilder sb = new StringBuilder(c);
        long initialTime = System.currentTimeMillis();
        for (int i =0 ; i < 50 ; i++){
//          c = c.concat(a).concat(b).concat("\n");
//            c += a+b +"\n";
            sb.append(a).append(b).append("\n");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - initialTime);
        System.out.println("C = " +sb.toString());

    }
}
