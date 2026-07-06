public class exception2 {
    public static void main(String[] args) {
        int i = 0;
        String greeting[] = {
            "Hello World",
            "No, i mean it!",
            "HELLO WORLD!"
        };
        while (i<4) {
            try {
                System.out.println(greeting[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index value");
                i=0;
            }
        }
    }    
    
}