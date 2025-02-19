//Write a java program for  Unboxing.(all types).

package anudip.ANPD0453;

public class UnBoxing {
    public static void main(String[] args) {
        System.out.println("Unboxing");
        
        // Wrapper class objects
        Integer intObj = new Integer(12);
        Float floatObj = new Float(55.5f);
        Character charObj = new Character('A');
        Double doubleObj = new Double(89.3);
        Long longObj = new Long(100L);
        Byte byteObj = new Byte((byte) 15);
        Boolean boolObj = new Boolean(false);
        Short shortObj = new Short((short) 35);

        // Converting wrapper objects
        int i = intObj.intValue();
        float f = floatObj.floatValue();
        char c = charObj.charValue();
        double d = doubleObj.doubleValue();
        long l = longObj.longValue();
        byte b = byteObj.byteValue();
        boolean bool = boolObj.booleanValue();
        short s = shortObj.shortValue();

        // Displaying primitive values
        System.out.println("Integer Value: " + i);
        System.out.println("Float Value: " + f);
        System.out.println("Character Value: " + c);
        System.out.println("Double Value: " + d);
        System.out.println("Long Value: " + l);
        System.out.println("Byte Value: " + b);
        System.out.println("Boolean Value: " + bool);
        System.out.println("Short Value: " + s);
    }
}

/*output
Unboxing
Integer Value: 12
Float Value: 55.5
Character Value: A
Double Value: 89.3
Long Value: 100
Byte Value: 15
Boolean Value: false
Short Value: 35
*/