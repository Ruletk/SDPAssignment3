package chain;

public interface IHandler {
    void handle(int level, String data);

    void setNextHandler(IHandler handler);
}
