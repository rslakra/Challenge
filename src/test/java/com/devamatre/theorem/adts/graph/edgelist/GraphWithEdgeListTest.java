package com.devamatre.theorem.adts.graph.edgelist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertNotNull;

import com.devamatre.theorem.adts.graph.AbstractGraphTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * @author Rohtash Lakra
 * @created 9/9/23 5:01 PM
 */
public class GraphWithEdgeListTest extends AbstractGraphTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(GraphWithEdgeListTest.class);

    /**
     * Tests the <code>createGraph</code> method.
     */
    @Override
    public void testCreateGraph() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testIsWeighted() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testIsDirected() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testGetSize() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testStartNode() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testAddEdgeWithWeight() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testAddEdge() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testHasEdge() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testFindEdge() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testRemoveEdge() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testGetNeighbors() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testGetVerticesConnectedTo() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testPrintGraph() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testGetInwardEdges() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testGetOutwardEdges() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testGetSortedVertices() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testHasCycle() {

    }

    /**
     * Tests the <code></code> method.
     */
    @Override
    public void testSearchEdge() {

    }

    @Test
    public void testGraph() {
        GraphWithEdgeList<Integer> graph = new GraphWithEdgeList<>();
        createGraph(graph);
        LOGGER.debug("graph:{}", graph);
        assertNotNull(graph);
//        assertEquals(5, graph.getSize());
//
//        // Print the adjacency list representation of the above graph
//        graph.printGraph();
//
//        // Search the given edge in the graph
//        graph.searchEdge(2, 1);
//        graph.searchEdge(0, 3);
    }
}
