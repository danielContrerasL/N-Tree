package n_treeStructure;

import constant.GameClass;
import entity.GameObject;

public class Tree {

	private NTreeNode<GameObject<GameClass>> root;
	
	public Tree(GameObject<GameClass> root) {
		this.root = new NTreeNode<GameObject<GameClass>>(root);
	}

	public void add(NTreeNode<GameObject<GameClass>> info) {
		root.getChildren().add(info);
	}
	
	public NTreeNode<GameObject<GameClass>>  getRoot() {
		return root;
	}

}
