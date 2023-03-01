public class MultiplicarPor2Command implements Command{
    @Override
    public int execute(int counter){
        return counter * 2;
    }
    public int unexecute(int counter){
        return counter / 2;
    }
}