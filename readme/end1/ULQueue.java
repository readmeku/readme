import java.util.*;

class QNode {
    int value;
    QNode next;
  
    public QNode(int value)
    {
        this.value = value;
        next = null;
    }
}
  
public class ULQueue {
    QNode front, rear;
	Stack<Integer> undostack = new Stack<Integer>(); 
	Stack<Integer> redostack = new Stack<Integer>(); 
	
    public ULQueue()
    {
        front = rear = null;
    }
  
    public void enqueue(int value)
    {
		undostack.push(1);
		undostack.push(value);
        // Create a new Linked List node
        QNode temp = new QNode(value);
  
        //If queue is empty, then front and rear both should point to new node
        if(front == null){
			front = temp;
			rear = temp;

		}
		//else insert the new node at the end of queue and change rear accordingly
		else{
			rear.next=temp;
			rear = rear.next;
		}
			
    }
  
    public Integer dequeue()
    {
		undostack.push(-1);
        Integer dqval = null; //dequeue value
        
		// If queue is empty, return null.
		if(front==null){
			return dqval;
		}
		// else remove the front value and return it.
		else{
			dqval = front.value;
			front = front.next;
		}
		
		undostack.push(dqval);
		return dqval;
    }
	
	public void undo(){
		if (undostack.empty())
			System.out.println("UNDO is not possible");
        //else UNDO the last action
		else{
			int element = undostack.pop();
			int action = undostack.pop();
			redostack.push(element);
			redostack.push(action);

			if(action==-1){
				if(front==null){
					enqueue(element);
				}
				else{
					QNode temp = new QNode(element);
					temp.next = front;
					front = temp;
				}
				

			}
			else if(action ==1){
				if(front.next==null){
					dequeue();
				}
				QNode temp = front;
				QNode prev = null;
				while(temp.next!=null){
					prev = temp;
					temp = temp.next;
				}
				prev.next = null;
				rear = prev;

			}
		}
	}
	public void redo(){
		if (redostack.empty())
			System.out.println("UNDO is not possible");

		else{
			int action = redostack.pop();
			int element = redostack.pop();
			undostack.push(action);
			undostack.push(element);
			if(action == 1){
				enqueue(element);
			}
			else if(action == -1){
				dequeue();
			}

		}
		
	}
	
	public String toString() // no need to modify anything in this function
	{
		QNode Current = front;
		String list = "<front>";
		
		if (front != null) // i.e., list is not empty
			list = list + " " + Current.value;
		else // i.e., empty list
			list = list + " null";
		
		while(Current != rear)
		{
			Current = Current.next;
			list = list + " " + Current.value;
		}
		list = list + " <rear>";
		return list;
	}
}
