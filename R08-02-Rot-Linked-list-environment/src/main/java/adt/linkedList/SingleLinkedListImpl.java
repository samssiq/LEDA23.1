package adt.linkedList;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
	}

	@Override
	public boolean isEmpty() {
		if (head.isNIL()) {
			return true;
		}
		throw new UnsupportedOperationException("Not implemented!");
	}

	@Override
	public int size() {
		int size = 0;
		SingleLinkedListNode<T> auxHead = this.head;
		while (!auxHead.next.isNIL()) {
			auxHead = head.next;
			size++;
		}
		return size;
	}

	@Override
	public T search(T element) {

		throw new UnsupportedOperationException("Not implemented!");
	}

	@Override
	public void insert(T element) {
		SingleLinkedListNode<T> auxHead = this.head;
		if (head.isNIL()) {
			SingleLinkedListNode<T> newHead = new SingleLinkedListNode<T>(element, this.head);
			newHead.next = head;
			head = newHead;
		} else {
			while (!auxHead.next.isNIL()) {
				auxHead = auxHead.next;
			}
			auxHead.next = new SingleLinkedListNode<T>();
			auxHead.data = element;
		}
	}

	@Override
	public void remove(T element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented!");
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented!");
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}
