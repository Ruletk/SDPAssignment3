package chain;

public class MidLevelHandler extends BaseHandler {

    @Override
    public void handle(int level, String data) {
        if (level <= 100)
            handleMidLevel(level, data);
        else
            nextHandler.handle(level, data);

    }

    private void handleMidLevel(int level, String data) {
        System.out.println("Mid level handled, level: " + level + ", data: " + data);
    }
}
