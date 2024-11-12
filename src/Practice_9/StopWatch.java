package Practice_9;

public class StopWatch {
    private long startTime;
    private long endTime;

    // Конструктор, инициализирует startTime текущим временем
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Сбрасывает startTime на текущее время
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Присваивает endTime текущее время
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Возвращает прошедшее время в миллисекундах
    public long getElapsedTime() {
        return endTime - startTime;
    }
}

