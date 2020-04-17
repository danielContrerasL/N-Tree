package n_treeStructure;

import constant.GameClass;
import entity.GameObject;
import simpleList.Node;

public class InitTree {

	private Tree tree;

	public InitTree() {
		tree = new Tree(null);
		init();
	}
	
	public NTreeNode<GameObject<GameClass>> getTree() {
		return tree.getRoot();
	}

	private void init() {
		NTreeNode<GameObject<GameClass>> meleRank = new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.MELE));
		NTreeNode<GameObject<GameClass>> fighterNode = new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.FIGHTER));
		fighterNode.getChildren().add(new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.PALADIN)));
		fighterNode.getChildren().add(new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.BERSERKER)));
		fighterNode.getChildren().add(new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.ASSASSIN)));
		meleRank.getChildren().add(fighterNode);
		tree.add(meleRank);
		NTreeNode<GameObject<GameClass>> rankRank = new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.RANK));
		NTreeNode<GameObject<GameClass>> highDistanceNode = new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.HIGH));
		NTreeNode<GameObject<GameClass>> wizardNode = new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.WIZARD));
		wizardNode.getChildren().add(new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.DAMAGE_FIRE)));
		wizardNode.getChildren().add(new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.CONTROL_ICE)));
		highDistanceNode.getChildren().add(wizardNode);

		NTreeNode<GameObject<GameClass>> middleDistanceNode = new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.MIDDLE));
		NTreeNode<GameObject<GameClass>> archerNode = new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.ARCHER));
		archerNode.getChildren().add(new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.HUNTER)));
		archerNode.getChildren().add(new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.CROSSBOWER)));
		middleDistanceNode.getChildren().add(archerNode);
		NTreeNode<GameObject<GameClass>> supportNode = new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.SUPPORT));
		supportNode.getChildren().add(new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.HEALER)));
		supportNode.getChildren().add(new NTreeNode<GameObject<GameClass>>(new GameObject<GameClass>(GameClass.ENGINEER)));
		middleDistanceNode.getChildren().add(supportNode);
		rankRank.getChildren().add(highDistanceNode);
		rankRank.getChildren().add(middleDistanceNode);
		tree.add(rankRank);
	}
	
	public void print() {
		Node<NTreeNode<GameObject<GameClass>>> aux = tree.getRoot().getChildren().getHead();
		while (aux != null) {
			System.out.println(aux.getInfo().getData().getType().toString());
			aux = aux.getNext();
		}
	}

}
