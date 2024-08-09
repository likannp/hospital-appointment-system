package hospital.util;

import java.util.concurrent.atomic.AtomicInteger;

public class IdentifierGenerator {
    private static final AtomicInteger queryCounter = new AtomicInteger(0);

    public static String generateQueryIdentifier() {
        return "Q-" + queryCounter.incrementAndGet();
    }
}
