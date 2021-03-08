public class Main {
    public static void main(String[] args) {
        //Параметризируем класс типом String
        Box<String> box1 = new Box<>("Java");
        System.out.println(box1);
        //Параметризируем класс типом Integer
        Box<Integer> box2 = new Box<>(322);
        System.out.println(box2);
        //Параметризируем класс типом Boolean
        Box<Boolean> box3 = new Box<>(Boolean.FALSE);
        System.out.println(box3);
    }
}