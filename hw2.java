// Вывести все простые числа от 1 до 1000


public class hw2 {
    public static void main(String[] args) {
        System.out.printf("Все простые числа от 1 до 1000 следующие: \n"); 
        int count = 0;
        for (int i = 2; i <= 1000; i++){
            for (int j = 1; j <= i-1; j++){
                if (i % j == 0 & i != j & j != 1){
                    count = 1;
                } 
            }  
            if (count == 0){
                System.out.printf("%d ", i);
                
            }
            count = 0;
        }
    }
  
}
