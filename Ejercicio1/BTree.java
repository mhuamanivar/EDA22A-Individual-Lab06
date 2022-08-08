
import java.util.ArrayList;


public class BTree<Key extends Comparable<Key>, Value>  {

    //ORDEN M
    private static final int ORDEN = 4;

    private Node root;       //Raiz
    private int height;      //Altura
    private int n;           //Cantidad de nodos

    private static final class Node {
        private int m;                             //Numero de claves
        private Entry[] children = new Entry[ORDEN];   //Arreglo de claves

        //Creacion de un nodo con k numero de hijos
        private Node(int k) {
            m = k;
        }
    }

    private static class Entry {
        private Comparable key;
        private Object val;
        private Node next;     // permite iterar sobre el arreglo de entradas
        public Entry(Comparable key, Object val, Node next) {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }

    public BTree() {
        root = new Node(0);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return n;
    }

    public int height() {
        return height;
    }

    //Get modificado para retornar todas las claves
    public ArrayList<Value> get(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        return search(root, key, height);
    }
    
    private ArrayList<Value> search(Node x, Key key, int ht) {
        Entry[] children = x.children;
        ArrayList<Value> vals = new ArrayList<Value>();
        if (ht == 0) {
            for (int j = 0; j < x.m; j++) {
                if (eq(key, children[j].key)) 
                	vals.add((Value)children[j].val);
            }
            return vals;
        }

        else {
            for (int j = 0; j < x.m; j++) {
                if (j+1 == x.m || less(key, children[j+1].key))
                    return search(children[j].next, key, ht-1);
                
            }
        }
        return vals;
    }
    
    public void put(Key key, Value val) {
        if (key == null) 
        	throw new IllegalArgumentException("argument key to put() is null");
        Node u = insert(root, key, val, height); 
        n++;
        if (u == null) return;

        //Fraccionando la raiz
        Node t = new Node(2);
        t.children[0] = new Entry(root.children[0].key, null, root);
        t.children[1] = new Entry(u.children[0].key, null, u);
        root = t;
        height++;
    }

    private Node insert(Node h, Key key, Value val, int ht) {
        int j;
        Entry t = new Entry(key, val, null);

        if (ht == 0) {
            for (j = 0; j < h.m; j++) {
                if (less(key, h.children[j].key)) 
                	break;
            }
        }

        else {
            for (j = 0; j < h.m; j++) {
                if ((j+1 == h.m) || less(key, h.children[j+1].key)) {
                    Node u = insert(h.children[j++].next, key, val, ht-1);
                    if (u == null) 
                    	return null;
                    t.key = u.children[0].key;
                    t.val = null;
                    t.next = u;
                    break;
                }
            }
        }

        for (int i = h.m; i > j; i--)
            h.children[i] = h.children[i-1];
        h.children[j] = t;
        h.m++;
        if (h.m < ORDEN) 
        	return null;
        else         
        	return split(h);
    }

    //Partiendo el nodo en la mitad
    private Node split(Node h) {
        Node t = new Node(ORDEN/2);
        h.m = ORDEN/2;
        for (int j = 0; j < ORDEN/2; j++)
            t.children[j] = h.children[ORDEN/2+j]; 
        return t;    
    }
    
    public String toString() {
        return toString(root, height, "") + "\n";
    }

    private String toString(Node h, int ht, String indent) {
        StringBuilder s = new StringBuilder();
        Entry[] children = h.children;

        if (ht == 0) {
            for (int j = 0; j < h.m; j++) {
                s.append(indent + children[j].key + " " + children[j].val + "\n");
            }
        }
        else {
            for (int j = 0; j < h.m; j++) {
                if (j > 0) 
                    s.append(indent + "(" + children[j].key + ")\n");
                s.append(toString(children[j].next, ht-1, indent + "     "));
            }
        }
        return s.toString();
    }

    private boolean less(Comparable k1, Comparable k2) {
        return k1.compareTo(k2) < 0;
    }

    private boolean eq(Comparable k1, Comparable k2) {
        return k1.compareTo(k2) == 0;
    }
}

