package decorator_pattern;

public class Decorator_pattern {

    public static void main(String[] args) {
        Troll troll = new SimpleTroll();
        troll.attack(); // The troll tries to grab you!
        troll.fleeBattle(); // The troll shrieks in horror and runs away!

        System.out.println("\nAfter Decoration\n");
        // change the behavior of the simple troll by adding a decorator
        ClubbedTroll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack(); // The troll tries to grab you! The troll swings at you with a club!
        clubbedTroll.fleeBattle(); // The troll shrieks in horror and runs away!

    }

}
