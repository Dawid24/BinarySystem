public class TaskBinarySystem2 {
    static StringBuilder reverse(String text) {
        StringBuilder sb = new StringBuilder(text).reverse();
        return sb;


        //2 rozwiązanie
        // if(text.equals(new StringBuilder(text).reverse().toString())) {
        //     System.out.println("palindrom");
        //}
    }
}