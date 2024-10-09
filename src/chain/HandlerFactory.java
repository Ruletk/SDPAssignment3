package chain;

public class HandlerFactory {
    public static IHandler createChain(IHandler... handlers) {
        for (int i = 0; i < handlers.length - 1; i++) {
            handlers[i].setNextHandler(handlers[i + 1]);
        }
        return handlers[0];
    }
}
