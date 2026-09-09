import java.io.FileReader;
import java.io.FileNotFoundException;
public class ExemploChecked {
public static void main(String[] args) {
try {
FileReader arquivo = new FileReader("dados.txt");
} catch (FileNotFoundException e) {
System.out.println("Arquivo não encontrado.");
}
}
}