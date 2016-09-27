// Stack implemented based on Linked Listpublic class LinkedListStack<T>{	Node top;		private static class Node<T>{		T data;		Node next;		public Node(T data){			this.data = data;			this.next = null;		}	}		public LinkedListStack(){			}		public void push(T ele){		Node newHead = new Node(ele);		newHead.next = top;		top = newHead;	}		public T pop(){		if(this.empty()) return null;		T temp = (T)top.data;		top = top.next;		return temp;	}		public boolean empty(){		if(top == null) return true;		else return false;	}		public T peek(){		if(this.empty()) return null;		return (T)top.data;	}		public String toString(){		StringBuilder sb = new StringBuilder();		while(!this.empty()){			sb.append(this.top.data.toString());			this.top = this.top.next;		}		return sb.toString();	}	}