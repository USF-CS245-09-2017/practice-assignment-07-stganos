
public class LinkedList<T>
{
	//constructor
	public LinkedList()
	{
		int size = 0;
		Node head = null;
	}//constuctor

	//add item at the end of the list
	public void add(T item)
	{
		if(head == null)
		{
			Node<T> newNode = new Node(item);
			head = newNode;
			size++;
		}//if

		else
		{
			Node prev = head;
			for (int i = 0; i < size - 1; i++)
			{
				prev = prev.get_next();
			}//for
			Node<T> newNode = new Node(item);
			prev.set_next(newNode);
			size++;
		}//else
	}//add

	//add item to the given position
	public void add(int pos, T item)
	{
		if (pos <= size && pos > 0)
		{
			size++;
			Node prev = head;
			for (int i = 0; i < pos - 1; i++)
			{
				prev = prev.get_next();
			}
			Node newNode = new Node(item);
			node.set_next(prev.get_next());
			prev.set_next(newNode);
		}//if

		else if(pos == 0)
		{
			Node newNode = new Node(item);
			newNode.set_next(head);
			head = newNode;
		}//else if

		else
		{
			System.out.println("Sorry that position does not exist, please try a different one.");
		}//else
	}//add at position

	//gets data from requested position
	public T get(int pos)
	{
		if (pos >= 0 && pos < size)
		{
			Node curr = head;
			for (int i = 0; i < pos; i++)
			{
				curr = curr.get_next();
			}//for
			return curr.get_data();
		}//if
		
		else
		{
			System.out.println("Sorry that element does not exist, please try a different one.");
			return null;
		}//else
	}//get

	//removes from given postion and returns the data
	public T remove(int pos)
	{
		if (pos > 0 && pos < size)
		{
			Node prev = head;
			for (int i = 0; i < pos; i++)
			{
				prev = prev.get_next();
			}
			Node curr = prev.get_next();
			prev.set_next(curr.get_next());
			size--;
			return curr.get_data();
		}//if

		else if (pos == 0)
		{
			Node curr = head;
			head = curr.get_next();
			size--;
			return curr.get_data();
		}//else if

		else
		{
			System.out.println("Sorry that position does not exist, please try a different one.");
			return null;
		}//else
	}//remove

	//returns the number of elements in the list
	public int size()
	{
		return size;
	}//size
}