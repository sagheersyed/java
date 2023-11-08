public class Strings {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("sagheer"); //sagheer => reehgas => s - r , a - e , g - e , h - h

        System.out.println(sb);

        for(int i=0; i<sb.length()/2; i++) {
            int frontIndex = i;
            int backIndex = sb.length()-1-i;
            char frontChar = sb.charAt(frontIndex);
            char backChar = sb.charAt(backIndex);

            sb.setCharAt(frontIndex, backChar);
            sb.setCharAt(backIndex, frontChar);

        }

        System.out.println(sb);
    }
}
