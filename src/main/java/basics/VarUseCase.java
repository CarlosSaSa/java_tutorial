package basics;

public class VarUseCase {

    // The keyword var is used for typing inference, example
    public static void main(String[] args) {
        var name = "Hello world";
        System.out.println("Value of var (String) => " + name + " with datatype => " + name.getClass() );

        // With double
        var lat = 1011.1212;
        System.out.println("Value of var (Double) => " + lat + " with datatype => " + ( ( Object) lat).getClass() );


    }


}
