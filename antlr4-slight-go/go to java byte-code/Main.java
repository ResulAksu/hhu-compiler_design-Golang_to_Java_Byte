
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

                String co = args[0];

                if(co.equals("-compile")) {
                    // Open the input file stream
                    String input = readFile(args[1]);
                    CharStream codePointCharStream = CharStreams.fromString(input);

                    // Create a lexer that feeds off of input CharStream
                    Lexer lexer = new ExprLexer(codePointCharStream);

                    // Create a buffer of tokens pulled from the lexer
                    CommonTokenStream tokens = new CommonTokenStream(lexer);

                    // Create a parser that feeds off the tokens buffer
                    Expr parser = new Expr(tokens);

                    // Begin parsing at rule prog
                    ParseTree tree = parser.prog();

                    if(parser.getNumberOfSyntaxErrors() > 0){
                        System.err.println("Errors in Parser");
                        return;
                    }

                    Typechecker typechecker = new Typechecker();
                    typechecker.visit(tree);
                    Map<String,Integer> m = typechecker.getLocalsCount();
                    String className = changeInput(args[1]);
                    List<Exception> exceptions = typechecker.getExceptionList();
                    if (!exceptions.isEmpty()) {
                        System.err.println("Typechecking Errors: ");
                        for (Exception exc : exceptions) {
                            System.err.println(exc.getMessage());
                        }
                    }else{
                        CodeGenerator codeGenerator = new CodeGenerator(m, className);
                        codeGenerator.visit(tree);

                        try {
                            writeInFile(codeGenerator.getCode(), className);
                        }catch (IOException e){
                            e.printStackTrace();
                        }

                    }
                } else if (co.equals("-liveness")) {
                    // Open the input file stream
                    String input = readFile(args[1]);
                    CharStream codePointCharStream = CharStreams.fromString(input);

                    // Create a lexer that feeds off of input CharStream
                    Lexer lexer = new ExprLexer(codePointCharStream);

                    // Create a buffer of tokens pulled from the lexer
                    CommonTokenStream tokens = new CommonTokenStream(lexer);

                    // Create a parser that feeds off the tokens buffer
                    Expr parser = new Expr(tokens);

                    // Begin parsing at rule prog
                    ParseTree tree = parser.prog();

                    if(parser.getNumberOfSyntaxErrors() > 0){
                        System.err.println("Errors in Parser");
                        return;
                    }

                    Typechecker typechecker = new Typechecker();
                    typechecker.visit(tree);
                    int register = typechecker.getRegistercount();
                    List<Exception> exceptions = typechecker.getExceptionList();
                    if (!exceptions.isEmpty()) {
                        System.err.println("Typechecking Errors: ");
                        for (Exception exc : exceptions) {
                            System.err.println(exc.getMessage());
                        }
                    }
                    System.out.println("Register: "+register);
                }


    }

    private static String changeInput(String input){
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();

        for (char c:
             chars) {
            if(c == '.'){
                break;
            }
            sb.append(c);
        }
    return sb.toString();
    }

    private static void writeInFile(String code,String name) throws IOException {
        String fileName = name+".j";
        File myObj = new File(fileName);
        myObj.createNewFile();
        FileWriter fw = new FileWriter(myObj);
        fw.write(code);
        fw.flush();
        fw.close();

    }

    public static String readFile(String fileName) {
            String fileContent = "";
            
            try
            {
            byte[] bytes = Files.readAllBytes(Paths.get(fileName));
            fileContent = new String (bytes);
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
            return fileContent+"\n";
        }
    }


