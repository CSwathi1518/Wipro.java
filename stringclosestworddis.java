public class stringclosestworddis {
    public static void main(String[] args) {
        String str = "hi hello   hi how are you";
        String word1 = "hi";
        String word2 = "you";

        String[] words = str.split(" ");
        int minDistance = Integer.MAX_VALUE;
        int lastPosWord1 = -1;
        int lastPosWord2 = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                lastPosWord1 = i;
                if (lastPosWord2 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lastPosWord1 - lastPosWord2));
                }
            } else if (words[i].equals(word2)) {
                lastPosWord2 = i;
                if (lastPosWord1 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lastPosWord2 - lastPosWord1));
                }
            }
        }

        System.out.println(minDistance);
    }
}
