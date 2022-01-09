package day_14.stack_and_queue;

public class QueueImp
{
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        q.displayQueue();
        q.dequeue();
        q.displayQueue();
    }
}
