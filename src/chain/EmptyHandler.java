package chain;

public class EmptyHandler implements IHandler {

    @Override
    public void handle(int level, String data) {
        System.out.println("Handlers are ended!");
    }

    @Override
    public void setNextHandler(IHandler handler) {

    }
}
