public class Incrementar10Command implements Command{
    @Override
    public int execute(int counter){
        return counter + 10;
    }
    public int unexecute(int counter){
        return counter - 10;
    }
}
