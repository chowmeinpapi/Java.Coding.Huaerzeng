public class Runner {
    //your main containing tests and output
    public static void main(String[] args) {
        System.out.println(icyHot(80,90));
        System.out.println(stringSplosion("odd"));
        System.out.println(minCat("Hell","Hilly"));
        int[] a = {1,2};
        int[] b = {3,4};
        System.out.println(biggerTwo(a,b));
        System.out.println(inOrder(2,3,6,false));
        int small = 3;
        int big = 1;
        int goal = 8;
        System.out.println(makeBricks(small, big, goal));
        System.out.println(endOther("Hiabc","abc"));
    }


    //your codingbat method here - must match
    // the method name from codingbat
    public static boolean icyHot(int temp1, int temp2){
        if (temp1 > 100 && temp2 < 0 || temp1 < 0 && temp2 > 100){
            return true;
        }else{
            return false;
        }
    }
    public static String stringSplosion(String str){
        String answer = "";
        for(int i = 0; i<str.length(); i++){
            answer += str.substring(0,i+1);
        }
        return answer;
    }
    public static String minCat(String str1, String str2){
        String totalString = "";
        String newStr1 = "";
        //newStr1.equals(str1.substring(str1.length()-str2.length(),str1.length()));
        String newStr2 = "";
        //newStr2.equals(str2.substring(str2.length()-str1.length(),str2.length()));
        if(str1.length() < str2.length()){
            totalString += str1 + str2.substring(str2.length()-str1.length(),str2.length());
        } else if(str1.length() > str2.length()){
            totalString += str1.substring(str1.length()-str2.length(),str1.length()) + str2;
        } else{
            totalString += str1+str2;
        }
        return totalString;
    }
    public static int[] biggerTwo(int[] a,int[] b){
        int newa = a[0] + a[1];
        int newb = b[0] + b[1];
        if(newa > newb){
            return a;
        }else if(newb > newa){
            return b;
        }else{
            return a;
        }
    }
    public static boolean inOrder(int a, int b, int c, boolean bOk){
        if(bOk == true && c > b){
            return true;
        }else if(a < b && b < c){
            return true;
        }
        return false;

    }
    public static boolean makeBricks(int small, int big, int goal) {
        if (goal > (big * 5 + small)) {
            return false;
        } else {
            return goal % 5 <= small;
        }
    }
    public static boolean endOther(String a, String b) {
        if(a.length() < b.length()) {
            String temp = a;
            a = b.toLowerCase();
            b = temp.toLowerCase();
        }

        return a.substring(a.length() - b.length()).equals(b);
    }

    // next codingbat method here
}
