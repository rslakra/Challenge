/******************************************************************************
 * Copyright (C) Devamatre Inc 2009-2018. All rights reserved.
 *
 * This code is licensed to Devamatre under one or more contributor license 
 * agreements. The reproduction, transmission or use of this code, in source 
 * and binary forms, with or without modification, are permitted provided 
 * that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright
 * 	  notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 *
 * Devamatre reserves the right to modify the technical specifications and or 
 * features without any prior notice.
 *****************************************************************************/
package com.devamatre.theorem.adts.tree;

/**
 * @author Rohtash Lakra (rohtash.lakra@devamatre.com)
 * @author Rohtash Singh Lakra (rohtash.singh@gmail.com)
 * @version 1.0.0
 * @created 2018-01-13 04:36:10 PM
 * @since 1.0.0
 */
public class PairBinaryTreeTest {

    /**
     * @param pairBinaryTree
     */
    public static void fillPresidentTree(PairBinaryTree<String, String> pairBinaryTree) {
        pairBinaryTree.addNode("Lincoin");
        pairBinaryTree.addNode("Jefferson");
        pairBinaryTree.addNode("Jackson");
        pairBinaryTree.addNode("Adams");
        pairBinaryTree.addNode("Kennedy");
        pairBinaryTree.addNode("Washington");
        pairBinaryTree.addNode("Madison");
        pairBinaryTree.addNode("Roosevelt");
        pairBinaryTree.addNode("Buchanan");
    }

    /**
     * @param bTree
     */
    public static void fillAnimalSpeciesTree(PairBinaryTree<String, String> bTree) {
        bTree.addNode("Anamilia");
        bTree.addNode("Chordate");
        bTree.addNode("Mammal");
        bTree.addNode("Arthropoda");
        bTree.addNode("Insect");
        bTree.addNode("Primate");
        bTree.addNode("Carnivora");
        bTree.addNode("Diptera");
        bTree.addNode("Hominidac");
        bTree.addNode("Pongidae");
        bTree.addNode("Felidae");
        bTree.addNode("Muscidae");
        bTree.addNode("Homo");
        bTree.addNode("Pan");
        bTree.addNode("Felis");
        bTree.addNode("Musca");
        bTree.addNode("Sapiens");
        bTree.addNode("Troglodytes");
        bTree.addNode("Domestica");
        bTree.addNode("Leo");
        bTree.addNode("Domestica");
        bTree.addNode("Human");
        bTree.addNode("Chimpanzee");
        bTree.addNode("House Cat");
        bTree.addNode("Lion");
        bTree.addNode("Housefly");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        PairBinaryTree<String, String> bTree = new PairBinaryTree<>();
        fillPresidentTree(bTree);
        System.out.println("Size:" + bTree.getSize());
        System.out.println(bTree.findNode("Jackson"));
        System.out.println(bTree);
    }

}
