package chain;

public abstract class BaseHandler implements IHandler {
    protected IHandler nextHandler;

    public BaseHandler() {
        setNextHandler(new EmptyHandler());
    }

    @Override
    public void setNextHandler(IHandler handler) {
        nextHandler = handler;
    }
}
