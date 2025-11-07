package com.y4ncx.analizador;

import com.y4ncx.analizador.estructuras.*;

public class PruebaListas {
    public static void main(String[] args) {
        System.out.println("=== Lista Simple ===");
        SinglyLinkedList<Integer> simple = new SinglyLinkedList<>();
        simple.addLast(10);
        simple.addLast(20);
        simple.addFirst(5);
        simple.printList();
        simple.removeLast();
        simple.printList();

        System.out.println("\n=== Lista Doble ===");
        DoublyLinkedList<Integer> doble = new DoublyLinkedList<>();
        doble.addFirst(1);
        doble.addLast(2);
        doble.addLast(3);
        doble.printForward();
        doble.printBackward();
        doble.removeLast();
        doble.printForward();
    }
}
