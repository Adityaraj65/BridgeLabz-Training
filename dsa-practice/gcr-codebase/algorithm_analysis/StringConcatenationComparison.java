package algorithm_analysis;

public class StringConcatenationComparison {

    public static void main(String[] args) {

        int n = 1_000_000;

        // string immutable
        long start = System.nanoTime();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a"; // creates new object every time
        }
        long stringTime = System.nanoTime() - start;

        // string builder
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a"); // efficient mutable operation
        }
        long builderTime = System.nanoTime() - start;

        // string buffer
        start = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("a"); // thread-safe but slower
        }
        long bufferTime = System.nanoTime() - start;

        // Print results
        System.out.println("String Time: " + stringTime + " ns");
        System.out.println("StringBuilder Time: " + builderTime + " ns");
        System.out.println("StringBuffer Time: " + bufferTime + " ns");
    }
}

