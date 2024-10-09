package chain;

public class LowLevelHandler extends BaseHandler {

    @Override
    public void handle(int level, String data) {
        if (level <= 1)
            handleLowLevel(level, data);
        else
            nextHandler.handle(level, data);
    }

    private void handleLowLevel(int level, String data) {
        System.out.println("Low level was handled, level: " + level + ", data: " + data);
    }
}
