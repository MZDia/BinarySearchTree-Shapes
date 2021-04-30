
// Written by Mia Dia
@SuppressWarnings("hiding")
public class LinkedBST
{
	private class Node 
	{
		shap data;
		Node leftChild;
		Node rightChild;
		public Node(shap aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	
	private Node root; // head
	public LinkedBST()
	{
		root = null;
	}
	public void add(shap aData)
	{
		if(root == null)
			root = new Node(aData);
		else
			add(root,aData);
	}
	
	public void removeVal(int val)
	{
		System.out.println("\n\nRemoving values with area greater than "+val);
		if(root == null)
			return;
		if(root.data.getArea()>val)
		{
			root = null;		
		}
		removeVal(root, val);
	}
	
	private void removeVal(Node aNode, int val)
	{
		if(aNode.rightChild == null)
		{
			return;
		}
		if(aNode.rightChild.data.getArea()>val)
		{
			remove(root, aNode.rightChild.data);
			removeVal(aNode, val);
		}
		else
		{
			removeVal(aNode.rightChild, val);
		}
	}
	
	private Node add(Node aNode, shap aData)
	{
		if(aNode == null)
			{aNode = new Node(aData);}
		else if(aData.compareTo(aNode.data)<0)//go left
			{aNode.leftChild = add(aNode.leftChild,aData);}
		else if(aData.compareTo(aNode.data)>0)//go right
			{aNode.rightChild = add(aNode.rightChild,aData);}
		return aNode;		
	}
	public void printPreorder()
	{
		printPreorder(root);
	}
	private void printPreorder(Node aNode)
	{
		if(aNode == null)
			return;
		System.out.println(aNode.data); // PROCESS
		printPreorder(aNode.leftChild); //left
		printPreorder(aNode.rightChild); // right
	}
	public void printInorder()
	{
		printInorder(root);
	}
	private void printInorder(Node aNode)
	{
		if(aNode == null)
			return;
		printInorder(aNode.leftChild); //left
		System.out.println(aNode.data); // PROCESS
		printInorder(aNode.rightChild); // right
	}
	
	public void printPostorder()
	{
		printPostorder(root);
	}
	
	private void printPostorder(Node aNode)
	{
		if(aNode == null)
			return;
		printPostorder(aNode.leftChild); //left
		printPostorder(aNode.rightChild); // right
		System.out.println(aNode.data); // PROCESS
	}
	public boolean search(shap aData)
	{
		return search(root, aData);
	}
	private boolean search(Node aNode, shap aData)
	{
		if(aNode == null)
			return false;
		else if(aData.compareTo(aNode.data)<0)//go left
			return search(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data)>0)//go right
			return search(aNode.rightChild,aData);
		else
			return true;
	}
	public void remove(shap aData)
	{
		root = remove(root,aData);
	}
	private Node remove(Node aNode, shap aData)
	{
		//find the node
		if(aNode == null)
			return null;
		else if(aData.compareTo(aNode.data)<0)
			aNode.leftChild = remove(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data)>0)
			aNode.rightChild = remove(aNode.rightChild,aData);
		else // found it!
		{
			if(aNode.rightChild == null)
				return aNode.leftChild;
			else if(aNode.leftChild == null)
				return aNode.rightChild;
			Node temp = findMinInTree(aNode.rightChild);
			aNode.data = temp.data;
			aNode.rightChild = remove(aNode.rightChild,temp.data);
		}
		return aNode;
	}
	private Node findMinInTree(Node aNode)
	{
		if(aNode == null)
			return null;
		else if(aNode.leftChild == null)
			return aNode;
		else
			return findMinInTree(aNode.leftChild);
	}
	private Node findMaxInTree(Node aNode)
	{
		if(aNode == null)
			return null;
		else if(aNode.rightChild == null)
			return aNode;
		else
			return findMaxInTree(aNode.rightChild);
	}
	///*
	
	
	
	//*/
}



















