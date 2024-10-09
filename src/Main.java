import chain.*;

public class Main {
    public static void main(String[] args) {
        testChain();
        
    }

    public static void testChain() {
        IHandler initial = HandlerFactory.createChain(
                new LowLevelHandler(), new MidLevelHandler(), new HighLevelHandler()
        );

        initial.handle(50, "I think it's low level");
        initial.handle(5, "Very simple task");
        initial.handle(500, "Very hard task");
        initial.handle(1, "Very very simple task");
        
        
    }
}