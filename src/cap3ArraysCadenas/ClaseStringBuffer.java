package cap3ArraysCadenas;

public class ClaseStringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hola");

        stringBuffer.append(" Mundo");
        System.out.println("Después de append(): " + stringBuffer);

        stringBuffer.insert(5, "Amigo ");
        System.out.println("Después de insert(): " + stringBuffer);

        stringBuffer.replace(5, 11, "Querido ");
        System.out.println("Después de replace(): " + stringBuffer);

        stringBuffer.delete(0, 5);
        System.out.println("Después de delete(): " + stringBuffer);

        stringBuffer.reverse();
        System.out.println("Después de reverse(): " + stringBuffer);
    }
}
