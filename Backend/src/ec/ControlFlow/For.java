package ec.ControlFlow;

public class For {
    public static void main(String[] args) {
        // It’s important to know the boundaries when using the for-loop iterator
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hey, it's an iterator index: %d %n", i);
        }

        for (int i=10; i>= 0;i--){
            System.out.printf("Hey, it's an iterator index: %d %n", i);
        }

        for (int i=0 ; i<10 ; i++){
            if (i%2==0){
                System.out.println("Its par "+i);
            }
            if (i%2 !=0){
                System.out.println("its inpar"+i);
            }
        }
    }
}

