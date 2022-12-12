package it.develhope.booleanOperators3;

public class Main {
    public static void main(String[] args) {

        boolean a = !(!(!(false ^ false) || (true && true))); //TRUE, false^false sarebbe false, ma viene cambiato dal
        // NOT fuori parentesi, mentre true&&true è true, quindi il risultato è true, che diventerà false e poi
        // nuovamente true grazie ai due operatori NOT
        boolean b = !((3 * 2) <= 6) && (3 - 2 != 1); //FALSE, 3*2 è uguale a 6 quindi true, ma diventa false grazie al
        // NOT, 3-2 non è diverso da 1 e quindi utilizzando AND si ottiene false

        System.out.println(a);
        System.out.println(b);
    }
}
