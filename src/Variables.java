/**
 * class name: Variables.java
 * author: isa-stella barraza
 * date: May 26 2022
 * version: 1.0
 * description: This program will display summary of primitive data types.
 * source: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * direction: 1) read the source material
 *            2) summary of primitive data types: byte, short, int, long, float,
 *            double, boolean, char (2 lines per each type)
 *
 */
public class Variables
{
    public static void main(String[] args)
    {
        System.out.println("Summary of The Primitive Data Types");
        System.out.println("A Byte is an 8-bit signed two's complement integer. It is useful for saving memory in large arrays.");
        System.out.println("A Short data type is a 16-bit signed two's complement integer. You can use a short to save memory in large arrays.");
        System.out.println("The Int data type is a 32-bit signed two' complement integer.");
        System.out.printIn("The Long data type is a 64-bit two's complement integer. Use this data type when you need a range of values wider than those provided by int.");
        System.out.println("The Float data type is a single-precision 32-bit IEEE 754 floating point. Use a float if you need to save memory in large arrays of floating point numbers.");
        System.out.println("The Double data type a double-precision 64-bit IEEE 754 floating point. This data type should never be used for precise values.");
        System.out.println("The Boolean data type only uses true or false values. Use this data type for simple flags that track true/false conditions.");
        System.out.println("The Char data type is a single 16-bit Unicode character. It stores character data in a fixed-length field")
    }

}
