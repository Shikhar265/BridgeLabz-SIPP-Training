public class Q2_CompareStringBufferAndStringBuilderPerformance {
    public static void main(String[] args) {
        int count = 1000000;

        long start1 = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < count; i++) sbuf.append("hello");
        long end1 = System.nanoTime();
        long timeBuffer = end1 - start1;

        long start2 = System.nanoTime();
        StringBuilder sbld = new StringBuilder();
        for (int i = 0; i < count; i++) sbld.append("hello");
        long end2 = System.nanoTime();
        long timeBuilder = end2 - start2;

        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");
    }
}
