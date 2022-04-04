
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.*;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream("C:\\Users\\D_Lia\\Desktop\\yapisLab\\Yapis\\input"));
            ELexer lexer = new ELexer(input);
            EParser parser = new EParser(new CommonTokenStream(lexer));

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream oldERR = System.err;
            System.setErr(new PrintStream(byteArrayOutputStream));
            ParseTree tree = parser.global_program();
            if (!byteArrayOutputStream.toString().equalsIgnoreCase("")) {
                System.setErr(oldERR);
                JOptionPane.showMessageDialog(null, "Lexer error: " + byteArrayOutputStream.toString());
                return;
            }
            System.setErr(oldERR);
            EVisitor listVisitor = new MyVisitor();
            String output = (String) listVisitor.visit(tree);
            System.out.print(output);
            FileWriter fileWriter = new FileWriter("RunProgram.java");
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
