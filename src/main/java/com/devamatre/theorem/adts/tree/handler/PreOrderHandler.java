package com.devamatre.theorem.adts.tree.handler;

import com.devamatre.appsuite.core.BeanUtils;
import com.devamatre.theorem.adts.Maths;
import com.devamatre.theorem.adts.array.ArrayUtils;
import com.devamatre.theorem.adts.tree.Node;
import com.devamatre.theorem.adts.tree.TraversalMode;
import com.devamatre.theorem.adts.tree.TreeUtils;

import java.util.List;

/**
 * The <code>PreOrderHandler</code>.
 *
 * <pre>(RootNode -> LeftNode -> RightNode)</pre>
 *
 * @author Rohtash Lakra
 * @created 11/25/23 4:18 PM
 */
public class PreOrderHandler<E extends Comparable<? super E>> extends AbstractTreeHandler<E> {

    /**
     * Handles the preOrder operations.
     */
    public PreOrderHandler() {
        super(TraversalMode.PRE_ORDER_TRAVERSAL);
    }

    /**
     * The pre-order <code>(rootNode -> leftNode -> rightNode)</code> data should be provided in the specified order. If
     * there is no leaf node, it should either be null or -1 as value. The tree is build in the order data is provided.
     *
     * @param preOrderData
     * @return
     */
    private Node<E> buildPreOrder(E[] preOrderData) {
        index++;
        if (index < 0 || index >= preOrderData.length) { // check index is valid or not
            return null;
        } else if (Maths.isEmptyOrMinusOne(preOrderData[index])) { // is null/empty/-1 data
            return null;
        }

        Node<E> newNode = new Node<>(preOrderData[index]);
        newNode.setLeft(buildPreOrder(preOrderData));
        newNode.setRight(buildPreOrder(preOrderData));

        return newNode;
    }

    /**
     * Returns the <code>treeNode</code> builds with an array of <code>E</code> data.
     *
     * @param elements
     * @return
     */
    @Override
    public Node<E> buildTree(E[] elements) {
        if (TraversalMode.PRE_ORDER_TRAVERSAL == getTraversalMode() && BeanUtils.isNotEmpty(elements)) {
            setIndex(-1);
            setRoot(buildPreOrder(elements));
            setSize(TreeUtils.getCount(root));
            return root;
        }

        return null;
    }

    /**
     * Converts the <code>treeNode</code> into an array of <code>E</code> type. If the <code>includeNullLeafs</code> is
     * set to be true, the leafs with null included in the results.
     *
     * @param treeNode
     * @param includeNullLeafs
     * @return
     */
    @Override
    public E[] treeConverter(Node<E> treeNode, boolean includeNullLeafs) {
        List<E> data = TreeUtils.preOrder(treeNode, includeNullLeafs);
        ArrayUtils.replaceNullWithMinus(data);
        return ArrayUtils.toIntArray(data);
    }

    /**
     * Converts the <code>treeNode</code> into an array of <code>E</code> type.
     *
     * @param treeNode
     * @return
     */
    @Override
    public E[] treeConverter(Node<E> treeNode) {
        return treeConverter(treeNode, false);
    }

}
