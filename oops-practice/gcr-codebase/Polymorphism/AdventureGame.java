class GameCharacter {
    protected String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println(characterName + " attacks!");
    }
}

class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " swings a sword!");
    }
}

class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " casts a spell!");
    }
}

class Archer extends GameCharacter {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " fires an arrow!");
    }
}

public class AdventureGame {
    public static void startBattle(GameCharacter[] characters) {
        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        for (GameCharacter character : characters) {
            character.performAttack();

            if (character instanceof Warrior) {
                warriorCount++;
            } else if (character instanceof Mage) {
                mageCount++;
            } else if (character instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("Warriors: " + warriorCount);
        System.out.println("Mages: " + mageCount);
        System.out.println("Archers: " + archerCount);
    }

    public static void main(String[] args) {
        GameCharacter[] chars = {
                new Warrior("Thor"),
                new Mage("Gandalf"),
                new Archer("Legolas")
        };

        startBattle(chars);
    }
}
