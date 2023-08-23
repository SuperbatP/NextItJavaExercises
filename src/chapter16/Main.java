package chapter16;

public class Main {
    interface punchable{
        void punch();
    }
    interface walkable{
        void walk(String a);
    }

    interface swimmalbe{
        String swim(String a, String b);
    }
    public static void main(String[] args) {

        walkable walk = a -> {};
        punchable punch = () -> {};

        swimmalbe swim = (a,b) -> {return a+b;};
        swimmalbe swim1 = (a,b) ->  a+b;
        //

    }
}
