public class testULQueue {
    public static void main(String[] args)
    {
        System.out.println("\n**************** UNDOable Queue ****************\n");
		
		ULQueue q = new ULQueue();
		
		System.out.println("enqueue 5, 10, 15, and 20");
        q.enqueue(5);
		q.enqueue(10);
        q.enqueue(15);
		q.enqueue(20);
		System.out.println("    Queue:" + q);
		
        System.out.println("dequeued: " + q.dequeue());
        System.out.println("dequeued: " + q.dequeue());
        System.out.println("    Queue:" + q);
		
		
		System.out.println("UNDO =>");
		q.undo();
		System.out.println("    Queue:" + q); 	
				
		
		
		System.out.println("UNDO =>");
		q.undo();
		System.out.println("    Queue:" + q);
		
		
		
		System.out.println("UNDO =>");
		q.undo();
		System.out.println("    Queue:" + q);
				
				
		
		System.out.println("enqueue 30, 40, and 50");
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
		System.out.println("    Queue:" + q);
		
		System.out.println("UNDO =>");
		q.undo();
		System.out.println("    Queue:" + q);
        
        System.out.println("dequeued: " + q.dequeue());
        
		System.out.println("    Queue:" + q);
		
		System.out.println("UNDO =>");
		q.undo();
		System.out.println("    Queue:" + q);
		
		System.out.println("REDO =>");
		q.redo();
		System.out.println("    Queue:" + q);
		
		System.out.println("REDO =>");
		q.redo();
		System.out.println("    Queue:" + q);
		
    }
}