package Lesson_6;

public abstract class Animal {

    static final int SWIM_TRUE = 1;
    static final int SWIM_NO = -1;

    private String name;
    private String type;
    private float maxRun;
    private float maxJump;
    private float maxSwim;

    Animal(String type, String name, float maxJump, float maxRun, float maxSwim) {

        this.name = name;
        this.type = type;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    String getName() {
        return this.name;
    }

    String getType() {
        return this.type;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxJump() {
        return this.maxJump;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

     protected boolean run (float distance) {
        return (distance < maxRun);
    }

    protected int swim (float distance) {
        return (distance < maxSwim) ? SWIM_TRUE : SWIM_NO;
    }

    protected boolean jump (float height) {
        return (height < maxJump);
    }
}
