package lambda;

public class RunnableLambda {
    public static void main(String[] args) {
        // Prior to Java 8
        Runnable priorRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside the anonymous inner class");
            }
        };
        new Thread(priorRunnable).start();

        // Java 8
        Runnable java8Runnable = () -> System.out.println("Inside runnable lambda");
        new Thread(java8Runnable).start();
    }
}