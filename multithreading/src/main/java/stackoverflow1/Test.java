package stackoverflow1;

import java.util.concurrent.ForkJoinPool;

public class Test {
    private static Recorder recorder = new Recorder();
    private static StringBuilder builder;

    public static void main(String[] args) {
        try {
            builder.append("Test");
        } finally {
            ForkJoinPool pool = new ForkJoinPool();

            pool.submit(() -> {
                final Record record = new Record();
                record.setActionDetails(builder.toString());
                recorder.record(record);}
            );
        }
    }
}