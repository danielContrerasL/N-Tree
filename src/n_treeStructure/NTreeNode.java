package n_treeStructure;

import simpleList.MyLinkedList;

public class NTreeNode<T> {
	
	private T info;
	private NTreeNode<T> parent;
	private MyLinkedList<NTreeNode<T>> children;
	
	

	public NTreeNode(T info) {
		this.info = info;
		children = new MyLinkedList<>();
	}

	public T getData() {
		return info;
	}

	public void setData(T data) {
		this.info = data;
	}

	public NTreeNode<T> getParent() {
		return parent;
	}

	public MyLinkedList<NTreeNode<T>> getChildren() {
		return children;
	}

	public void setChildren(MyLinkedList<NTreeNode<T>> children) {
		this.children = children;
	}
	
	

}
