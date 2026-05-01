package game.main;
import game.model.*;
import game.util.Party;
import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Party<Hero> myParty = new Party<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== WELCOME TO HERO QUEST ===");
        
        Warrior hero1 = new Warrior("Aragon");
        Mage hero2 = new Mage("Gandalf");
        
        myParty.addMember(hero1);
        myParty.addMember(hero2);
        
        System.out.println("Party kamu telah dibentuk!");
        
        for (Hero h : myParty.getMembers()) {
            System.out.println("\nHero: " + h.getName() + " (HP: " + h.getHp() + ")");
            h.attack();
            
            if (h instanceof Warrior) {
                ((Warrior) h).useSpecialSkill();
            } else if (h instanceof Mage) {
                ((Mage) h).useSpecialSkill();
            }
        }
        
        System.out.println("\nPetualangan dimulai...");
        scanner.close();
    }
}