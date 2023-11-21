public class Strings {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("sagheer"); //sagheer => reehgas => s - r , a - e , g - e , h - h

//        System.out.println(sb);

        for(int i=0; i<sb.length()/2; i++) {
            int frontIndex = i;
            int backIndex = sb.length()-1-i;
            char frontChar = sb.charAt(frontIndex);
            char backChar = sb.charAt(backIndex);

            sb.setCharAt(frontIndex, backChar);
            sb.setCharAt(backIndex, frontChar);

        }
//
//        System.out.println(sb);
        int number = 12201;
        System.out.println("original number : " + number);
        int reversed = 0;
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("reversed number" + reversed);

        int num = 1234;
        String strNum [] = String.valueOf(num).split(" ");
        int count = strNum.length;
        for(int i=0; i< strNum.length/2; i++) {
            String temp = "";
            temp =  strNum[i];
            strNum[i] = strNum[count];
            strNum[count] = temp;
            count--;
        }
        System.out.println(strNum);

        int isPos = -10;
        if(isPos >= 0) {
            System.out.println("the number is pos");
        }
        else {
            System.out.println("the number is neg");
        }
    }
}
