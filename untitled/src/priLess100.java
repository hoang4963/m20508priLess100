public class priLess100 {
    public static void main(String[] args) {
        System.out.println('2');
        boolean check = true;
        for (int i = 3; i<=100; i++){
            for (int j = 2 ; j < i; j++){
                if (i % j == 0){
                    check = false;
                }
            }
            if (check){
                System.out.println(i);
            }
            check = true;
        }

    }
}
