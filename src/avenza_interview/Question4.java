package avenza_interview;

public class Question4 {
    
    public static String getReverseString(String str) {
        int count=0;
        String arrayString[] = str.split(" ");
        String arrayString2[] = new String[arrayString.length];
        for (int i = arrayString.length-1; i >=0; i--) {
            arrayString2[count] = arrayString[i];
            count++;
        }
        return String.join(" ", arrayString2);
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(getReverseString(str));
    }
}
