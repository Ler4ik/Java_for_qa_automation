package module_6_oop_basics.musical_instrument;

public class Main {

    //Solution for exercise 6.8.4

    public static void main(String args[]) {

        Guitarist ritchie = new Guitarist("Ричард");
        Keyboardist john = new Keyboardist("Джон");
        Musician david = new Musician("Давид");

        Musician[] musicians = {ritchie, john, david};

        for (Musician m : musicians){
            m.play();
        }
    }
}

class Musician {
    protected String name;
    public void play(){
        System.out.println(this.name + " играет на всем, до чего может дотянуться.");
    }

    public Musician(String name){
        this.name = name;
    }
}
class Guitarist extends Musician {

    public Guitarist(String name) {
        super(name);
    }

    @Override
    public void play(){
        System.out.println(this.name + " играет на гитаре.");
    }

}
class Keyboardist extends Musician {
    public Keyboardist(String name) {
        super(name);
    }

    @Override
    public void play(){
        System.out.println(this.name + " играет на фортепиано.");
    }
}