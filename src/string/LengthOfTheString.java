package string;

public class LengthOfTheString {
    public static void main(String[] args) {
        String name = "suman";
        int count=0;

        for(int i= 0; i<name.length(); i++) {
            if(name.charAt(i)!=' ') {
                count++;
            }
        }
        System.out.println(count);
    }


}
