package chain;

public class HighLevelHandler extends BaseHandler {

    @Override
    public void handle(int level, String data) {
        if (level > 100) handleHighLevel(level, data);
        else nextHandler.handle(level, data);
    }

    private void handleHighLevel(int level, String data) {
        System.out.println("HIgh level handled, level: " + level + ", data: " + data);
    }
}
