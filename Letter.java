package Lab5;

public class Letter {
    private char letter;
    public Letter(char letter){
        this.letter = letter;
    }

    @Override
    public String toString(){
        return "" + this.letter;
    }
}
