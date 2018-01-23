
public class Node {

	Node left,right;
	int data;
	
	public Node(int data){
		this.data=data;
	}
	
	public void insert(int value){
		if(value<=data){
			if(left==null){
				left = new Node(value);
			}else{
				left.insert(value);
			}
		}else{
			if(right==null){
				right = new Node(value);
			}else{
				right.insert(value);
			}
		}
	}
	
	public boolean find(int value){
		
		if(value==data){
			return true;
		}
		if(value<data){
			if(left==null){
				return false;
			}else{
				return left.find(value);
			}
		}
		else{
			if(right==null){
				return false;
			}else{
				return right.find(value);
			}
		}
	}
	
	public void printInOrder(){	
		if(left!=null){
			left.printInOrder();
		}
		System.out.println(data);
		if(right!=null){
			right.printInOrder();
		}
	}
	
}

class Main{
	
	public static void main(String ags[]){
		Node root = new Node(44);
		root.insert(55);
		root.insert(8);
		System.out.println(root.find(5));
		root.printInOrder();
		
		
	}
	
}