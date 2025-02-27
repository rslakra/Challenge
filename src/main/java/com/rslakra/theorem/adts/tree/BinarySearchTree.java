package com.rslakra.theorem.adts.tree;

/**
 * Handle the binary tree management. This binary tree does not allow duplicate values.
 * <p>
 * Rules are:
 * <pre>
 *  1. Left subTree should be less than root
 *  2. Right subTree should be greater than root
 *  3. Left and Right subTrees are also BST without duplicates.
 * </pre>
 *
 * <url>https://en.wikipedia.org/wiki/Binary_search_tree</url>
 *
 * @author Rohtash Lakra
 * @created 12/5/23 7:36 AM
 */
public class BinarySearchTree<E extends Comparable<? super E>> extends BinaryTree<E> {

    /**
     * Helps to handle if the binary tree allows duplicates or not.
     * <p>
     * By default, this binary search tree doesn't allow duplicates.
     *
     * @param allowDuplicates
     */
    public BinarySearchTree(boolean allowDuplicates) {
        super(allowDuplicates);
    }

    /**
     * Helps to handle if the binary tree allows duplicates or not.
     * <p>
     * By default, this binary search tree doesn't allow duplicates.
     */
    public BinarySearchTree() {
        this(false);
    }

}
