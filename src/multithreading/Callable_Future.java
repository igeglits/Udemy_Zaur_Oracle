package multithreading;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.concurrent.*;

class Callable_Future {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Factorial factorial = new Factorial(5);
        //executorService.execute(factorial);
        Future<Integer> future = executorService.submit(factorial); // submit возвращает Future, а execute нет
        // (Future - это интерфейс, который позволяет получить результат работы потока)
        try {
            factorialResult = future.get(); // get - метод, который возвращает результат работы потока
        } catch (ExecutionException e) {
            System.out.println(e.getCause());// getCause - метод, который возвращает причину исключения
            // (Throwable) в потоке Factorial  throw new Exception("f <= 0");
        }
        finally {
            executorService.shutdown();
        }
        //executorService.shutdown();
        //executorService.awaitTermination(10, TimeUnit.SECONDS); // ждем 10 секунд и останавливаем пул потоков,
        // без ожидания main завершится раньше чем поток и не выведет результат, а выведет 0.
        System.out.println(factorialResult);
    }
}

@NoArgsConstructor
@AllArgsConstructor
class Factorial implements Callable<Integer> {// Callable - интерфейс,
    // который позволяет получить результат работы потока (возвращает значение)
    // и выбрасывать исключения (throws Exception)
    int f;

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("f <= 0");
        } else {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result *= i;
            }
            return result;
        }
    }

}
/*@AllArgsConstructor//
@NoArgsConstructor // lombok - плагин, который генерирует геттеры, сеттеры, конструкторы и т.д. автоматически
class Factorial implements Runnable {// Runnable - интерфейс, который позволяет создать поток

    int f;

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("result = 1");;
            return;
        } else {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result *= i;
            }
            Callable_Future.factorialResult = result;
        }
    }
}*/
