class LinkedList {

	Node head = null;

	public LinkedList() {
		this.head = new Node(null);
	}

	public void add(String data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

	public void remove(String data) {

	}

	public String toString() {
		Node currentNode = this.head;
		String list = "";
		while (currentNode.next != null) {
			list += currentNode.data;
			currentNode = currentNode.next;

			if (currentNode.next != null) {
				list += ", ";
			}

		}
		return "List: " + list;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(("Dom"));
		list.add(("Lucas"));
		list.add(("Cacaca"));
		list.add(("awdawd"));

		System.out.println(list);

	}

	static class Node {

		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
		}

		public String toString() {
			return data;
		}

	}

}
