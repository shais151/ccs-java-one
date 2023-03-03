public class Fighter {

    // Field Declarations
    // TODO:  Put the correct specifiers for each declaration.

    private final String name;

    private final String type;

    private final int skill;

    private int stamina;

    private final GameEngine theGameEngine;

    public static final int DAMAGE_VALUE = 2;

    /**
     * Construct a fighter, given a name, type, attributes and reference to the game engine.
     */
    Fighter(String name, String type, int skill, int stamina, GameEngine theGameEngine) {
        this.name = name;
        this.type = type;
        this.skill = skill;
        this.stamina = stamina;
        this.theGameEngine = theGameEngine;
    }

    public void takeDamage(int damage) {
        if (!isDead()) {
            this.stamina -= damage;
        }
    }

    // TODO:  Return the number of damage points to be inflicted on opponent
    public int calculateDamage() {
        return DAMAGE_VALUE;
    }

    // TODO: Calculate an attack score for the fighter using the procedure:
    /*
    This is obtained by rolling two dice, and adding the result to the fighter's skill.
     If both fighters compute the same attack score, the round results in a draw.
     Otherwise, the fighter with the higher attack score hits the fighter with the lower attack score,
     whose stamina is reduced by two (or set to zero if it is currently set to one).
    * */
    public int calculateAttackScore() {
        return theGameEngine.rollDice() + theGameEngine.rollDice() + skill;
    }

    public String getName() {
        return name;
    }
    // TODO: Answer this question.
    // Why don't we need more getters?

    public String toString() {
        return name + " - " + type + " - skill: " + skill + "; stamina: " + stamina;
    }

    public boolean isDead() {
        return stamina <= 0;
    }
    // TODO: Answer this question.
    // Why not simply have a boolean that specifies whether the fighter is dead or not?
}