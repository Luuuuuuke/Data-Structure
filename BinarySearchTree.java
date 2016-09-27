public class BinarySearchTree {	Node root;		private static class Node{		int value;		Node left;		Node right;		public Node(int data){			this.value = data;		}	}		public void insert(int val){		Node nd = new Node(val);		if(root == null){			root = nd;		}		else{			insertRec(root, nd);		}	}		private void insertRec(Node cur, Node nd){		if(nd.value <= cur.value){			if(cur.left == null){				cur.left = nd;			} else{				insertRec(cur.left, nd);			}		} else{			if(cur.right == null){				cur.right = nd;			} else{				insertRec(cur.right, nd);			}		}	}		public int getMin(){		if(root == null) return 0;		else{			Node cur = root;			while(cur.left != null){				cur = cur.left;			}			return cur.value;		}	}		public int getMax(){		if(root == null) return 0;		else{			Node cur = root;			while(cur.right != null){				cur = cur.right;			}			return cur.value;		}	}}