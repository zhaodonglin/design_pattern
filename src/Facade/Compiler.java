package Facade;

/**
 * Created by 10098565 on 2016/9/7.
 */
public class Compiler {
    private Parser parser;
    private Scanner scanner;
    private Synthesizer synthesizer;

    public Compiler() {
        this.parser = new Parser();
        this.scanner = new Scanner();
        this.synthesizer = new Synthesizer();
    }

    public void Compile(){
        parser.parse();
        scanner.scan();
        synthesizer.synthesize();
    }
}
