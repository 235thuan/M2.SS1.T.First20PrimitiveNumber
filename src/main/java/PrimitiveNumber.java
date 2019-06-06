public class PrimitiveNumber {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        int number = 20;
        while (i < number) {
                boolean isPrime = true;
                if (count < 2) isPrime = false;
                for (int j = 2; j <= Math.sqrt(count); j++) {
                    if (count % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(count + " ");
                    i++;
                }
            count++;
        }
    }
}









//        int count = 0;
//        int i = 0;
//        int number = 100;
//        for (; i < number; i++) {
//            boolean isPrime = true;
//            if (count < 2) isPrime = false;
//            for (int j = 2; j <= Math.sqrt(count); j++) {
//                if (count % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.print(count + " ");
//                i++;
//            }
//            count++;
//        }
//    }
//}



