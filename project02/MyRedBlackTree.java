/**
 * Implemention file for CS 3345.HON.24F Programming Project #2.
 * <p>
 * Student name:
 * Student NetID: 
 *
 * @param <E> The element's type.
 */
public class MyRedBlackTree<E extends Comparable<? super E>> {
  /**
   * Instantiate an empty red-black tree.
   */
  public Node<E> root;
  private int size;
  private class Node<E> {
    public Node<E> left;
    public Node<E> right;
    public Node<E> parent;
    public E val;

    boolean color; //True is red, false is black
  }
  MyRedBlackTree() {
    this.root = null;
    size = 0;
  }

  /**
   * Print all elements of tree in sorted order with the color of each element's node.
   * Elements are printed one line at a time, each followed by a space and then
   * its color in paranethes.
   * Also, each element is indented a number of '=' equal to twice the node's depth.
   * <p>
   * For example, a tree containing 5, 10, 15, 20, 25, and 30 might be printed as
   * ```
   * ==5 (black)
   * 10 (black)
   * ====15 (black)
   * ==20 (red)
   * ====25 (black)
   * ======30 (red)
   * ```
   * <p>
   * Implementation should run in O(n) time for a tree of n elements.
   */
  public void printAll() {
    String depth = "";
    printAll(this.root, depth);
  }
  public void printAll(Node<E> node, String depth) {
    printAll(node.left, depth+"==");
    System.out.println(depth+node.val.toString());
    printAll(node.right, depth+"==")
  }
  /**
   * Returns whether or not the tree contains the given element.
   * <p>
   * Implementation should run in O(log n) time for a tree of n elements.
   *
   * @param element The element to find.
   * @returns true if the tree contains the element or false otherwise.
   */
  public boolean contains(E element) {
    Node<E> node = root;
    int cmp;
    while(node != null) {
      cmp = element.compareTo(node.val);
      if(cmp < 0) {
        node = node.left;
      }
      else if(cmp > 0) {
        node = node.right;
      }
      else {
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the minimum element of the tree.
   * <p>
   * Implementation should run in O(log n) time for a tree of n elements.
   *
   * @returns The minimum element of the tree or null if tree is empty.
   */
  public E findMin() {

  }

  /**
   * Returns the maximum element of the tree.
   * <p>
   * Implementation should run in O(log n) time for a tree of n elements.
   *
   * @returns The maximum element of the tree or null if tree is empty.
   */
  public E findMax() {

  }

  /**
   * Inserts a new element into the tree.
   * If the element already exists in the tree, this method makes no changes.
   * <p>
   * Implementation should run in O(log n) time for a tree of n elements.
   *
   * @param element The element to be inserted.
   */
  public void insert(E element) {

  }

  /**
   * Removes the element from the tree.
   * If the element does not exist in the tree, this method makes no changes.
   * <p>
   * Implementation should run in O(log n) time for a tree of n elements.
   *
   * @param element The element to be removed.
   */
  public void remove(E element) {

  }

  /**
   * Returns number of elements in tree.
   * <p>
   * Implementation should run in O(1) time for a tree of n elements.
   *
   * @returns Number of elements in list.
   */
  public int size() {

  }
}

