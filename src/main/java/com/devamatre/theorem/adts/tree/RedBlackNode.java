package com.devamatre.theorem.adts.tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * @author Rohtash Lakra
 * @created 10/5/23 2:20 PM
 */
@Getter
@Setter
@AllArgsConstructor
public class RedBlackNode<K extends Comparable, V extends Comparable> implements Comparable<RedBlackNode> {

    public static final boolean RED = true;
    public static final boolean BLACK = false;

    private RedBlackNode parent;
    private K key;
    private V value;
    private RedBlackNode left;
    private RedBlackNode right;
    private boolean color;
    private int size;

    /**
     * @param key
     * @param value
     * @param color
     */
    public RedBlackNode(K key, V value, boolean color) {
        this.key = key;
        this.value = value;
        this.color = color;
    }

    /**
     * @param key
     * @param value
     */
    public RedBlackNode(K key, V value) {
        this(key, value, RED);
    }

    /**
     * Compares this object with the specified object for order.  Returns a negative integer, zero, or a positive
     * integer as this object is less than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))} for all {@code x} and {@code y}.  (This implies that
     * {@code x.compareTo(y)} must throw an exception iff {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any class that implements the
     * {@code Comparable} interface and violates this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param other the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than
     * the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it from being compared to this object.
     */
    @Override
    public int compareTo(RedBlackNode other) {
        int result = 0;
        if (Objects.nonNull(getKey())) {
            result = getKey().compareTo(other.getKey());
            if (result == 0) {
                result = getValue().compareTo(other.getValue());
            }
        } else {
            result = getValue().compareTo(other.getValue());
        }

        return result;
    }

    /**
     * Returns true if the <code>color</code> is <code>RED</code> otherwise false.
     *
     * @return
     */
    public static boolean isRed(RedBlackNode redBlackNode) {
        return (redBlackNode != null && RED == redBlackNode.isColor());
    }

    /**
     * Rotates the left.
     * <p>
     * Right child red, left child black - rotate left.
     *
     * @param redBlackNode
     * @return
     */
    public static RedBlackNode rotateLeft(RedBlackNode redBlackNode) {
        Objects.requireNonNull(redBlackNode, "redBlackNode must not be null!");
        RedBlackNode temp = redBlackNode.getRight();
        redBlackNode.setRight(temp.getLeft());
        temp.setLeft(redBlackNode);
        temp.setColor(redBlackNode.isColor());
        redBlackNode.setColor(RedBlackNode.RED);
        return temp;
    }

    /**
     * Right rotation.
     * <p>
     * Left child, left-left grandchild red - rotate right.
     *
     * @param redBlackNode
     * @return
     */
    public static RedBlackNode rotateRight(RedBlackNode redBlackNode) {
        Objects.requireNonNull(redBlackNode, "redBlackNode must not be null!");
        RedBlackNode temp = redBlackNode.getLeft();
        redBlackNode.setLeft(temp.getRight());
        temp.setRight(redBlackNode);
        temp.setColor(redBlackNode.isColor());
        redBlackNode.setColor(RedBlackNode.RED);
        return temp;
    }

    /**
     * Flips the colors.
     * <p>
     * Both children red - flip colors.
     *
     * @param redBlackNode
     */
    public static void flipColors(RedBlackNode redBlackNode) {
        Objects.requireNonNull(redBlackNode, "redBlackNode must not be null!");
        assert !isRed(redBlackNode);
        assert isRed(redBlackNode.getLeft());
        assert isRed(redBlackNode.getRight());
        redBlackNode.setColor(RedBlackNode.RED);
        redBlackNode.getLeft().setColor(RedBlackNode.BLACK);
        redBlackNode.getRight().setColor(RedBlackNode.BLACK);
    }

}
