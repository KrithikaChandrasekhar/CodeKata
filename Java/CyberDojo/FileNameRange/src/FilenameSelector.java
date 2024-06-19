public class FilenameSelector {
    public int[] selectRange(String filename) {
        int start = 0;
        int end = filename.length();

        int lastSlash = filename.lastIndexOf('/');
        if (lastSlash != -1) start = lastSlash + 1;

        int lastDot = filename.lastIndexOf('.');
        if (lastDot != -1) end = lastDot;

        if (filename.isEmpty() || filename.equals("."))
            return new int[] {0, filename.length()};

        String[] keywords = { "tests", "test", "spec", "step"};
        String lowerFileName = filename.toLowerCase();

        for (String keyword : keywords) {
            int keywordIndex = lowerFileName.lastIndexOf(keyword);
            if (keywordIndex != -1 && keywordIndex < end) {
                end = keywordIndex;
            }
        }
        return new int[]{start, end};
    }
}
