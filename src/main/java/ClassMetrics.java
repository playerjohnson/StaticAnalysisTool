import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.ClassReader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by nw91 on 23/10/2015.
 */
public class ClassMetrics {

    public static void main(String[] args) throws IOException {
        InputStream classStream = ClassMetrics.class.getResourceAsStream(args[0]);
        ClassReader cr = new ClassReader(classStream);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);
        printClassDetails(cn);
    }

    private static void printClassDetails(ClassNode cn) {
        System.out.println("CLASS INFO");
        System.out.println(getClassDetails(cn));
        System.out.println("-----------------\nMETHOD INFO");
        for(Object mn : cn.methods){
            System.out.println(getMethodDetails((MethodNode)mn));
        }
        System.out.println("-----------------\nCONTROL FLOW GRAPHS");
        for(Object mn : cn.methods){
            System.out.println(getControlFlowGraph((MethodNode)mn));
        }
    }

    /**
     *Try to obtain the following:
     * Method name.
     * Number of instructions.
     *
     * @param mn
     * @return
     */
    private static String getMethodDetails(MethodNode mn) {
        //TODO fill this in!
        return "No information";

    }

    /**
     * Try to obtain the control flow graph for a method.
     * Represent this graph textually. I.e. for each edge write A -> B, on a separate line.
     * Use some of the functionality built into ASM to do this.
     *
     * @param mn
     * @return
     */
    private static String getControlFlowGraph(MethodNode mn) {
        //TODO fill this in!
        return "No information";

    }

    /**
     * Try to obtain the following:
     * Class name.
     * Number of methods.
     * Number of attributes.
     * @param cn
     * @return
     */
    private static String getClassDetails(ClassNode cn) {
        //TODO fill this in!
        return "No information";
    }
}
