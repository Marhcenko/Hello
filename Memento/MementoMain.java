package Memento;

class MementoMain {
    public static void main(String args[]) {
        Game game = new Game();
        game.setData(3,300);
        System.out.println("first playes :" + game);
        System.out.println("Save!!");

        File file = new File();
        file.setSave(game.save());

        game.setData(5,300);
        System.out.println("Second playes :" + game);
        System.out.println("load");
        game.load(file.getSave());
        System.out.println(game);
     }
}
class Game {
    private int lvl;
    private int second;
    public void setData(int lvl,int second){
        this.lvl = lvl;
        this.second = second;
    }
    public void load(Save save){
        lvl = save.getLvl();
        second = save.getSecond();
    }
    public Save save(){
        return new Save(lvl,second);
    }

    @Override
    public String toString() {
        return "Game{" +
                "lvl=" + lvl +
                ", second=" + second +
                '}';
    }
}
class Save {
    private int lvl;
    private int second;
    public Save(int lvl, int second) {
        this.lvl = lvl;
        this.second = second;
    }
    public int getLvl() {return lvl;}

    public void setLvl(int lvl) {this.lvl = lvl;}

    public int getSecond() {return second;}

    public void setSecond(int second) {this.second = second;}
}
class File {
    Save save;
    public Save getSave() {return save;}
    public void setSave(Save save) {this.save = save;}
}