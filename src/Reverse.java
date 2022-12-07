public class Reverse {

    public static void main(String[] args) {
        String s = "dcfhsdfkjhjkshf";
        String reverse = "";
        for(int i=s.length()-1;i>=0;i--){
            reverse =reverse+s.charAt(i);
        }
        System.out.println(reverse);
    }
}
