package day34_abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true; // static & final// public keyword gerek yok yazsan gri cikar its auto guven by default
  // you can not reassign these value zaten amaci disina cikar o zaman
    /*
    private static void main(String[] args) {
        System.out.println(isFriendly);
       // isFriendly = false;
    }
    default void method1(){ // bunu instande method olarak kullanabilirsin bu optional if you want to use it in interface
    }
    */



    // public abstract void play; this is abstract method ama public and abstract given by default
    void play(); // abstract
}
