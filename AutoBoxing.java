//Write  a java program for Autoboxing.(All Primitive Types)

package anudip.ANPD0453;

public class AutoBoxing {
    public static void main(String[] args) {
        
        // Primitive types
        int var = 25;
        float fvar = 14.5f;
        char cvar = 'M';
        double dvar = 30.6;
        long lvar = 101L;
        byte bvar = 9;
        boolean boolvar = true;
        short svar = 11;

        // Converting primitive types 
        Integer i = Integer.valueOf(var);
        Float f = Float.valueOf(fvar);
        Character c = Character.valueOf(cvar);
        Double d = Double.valueOf(dvar);
        Long l = Long.valueOf(lvar);
        Byte b = Byte.valueOf(bvar);
        Boolean bool = Boolean.valueOf(boolvar);
        Short s = Short.valueOf(svar);

        // Displaying Wrapper class objects
        System.out.println("Integer Object: " + i);
        System.out.println("Float Object: " + f);
        System.out.println("Character Object: " + c);
        System.out.println("Double Object: " + d);
        System.out.println("Long Object: " + l);
        System.out.println("Byte Object: " + b);
        System.out.println("Boolean Object: " + bool);
        System.out.println("Short Object: " + s);
    }
}

/*output
Integer Object: 25
Float Object: 14.5
Character Object: M
Double Object: 30.6
Long Object: 101
Byte Object: 9
Boolean Object: true
Short Object: 11
*/